public class Aboutpoly {
    /*
     Providing multiple implementation to same operation based on sub type and
     based on diff type of values is called polymorphism.
      How can we develop polymorphism?
      1) Method Overriding
      2) Method Overloading


     */
}
// method overloading polymorphism
class Bank {
    void deposit(double cash){
        System.out.println( cash +"deposit(cash) is executed");
    }
    void deposit (String cheque){
        System.out.println( "deposit(cash) is executed");
    }

}
class banktest{
    public static void main(String[] args) {
        Bank s=new Bank();
        s.deposit(10000);// automatically call based on parameter
    }

}
