
package org.veupathdb.service.eda.generated.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Consumer;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.StreamingOutput;

public class EntityCountPostResponseStream extends EntityCountPostResponseImpl implements StreamingOutput {

  private final Consumer<OutputStream> _streamer;

  public EntityCountPostResponseStream(Consumer<OutputStream> streamer) {
    _streamer = streamer;
  }

  @Override
  public void write(OutputStream output) throws IOException, WebApplicationException {
    _streamer.accept(output);
  }

}

