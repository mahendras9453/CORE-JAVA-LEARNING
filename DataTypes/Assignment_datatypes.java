public class Assignment_datatypes {
    public static void main(String[] args) {
        Bankaccount info= new Bankaccount();
        info.bankname= "Bank of baroda";
        info.branchname="Delhi Branch";
        info.accnumber= 293749450234873L;
        info.accbalance=7489749;
        Bankaccount info2= new Bankaccount();
        info2.bankname= "Bank of India";
        info2.branchname="Noida";
        info2.accnumber= 293749452976873L;
        info2.accbalance=820949;

        System.out.println("Bankname:\t\t\t"          +info.bankname);
        System.out.println("Branchname:\t\t\t"        +info.branchname);
        System.out.println("Account Number:\t\t"      +info.accnumber);
        System.out.println("Account Balance:\t" +"$"+ +info.accbalance);
        /* output
        Bankname:			Bank of baroda
        Branchname:			Delhi Branch
        Account Number:		293749450234873
        Account Balance:	    $7489749.0


         */

        System.out.println("\nBankname:\t\t\t"          +info2.bankname);
        System.out.println("Branchname:\t\t\t"          +info2.branchname);
        System.out.println("Account Number:\t\t"        +info2.accnumber);
        System.out.println("Account Balance:\t" +"$"+   +info2.accbalance);
        /* output
        Bankname:			Bank of India
        Branchname:			Noida
        Account Number:		293749452976873
         Account Balance:	$820949.0

         */

    }
    static class Bankaccount {
        String    bankname;
        String    branchname;
        Long      accnumber;
        String    accholdername;
        double      accbalance;



    }
}
