public class Arithmetic_op {
    public static void main(String[] args) {
       /*
         Arithmetic Operator (5)     .......:   _ + * / %
        */
        System.out.println(20+5);
        System.out.println(20-5);
        System.out.println(20*5);
        System.out.println(20/5);
        System.out.println(20%5);
        /*
        + is overloaded op
        It can be used as
        - Arithmetic op
        - concatenation  op
        If both operand are char or num and both it acts addition operator
        if at least one operand is string it acts as concatenation operator

         */
        System.out.println('a'+'b');
        System.out.println("50 "+70);
        System.out.println("a "+5);
        System.out.println(""+10+20);//205
        System.out.println(10+20+"");//30(string type)
       // System.out.println(""+10-20); not possible it throws error because concatenation is done in above bur here not possible
        System.out.println(""+(10-20));
        System.out.println(20+5.2);
       // System.out.println(20+true); not allowed CE
        System.out.println("Product : "+10*20);// allow * is first executed
        /*
        we can not apply arithmetic operation on boolean,array and class

         */
        //System.out.println(true+true); CE
       // System.out.println(new int[5]+new int[7]);CE
        //System.out.println(new Example()+ new Example());
        System.out.println("hi" +true); //allow
        System.out.println("true" +true);//allow
        //System.out.println(true +true+"true");CE
        System.out.println("hi" +new int[5]);//hi[I@7b23ec81
        /*
        Arithmetic operation precedence
        * / % has same precedence
        + - has same precedence
            byte+byte=int
             short +short=int
              char+char=int
               byte+short+char=int
                int+int=int
                long +long=long
                float + float=float
                double+double=double
                //boolean+boolean=CE
                long + float = float
                long + double= double

         */
        System.out.println(22/7*10*10);//300 int/int=int
        System.out.println(22F/7*10*10);//314.2857

        System.out.println(22D/7*10*10);//314.2857142857143
        System.out.println(1/2);//0
        System.out.println(0/2);//0

       // System.out.println(2/0); Run time error  exception
        System.out.println(2/1);//2
        System.out.println(2.0/0);//infinity
        System.out.println(-2.0/0);//-infinity
// in java we can not divide a int number by zero
        System.out.println(2/0.0);// infinity
        //System.out.println(0/0); exception
        System.out.println(0/0f);//naN
        System.out.println(0.0/0);//naN

        System.out.println(-0.0/0);//naN


    }
}
