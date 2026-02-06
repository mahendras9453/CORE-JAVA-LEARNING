public class Logical_op {
    public static void main(String[] args) {
        /*
        Logical Operator  (3)         .....: && || !
             && op                                       || op
        op1        op2       result               op1       op2       result
       true     true      true                  true       true    true
       true     false     false                  true       false   true
       false    true      false                 false      true    true
       false    false     false                 false      false   false


         */
        int a=7;
        boolean bo= ((a>+5) && (a<=10));// true
        System.out.println(bo);
        boolean bo2= ((a>+5) || (a<=10));// true
        System.out.println(bo2);
       // System.out.println(5 && 6);
        //  logical op can be applied only the boolean type value
        System.out.println(true && true);
        System.out.println(true ||true);
        int i=1;
        if(i++ ==1 && i--==0)
        {
            System.out.println("hii");
        }
        else{
            System.out.println("hello");
        }
        System.out.println(i);//1
        i=1;
        if(i++ ==1 || i--==0)
        {
            System.out.println("hii");
        }
        else{
            System.out.println("hello");
        }
        System.out.println(i);//2
/*
   not operator
   it is used for reversing boolean value true to false or false to true
 */
        System.out.println(!true );// false
        System.out.println(!false );// true
        System.out.println(!true||false&&true);//false
    }
}
