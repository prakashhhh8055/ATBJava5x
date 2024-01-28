public class bankAccount {
    String bankName;
    String IFSC_Code;
    double balance;
    bankAccount() {
        bankName="SBI";
    }
    bankAccount(String bName,String bankCode ){
        this.bankName=bName;
        this.IFSC_Code=bankCode;

    }
    void printDetails(){
        System.out.println("The Bank Name is "+bankName);
        System.out.println("Bank IFSC Code is "+IFSC_Code);
        System.out.println("The Bank Balance is "+balance);
    }
}
