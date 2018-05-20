package ISP;

public class PrinterHP implements Printer {
    public void Print(Document d) {
        System.out.println("Print the text from the document: " + d);
    }
}