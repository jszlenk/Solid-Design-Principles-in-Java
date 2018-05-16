package SPR;

import java.util.ArrayList;
import java.util.List;

class Note {
    private final List<String> comments = new ArrayList<>();
    private static int count = 0;

    void addComment(String text) {
        comments.add("" + (++count) + ": " + text);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), comments);
    }
}