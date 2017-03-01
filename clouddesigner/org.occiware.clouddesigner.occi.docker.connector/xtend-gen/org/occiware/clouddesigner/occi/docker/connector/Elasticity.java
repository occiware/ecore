package org.occiware.clouddesigner.occi.docker.connector;

import java.text.NumberFormat;
import java.util.Locale;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.occiware.clouddesigner.occi.Resource;
import org.occiware.clouddesigner.occi.docker.connector.ExecutableContainer;
import org.occiware.clouddesigner.occi.docker.connector.dockerjava.cgroup.CPUManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class Elasticity {
  private static Logger LOGGER = LoggerFactory.getLogger(Elasticity.class);
  
  private Boolean update = Boolean.valueOf(false);
  
  public Elasticity() {
  }
  
  public void action(final CPUManager cpuManager, final String host, final String privateKey, final ExecutableContainer container) {
    try {
      NumberFormat nf = NumberFormat.getInstance(Locale.FRENCH);
      String _cpu_percent = container.getCpu_percent();
      Number _parse = nf.parse(_cpu_percent);
      float cpu_used = _parse.floatValue();
      if (((cpu_used > 90.0F) && (!(this.update).booleanValue()))) {
        cpuManager.setCPUValue(host, privateKey, container, "6");
        this.update = Boolean.valueOf(true);
        this.modifyResourceSet(container, Integer.valueOf(6));
        Elasticity.LOGGER.info("Elasticity action: 2 Cores was added!");
      }
      if (((cpu_used < 90.0F) && (this.update).booleanValue())) {
        cpuManager.setCPUValue(host, privateKey, container, "1");
        this.update = Boolean.valueOf(false);
        this.modifyResourceSet(container, Integer.valueOf(1));
        Elasticity.LOGGER.info("Elasticity action: x Cores was removed!");
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public synchronized void modifyResourceSet(final Resource resource, final Integer cores) {
    try {
      org.eclipse.emf.ecore.resource.Resource _eResource = resource.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(_resourceSet);
      Command cmd = new RecordingCommand(domain) {
        @Override
        protected void doExecute() {
          ((ExecutableContainer) resource).setCores((cores).intValue());
        }
      };
      try {
        CommandStack _commandStack = domain.getCommandStack();
        ((TransactionalCommandStack) _commandStack).execute(cmd, null);
      } catch (final Throwable _t) {
        if (_t instanceof RollbackException) {
          final RollbackException rbe = (RollbackException)_t;
          IStatus _status = rbe.getStatus();
          String _string = _status.toString();
          Elasticity.LOGGER.error(_string);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
