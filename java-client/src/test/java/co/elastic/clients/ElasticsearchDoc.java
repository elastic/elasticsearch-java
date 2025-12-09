package co.elastic.clients;

import java.util.List;

public record ElasticsearchDoc(String docid, String title, String text, List<Float> emb) {
}
