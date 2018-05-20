package ISP;

public class MultiFunctionMachine implements MultiFunctionDevice {
    private Printer printer;
    private Scanner scanner;
    private Fax fax;

    MultiFunctionMachine(Printer printer, Scanner scanner, Fax fax) {
        this.printer = printer;
        this.scanner = scanner;
        this.fax = fax;
    }

    public void Print(Document d) throws Exception {
        printer.Print(d);
    }

    public void Scan(Document d) throws Exception {
        scanner.Scan(d);
    }

    public void InternetFax(Document d) throws Exception {
        fax.InternetFax(d);
    }
}