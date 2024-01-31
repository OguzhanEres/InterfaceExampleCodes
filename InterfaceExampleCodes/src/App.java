interface PrinterInterface {
    void Print();

}
interface ColoredPrinterInterface{
    void ColoredPrint();
}

interface ScannerInterface {
    void Scan();
}

interface FaxInterface {
    void Fax();
}

class Printer implements PrinterInterface{
    @Override
    public void Print() {
        System.out.println("Print Function");
    }


}

class CanonOffice extends Printer implements ScannerInterface, FaxInterface {
    @Override
    public void Print() {
        System.out.println("Print Function Canon Office");
    }

    @Override
    public void Scan() {
        System.out.println("Scan Function Canon Office");
    }

    @Override
    public void Fax() {
        System.out.println("Fax Function Canon Office");
    }
}

class CanonProfessional extends Printer implements ScannerInterface, ColoredPrinterInterface, FaxInterface{
    @Override
    public void Print() {
        System.out.println("Print Function Canon Proffessional");
    }

    @Override
    public void ColoredPrint(){
        System.out.println("Colored Print Function Canon Proffessional");
    }

    @Override
    public void Scan() {
        System.out.println("Scan Function Canon Proffessional");
    }

    @Override
    public void Fax() {
        System.out.println("Fax Function Canon Proffessional");
    }

}

class CanonBasic extends Printer implements ScannerInterface{
    @Override
    public void Print() {
        System.out.println("Print Function Canon Basic");
    }

    @Override
    public void Scan() {
        System.out.println("Scan Function Canon Basic");
    }

}

public class App {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.Print();

        CanonOffice canonOffice = new CanonOffice();
        canonOffice.Print();
        canonOffice.Scan();
        canonOffice.Fax();


        CanonProfessional canonProfessional = new CanonProfessional();
        canonProfessional.Print();
        canonProfessional.ColoredPrint();
        canonProfessional.Scan();
        canonProfessional.Fax();

        CanonBasic canonBasic = new CanonBasic();
        canonBasic.Print();
        canonBasic.Scan();
    }
}


