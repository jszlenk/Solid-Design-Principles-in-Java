package SPR;

import java.io.PrintStream;

class Persistence {
    void saveToFile(Note note, String filename) throws Exception {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(note.toString());
        }
    }
}