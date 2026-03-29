public class finalkw {
    /*
     final kw, final var, final method,final class
     1) the keyword final is a modifier keyword. It is used for creating final variable , final method, final class .
     Basically it is used for creating constant member.
     2) we can apply final Keyword to
       >>> All 4 types of varaiable
       >>>> concrete method
       >>>> concrete class
       3)  if we apply final keyword to  a variable, we can not modify it values
       4)  if we apply final keyword to  a method , we can not override it in subclass
       5) if we  apply final keyword to a class
       we can not create subclass deriving from this class


     */
    class Example{
        static final int a=10;
        int x=20;
        static void m1(int p){
            int q=40;
            //a=15; not allowed


        }

    }
    // initializing final parameter and final LV is optional
    // initializing class level final variable (SFv and NSFV) is mandatory
    class sample1{
        //static final int a;
       // final int x;
        void m1(final int p){
            final int q;
        }
    }
}
/* we must initialize SFV
1. either in its declaration or
2. in  SB
 */
class AB1{
    static final int a=10;
    static final int b;
   // static final int c;
    static {
        //a=20; CE
        b=20;
    }
    static {
        //b=70; CE
    }
    static void m1(){
       // c=40; NAlloed beacuse assignment
    }

}