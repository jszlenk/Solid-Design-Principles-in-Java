package SPR;

class Spr {
    public static void main(String[] args) throws Exception {
        Note note = new Note();
        note.addComment("First note");
        note.addComment("Second note");

        Persistence persistence = new Persistence();
        String filename = "notes.txt";
        persistence.saveToFile(note, filename);

        System.out.println(note);
        Runtime.getRuntime().exec("gedit " + filename);
    }
}