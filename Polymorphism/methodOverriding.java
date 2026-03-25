public class methodOverriding {
/*
     Method overriding
     Providing new implementation to super class method in sub class according to this sub type requirements
     is called overriding.
     In method overriding we are redefining super class method in sub class to provide new implementation according to sub class requirement.

 */
}
class HDFCBank extends Bank{
    // method overrinding
    public void deposit(double cash){
        System.out.println(cash +"HDFCcash is deposited ");
    }
    void payInterst(){
        System.out.println("HDFC bank pay the interst ");
    }


    public static void main(String[] args) {
        HDFCBank s1=new HDFCBank();
        s1.deposit(1000);
        s1.deposit("83738");
        s1.payInterst();
        Bank s2=new HDFCBank();
        s2.deposit(1000);
        s2.deposit("297");
        //s2.payInterset(); gives error
    }
}
