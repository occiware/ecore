package org.occiware.clouddesigner.occi.cloud.connector;

import org.occiware.clouddesigner.occi.cloud.connector.MachineManager;
import org.occiware.clouddesigner.occi.cloud.impl.Machine_GCEImpl;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;

/**
 * This class implements executable Docker Machine on Google COmpute Engine.
 */
@SuppressWarnings("all")
public class ExecutableMachine_GCE extends Machine_GCEImpl {
  /**
   * The machine manager.
   */
  private final MachineManager manager = new MachineManager(this) {
    @Override
    public String getDriverName() {
      return "googlece";
    }
    
    @Override
    public void appendDriverParameters(final StringBuilder sb) {
      throw new UnsupportedOperationException();
    }
  };
  
  @Override
  public void start() {
    this.manager.start();
  }
  
  @Override
  public void stop(final StopMethod method) {
    this.manager.stop(method);
  }
  
  @Override
  public void restart(final RestartMethod method) {
    this.manager.restart(method);
  }
  
  @Override
  public void suspend(final SuspendMethod method) {
    this.manager.suspend(method);
  }
}
