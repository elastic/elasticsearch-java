package co.elastic.clients.json.jackson;

import jakarta.json.stream.JsonGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;

public class JacksonJsonpGeneratorTest extends Assert {
  JacksonJsonpGenerator jacksonJsonpGenerator;
  StringWriter sw;

  @Before
  public void setup(){
    sw = new StringWriter();
    jacksonJsonpGenerator= (JacksonJsonpGenerator) new JacksonJsonProvider().createGenerator(sw);
  }

  @Test
  public void testWriteBooleanTrue(){
    jacksonJsonpGenerator.writeStartObject();
    jacksonJsonpGenerator.write("test", true);
    jacksonJsonpGenerator.writeEnd();

    jacksonJsonpGenerator.flush();

    assertEquals("{\"test\":true}", sw.toString());
  }

  @Test
  public void testWriteBooleanFalse(){
    jacksonJsonpGenerator.writeStartObject();
    jacksonJsonpGenerator.write("test", false);
    jacksonJsonpGenerator.writeEnd();

    jacksonJsonpGenerator.flush();

    assertEquals("{\"test\":false}", sw.toString());
  }
}
