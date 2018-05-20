package ISP;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<String> documents = new ArrayList<>();

    void addDocument(String text) {
        documents.add(text);
    }

    @Override
    public String toString() {
        return String.join(", ", documents);
    }
}
