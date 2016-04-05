package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.io.Closeables;
import java.io.Closeable;
import java.io.IOException;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jclouds.ContextBuilder;
import org.jclouds.openstack.trove.v1.TroveApi;
import org.jclouds.openstack.trove.v1.domain.Flavor;
import org.jclouds.openstack.trove.v1.domain.Instance;
import org.jclouds.openstack.trove.v1.features.FlavorApi;
import org.jclouds.openstack.trove.v1.utils.TroveUtils;
import org.occiware.clouddesigner.occi.cloud.Machine_RackSpace;
import org.occiware.clouddesigner.occi.cloud.connector.cloudproviders.IaaSHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class JcloudsRackSpace extends IaaSHandler implements Closeable {
  private static Logger LOGGER = LoggerFactory.getLogger(JcloudsRackSpace.class);
  
  private Machine_RackSpace machine;
  
  private TroveApi context;
  
  public JcloudsRackSpace() {
  }
  
  public JcloudsRackSpace(final Machine_RackSpace machine) {
    this.machine = machine;
    TroveApi _createContext = this.createContext();
    this.context = _createContext;
  }
  
  /**
   * Initialize the context
   */
  public TroveApi createContext() {
    String _provider = this.machine.getProvider();
    ContextBuilder _newBuilder = ContextBuilder.newBuilder(_provider);
    String _username = this.machine.getUsername();
    String _api_key = this.machine.getApi_key();
    ContextBuilder _credentials = _newBuilder.credentials(_username, _api_key);
    TroveApi _buildApi = _credentials.<TroveApi>buildApi(TroveApi.class);
    this.context = _buildApi;
    JcloudsRackSpace.LOGGER.info("The context is created Successfully ..");
    return this.context;
  }
  
  public String launchMachine() {
    Instance instance = null;
    try {
      String _region = this.machine.getRegion();
      FlavorApi flavorApi = this.context.getFlavorApiForZone(_region);
      FluentIterable<Flavor> _list = flavorApi.list();
      Flavor flavor = Iterables.<Flavor>getFirst(_list, null);
      TroveUtils utils = new TroveUtils(this.context);
      String _region_1 = this.machine.getRegion();
      String _name = this.machine.getName();
      int _id = flavor.getId();
      String _plus = ("" + Integer.valueOf(_id));
      Instance _workingInstance = utils.getWorkingInstance(_region_1, _name, _plus, 1);
      instance = _workingInstance;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception exception = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return instance.getId();
  }
  
  @Override
  public void close() throws IOException {
    Closeables.close(this.context, true);
  }
}
