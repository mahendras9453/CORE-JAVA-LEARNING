public class Relational_op {
    public static void main(String[] args) {
       /*
          Relational Operator    (5)      ...:  < > <= >=  instanceof
          -these  are the binary operator
          - these operator are ment for performing the validation
        */
        int a=10;
        int b=20;
          boolean bo=a<b;
        System.out.println(bo);//true
        bo=a<=b;
        System.out.println(bo);// true
        System.out.println();
        /*
         we can not apply these op on boolean , string ,array object and class object .

         */
        System.out.println('a' >'b'); // false
        int[] ia1={3,4,5};
        int[] ia2= {2,4,6};
        //System.out.println(ia1<ia2); not allowed
        System.out.println(ia1[0] > ia2[0]);//true
        //10<20  CE : this is not the statement
        boolean bo1=10<20;
        System.out.println(bo1);//true
         a=1;
         b=2;
        System.out.println(a+b < a-b);// false
       // System.out.println(a<b < a>b); CE
        //System.out.println((a<b) < (a>b)); CE
/*
 Instanceof operator
                    It is used  for object type checking op
                    it is used for weather is of given class type or not
                    if yes returns true  if no return false


         A a3 = new A();
         Sting s1= new String();
         object o1 = new Sting ();
        System.out.println(a3 instanceof A);  //  true
        System.out.println(s1 instanceof String);// true
        System.out.println(o1 instanceof A);// false
        System.out.println(o1 instanceof String);// true
         left operand must be -----> a variable /object
         right operand must be ------> a class name


 */

    }
}
