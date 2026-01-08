package co.elastic.clients.elasticsearch._helpers.vector;

import java.nio.ByteBuffer;
import java.util.Base64;

/**
 * Utility class that can be extended to be used as vector type document,
 * which will translate float array vectors in a base64 format accepted by Elasticsearch version 9.3+,
 * with increased ingestion performance
 * <p>
 * Check {@link Base64VectorTest} for example usage
 */
public class AbstractBase64VectorDocument {
    private String vector;

    public void setVector(float[] vec) {
        ByteBuffer buff = ByteBuffer.allocate(Float.BYTES * vec.length);
        for (int i = 0; i < vec.length; i++) {
            buff.putFloat(vec[i]);
        }
        this.vector = Base64.getEncoder().encodeToString(buff.array());
    }

    public void setVector(String vec) {
        this.vector = vec;
    }

    public String getVector() {
        return vector;
    }
}
