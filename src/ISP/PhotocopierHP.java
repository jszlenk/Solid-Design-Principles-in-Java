package ISP;

class PhotocopierHP implements Printer, Scanner {
    public void Print(Document d) {
        System.out.println("Print the text from the document: " + d);
    }

    public void Scan(Document d) {
        System.out.println("Scan the text of the document: " + d);
    }
}