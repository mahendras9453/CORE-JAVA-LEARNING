import java.sql.Types;

public class Typesofmethods {
    /*
                                Methods
               abstract  method                          Concrete method
                                              Static method                Non-static method

         ----   we will talk abstract after polymorphism topic-----
          Static And Non-static Method:
          Static :
          A method with declared with static keyword that is static method.
          When we need to develop and execute logic without using object or common to all objects then
          we must create method as static method.
          Non-static
          A method with declared without static keyword that is  non-static method.
          When we need to execute logic by using an object with the values available in this object,
          then we must create method as non-static method.

     */
    static void m1(){
        System.out.println("static m1");
    }
    void m2(){
        System.out.println("non-static m2");
    }

    public static void main(String[] args) {
        m1(); //static m1
        //m2();  m2() cannot be referenced from a static context
        Typesofmethods.m1(); //allowed
        //Typesofmethods.m2(); //not allowed
        Typesofmethods e1=new Typesofmethods();
        e1.m1(); //allowed
        e1.m2(); //allowed
        Typesofmethods e2=null;
        e2.m1();
        //e2.m2(); not allowed

    }
}
