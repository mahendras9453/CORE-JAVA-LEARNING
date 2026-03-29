public class Typesofpoly {
    /*
     Two types of  poly
     1. Compile time polymorphism/static binding/early binding
     2. Run Time polymorphism/dynamic binding /late binding
     */
}
class Example {
    static void m1() {
        System.out.println("Ex m1");
    }
    void m2(){
        System.out.println("");
    }
}
     class sample3 extends Example{
         static void m1(){
             System.out.println("sa m1");
         }
         void m2(){
             System.out.println("sa m2");
         }
     }
      class Test_typesofpoly{
          public static void main(String[] args) {
               Example e1= new sample3();
               e1.m1();//COmpile time Poly // Ex m1
              e1.m2();//Run time//sa m2
          }

}
