package org.occiware.clouddesigner.occi.cloud.connector.cloudproviders;

import java.io.Closeable;
import java.io.IOException;
import org.occiware.clouddesigner.occi.cloud.connector.cloudproviders.IaaSHandler;

@SuppressWarnings("all")
public class JcloudsGCE extends IaaSHandler implements Closeable {
  @Override
  public void close() throws IOException {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
