package co.elastic.clients.elasticsearch._helpers.vector;

public final class CustomVectorDoc extends AbstractBase64VectorDocument {
    private String docid;
    private String title;
    private String text;

    public CustomVectorDoc() {
    }

    public CustomVectorDoc(String docid, String title, String text, float[] vector) {
        this.docid = docid;
        this.title = title;
        this.text = text;
        this.setVector(vector);
    }

    public CustomVectorDoc(String docid, String title, String text) {
        this.docid = docid;
        this.title = title;
        this.text = text;
    }

    public String getDocid() {
        return docid;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }
}
