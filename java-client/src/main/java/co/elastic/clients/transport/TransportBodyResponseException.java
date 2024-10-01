package co.elastic.clients.transport;

import co.elastic.clients.transport.http.TransportHttpClient;

import javax.annotation.Nullable;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TransportBodyResponseException extends TransportException {

    private String originalBody;

    public TransportBodyResponseException(InputStream originalBody, TransportHttpClient.Response response, String message, String endpointId) {
        this(originalBody, response, message, endpointId, null);
    }

    public TransportBodyResponseException(InputStream originalBody,TransportHttpClient.Response response, String message, String endpointId,
                              Throwable cause) {
        super(response, message, endpointId, cause);
        try {
            if (originalBody != null) {
                StringBuilder sb = new StringBuilder();
                BufferedReader br = new BufferedReader(new InputStreamReader(originalBody));
                String read;

                while ((read=br.readLine()) != null) {
                    sb.append(read);
                }

                br.close();
                this.originalBody = sb.toString();
                // Closing original body input stream
                originalBody.close();
            }

            // Make sure the response is closed to free up resources.
            response.close();
        } catch (Exception e) {
            this.addSuppressed(e);
        }
    }

    /**
     * The original response body, before json deserialization.
     */
    @Nullable
    public String originalBody() {
        return originalBody;
    }
}
