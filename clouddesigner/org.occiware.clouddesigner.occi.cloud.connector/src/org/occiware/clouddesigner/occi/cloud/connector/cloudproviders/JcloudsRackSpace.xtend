package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders

import com.google.common.collect.Iterables
import com.google.common.io.Closeables
import java.io.Closeable
import java.io.IOException
import org.jclouds.ContextBuilder
import org.jclouds.openstack.trove.v1.TroveApi
import org.jclouds.openstack.trove.v1.domain.Instance
import org.jclouds.openstack.trove.v1.utils.TroveUtils
import org.occiware.clouddesigner.occi.cloud.Machine_RackSpace
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class JcloudsRackSpace extends IaaSHandler implements Closeable {

	// Initialize logger for JcloudsOpenStack.
	private static Logger LOGGER = LoggerFactory.getLogger(typeof(JcloudsRackSpace))

	private var Machine_RackSpace machine;

	private var TroveApi context;

	new() {
	}

	new(Machine_RackSpace machine) {
		this.machine = machine
		this.context = createContext
	}

	/**
	 * Initialize the context
	 */
	def createContext() {
		context = ContextBuilder.newBuilder(this.machine.provider).credentials(this.machine.username,
			this.machine.api_key).buildApi(typeof(TroveApi))
		LOGGER.info("The context is created Successfully ..")

		return context
	}

	def String launchMachine() {
		var Instance instance = null
		try {
			var flavorApi = this.context.getFlavorApiForZone(this.machine.region)
			var flavor = Iterables.getFirst(flavorApi.list(), null)
			var TroveUtils utils = new TroveUtils(this.context)
			instance = utils.getWorkingInstance(this.machine.region, this.machine.name, "" + flavor.id, 1);

		} catch (Exception exception) {
		}
		return instance.id
	}

	override close() throws IOException {
		Closeables.close(this.context, true);
	}

}
