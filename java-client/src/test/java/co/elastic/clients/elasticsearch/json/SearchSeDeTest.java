package co.elastic.clients.elasticsearch.json;

import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import jakarta.json.stream.JsonParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class SearchSeDeTest extends Assert {

    @Test
    public void deserialize() {
        String json = "{\n" +
                "  \"size\": 9999,\n" +
                "  \"query\": {\n" +
                "    \"match_all\": {}\n" +
                "  },\n" +
                "  \"sort\": [\n" +
                "    {\n" +
                "      \"modify_time\": {\n" +
                "        \"order\": \"desc\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"track_total_hits\": 2147483647\n" +
                "}";

        JsonpMapper jsonpMapper = new JacksonJsonpMapper();
        JsonParser parser = jsonpMapper.jsonProvider().createParser(new StringReader(json));
        final SearchRequest deserialize = SearchRequest._DESERIALIZER.deserialize(parser, jsonpMapper);
        assertNotNull(deserialize);
    }
}
