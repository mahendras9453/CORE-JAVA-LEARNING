public class Aboutit {
     /*
      the process of creating a class by hiding the implementation  details of an object 's  operation and by providing necessary information to the user programmer for accessing this
      object's operations is called abstraction.
        What are the rule we must  fallow in developing abstraction?
          1 . The method must not have body {}
          it must ends with; and must contain abstract keyword
          else it leads to CE
          2. If a class contains abstract method,
          this class must be declared as abstract else it leads CE.
          3.  The subclass from an  abstract class is created
          by using keyword 'extends'.
          4. The subclass of an abstract class must override
          all abstract method available in this abstract class
          or must declare it as abstract else its leads to CE
          5. We can not instantiate an abstract class,
          it leads to CE, because it is not fully implemented.

       why abstraction ?
        -  Abstraction hide the bigger picture of the object
        - Abstraction provides 100% strong encapsulation
        - Abstraction forces all subclasses to implement the method
        - abstraction provides 100% RP/DB between user class and subclasses
         _ if you  achieve 100% SE , LC and RP,
           you must develop your object start with abstraction
           then automatically all OOp concepts class , object , Encapsulation , inheritance ,
           polymorphism fallowing by SE , LC and RP are implemented and your project becomes highly scalable and extensable

      */
}
class test01 {
    public static void main(String[] args) {
     //   A a1 = new A();// R #3
        //a1.m1();
         A8 a1;
          a1 = new B7();
          a1.m1();
    }
}
     abstract class A8{ // R # 2
         abstract void m1();// R # 1
     }
     class B7 extends A8{ //R # 4
            void m1(){
                System.out.println();
            } //r # 5
     }


