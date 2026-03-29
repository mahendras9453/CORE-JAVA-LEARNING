public class finalmethod {
    /*
     A method is declared with the keyword final  is called final method
      when we do not what  to hide or override super class method in su class we must declare a method in super class as final

      if we want to force all subclasses to use the same given logic of a method , we must declare this method as final

      Rule on final Mathod :
       we  can not hide or override  super class final method in sub class
        we can declare both static method and non static method  as final.

     */
}
class A{
    static final void m1(){
        System.out.println("A m1");
    }
    final void m2(){
        System.out.println("A m2");
    }
    static void m3(){
        System.out.println("A m3");
    }
    void m4(){
        System.out.println("A m4");
    }
}
class B extends A {
    //static final void m1(){
       // System.out.println("A m1");
   // }
  /*  final void m2(){
        System.out.println("A m2");
    }

   */
    static void m3(){
        System.out.println("B m3");

    }
    void m4(){
        System.out.println("B m4");
    }



   }
   class test_final{
       public static void main(String[] args) {
           B b1 =new B();
           b1.m1();
           b1.m2();
           b1.m4();
       }

   }
