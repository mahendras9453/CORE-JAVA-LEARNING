public  class variableHiding {
    /*
     what is variable hiding?
      create a SV or NSv in super class and in Sub class with the name is called variable hiding
       It is called variable hiding because
       when we access those Sv or NSv in subclass or by using subclass reference,
        the variable value is read and modify in subclass memory
        it means the sub cass variable hides the super class variable
         >> how we can access super class variable in subclass and in Test class by differentiating them from subclass variables?
         - Access hidden variable (super class variables) by using super class type reference
         1. either by using super class name
         2. or by using super keyword
         3. or by using super class type referenced variable
         In test class ( other class ) we can not use super keyword we can use only either super class or super class type referenced variable
         Inside subclass
         1. in SM we can differentiate PC var from cc  var  by using parent class name  or by using super clas type re vars.
     */
 }
     class A20{
        static int a=10;
        int x=20;

    }
    class B2 extends A20{
        static int a=30;
        int x=40;
          static void m1(){
            System.out.println(a);
            System.out.println(A20.a);
            B2 b1= new B2();
            A20 a1=b1;
            System.out.println(b1.x);
            System.out.println(a1.x);
        }
        void m2(){
            System.out.println( a+ " " + A20.a);
            System.out.println( a+ " " + super.x);

        }

        public static void main(String[] args) {
            m1();
            B2 b2 = new B2();
            b2.m2();



    }

}
