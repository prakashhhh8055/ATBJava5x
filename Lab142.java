public class Lab142 {
    public static void main(String[] args) {
        bankAccount SBI=new bankAccount();
        SBI.printDetails();
        bankAccount HDFC=new bankAccount("HDFC","HDFC8055");
        HDFC.printDetails();
        bankAccount ICICI=new bankAccount("icici","ICICI9055");
        ICICI.printDetails();
    }
}
