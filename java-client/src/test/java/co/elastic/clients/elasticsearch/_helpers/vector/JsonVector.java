package co.elastic.clients.elasticsearch._helpers.vector;

public record JsonVector(String docid, String title, String text, float[] emb) {
}
