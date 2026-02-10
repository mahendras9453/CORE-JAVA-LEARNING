public class program {
    public static void main(String[] args) {
        /*
          Develop a project t create RWO Bank account in PW with the values bankname,branchname,ifsc,accNum
          ,accHNAme,Balance.
          Create two accounts from the class BAnkAccount for the customers Mahendra and Astha with their values and print
          those values on console
         */
        BankAccount holder= new BankAccount();
        holder.bankname      =           "BOB";
        holder.branchname    =           "delhi";
        holder.ifsc          =           "BID0020836";
        holder.accnum        =            9839128382222938L;
        holder.accHName      =            "Mahendra";
        holder.balance       =             100.89;
        BankAccount holder1= new BankAccount();
        holder1.bankname     =             "BOB";
        holder1.branchname   =             "delhi";
        holder1.ifsc         =             "BID0020836";
        holder1.accnum       =              383026398318L;
        holder1.accHName     =             "Astha";
        holder1.balance      =              9279903;
        System.out.println(" Bank Name :\t\t\t"     +holder.bankname);
        System.out.println("Branch Name :\t\t\t"    +holder.branchname);
        System.out.println("IFSC code: \t\t\t\t"    +holder.ifsc);
        System.out.println("Account Number: \t\t"   +holder.accnum);
        System.out.println("Account Holder Name: \t"+holder.accHName);
        System.out.println("Balance: \t\t\t\t"      +holder.balance);

        System.out.println();
        System.out.println(" Bank Name :\t\t\t"     +holder1.bankname);
        System.out.println("Branch Name :\t\t\t"    +holder1.branchname);
        System.out.println("IFSC code: \t\t\t\t"    +holder1.ifsc);
        System.out.println("Account Number: \t\t"   +holder1.accnum);
        System.out.println("Account Holder Name: \t"+holder1.accHName);
        System.out.println("Balance: \t\t\t\t"      +holder1.balance);



    }
    static class BankAccount{
        String  bankname;
        String  branchname;
        String  ifsc;
        long    accnum;
        String  accHName;
        double  balance;
    }
}
/*
  In a programming world an object is a  instance of a class.
   a class is user defined data type,Blueprint of an object.
 */
