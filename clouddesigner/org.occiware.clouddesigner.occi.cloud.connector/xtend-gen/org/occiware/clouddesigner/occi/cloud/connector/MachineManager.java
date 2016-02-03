package org.occiware.clouddesigner.occi.cloud.connector;

import com.google.common.base.Objects;
import org.occiware.clouddesigner.occi.cloud.Machine;
import org.occiware.clouddesigner.occi.cloud.connector.ComputeStateMachine;
import org.occiware.clouddesigner.occi.infrastructure.RestartMethod;
import org.occiware.clouddesigner.occi.infrastructure.StopMethod;
import org.occiware.clouddesigner.occi.infrastructure.SuspendMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class implements an abstract Docker machine manager.
 */
@SuppressWarnings("all")
public abstract class MachineManager extends ComputeStateMachine<Machine> {
  private static Logger LOGGER = LoggerFactory.getLogger(MachineManager.class);
  
  /**
   * Construct a Docker machine manager for a given Docker machine.
   */
  public MachineManager(final Machine m) {
    super(m);
  }
  
  /**
   * Return the Docker machine driver name.
   */
  public abstract String getDriverName();
  
  /**
   * Append specific Docker machine driver parameters.
   */
  public abstract void appendDriverParameters(final StringBuilder sb);
  
  /**
   * Start a Docker machine.
   */
  @Override
  public void start_execute() {
    final StringBuilder command = new StringBuilder();
    StringBuilder _append = command.append("docker machine start ");
    String _name = this.compute.getName();
    StringBuilder _append_1 = _append.append(_name);
    StringBuilder _append_2 = _append_1.append(" --driver ");
    String _driverName = this.getDriverName();
    StringBuilder _append_3 = _append_2.append(_driverName);
    _append_3.append(" ");
    this.appendDriverParameters(command);
    String _string = command.toString();
    String _plus = ("EXECUTE COMMAND: " + _string);
    MachineManager.LOGGER.info(_plus);
  }
  
  /**
   * Stop a Docker machine.
   */
  @Override
  public void stop_execute(final StopMethod method) {
    boolean _equals = Objects.equal(method, StopMethod.GRACEFUL);
    if (_equals) {
    }
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine stop " + _name);
    MachineManager.LOGGER.info(_plus);
  }
  
  /**
   * Restart a Docker machine.
   */
  @Override
  public void restart_execute(final RestartMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine restart " + _name);
    MachineManager.LOGGER.info(_plus);
  }
  
  /**
   * Suspend a Docker machine.
   */
  @Override
  public void suspend_execute(final SuspendMethod method) {
    String _name = this.compute.getName();
    String _plus = ("EXECUTE COMMAND: docker machine suspend " + _name);
    MachineManager.LOGGER.info(_plus);
  }
}
