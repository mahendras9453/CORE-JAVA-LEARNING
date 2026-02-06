public class Bitwise_op {
    public static void main(String[] args) {
         /*
          bitwise and (&)                    bitwise or  (|)             bit wise X -or (^)
          op1      op2        res           op1     op2    res          op1    op2    res
          true      true      true          true   true   true         true   true    false
           true    false     false         true   false   true         true   false  true
           false    true     false         false  true    true         false   true  true
           false    false   false          false  false   false       false   false false
                 true is taken as 1
                 and false is taken as 0
                 we can not apply these op on the floating point number, string,array and class.

          */
        System.out.println(5|6);//7     // divide the number until we gwt thw quotient 1  5(101)
        System.out.println(5&6);//4
        System.out.println(5^6);//3
        System.out.println(5L^6L);//3
        System.out.println('a' & 'b');//96
        System.out.println('a' | 'b');//99
        System.out.println('a'  ^ 'b');//3
        //System.out.println(5f^6); not allowed
      //  System.out.println(m1() && m2());// from m1 false second not executed
       // System.out.println(m2() && m1());//  from m1 m2 false
      //  System.out.println(m1() & m2());// from m1  m2  false
      //  System.out.println(m2() && m1())// from m1 m2 false
        /*
        Bitwise compliment (~) op
         unary operand
         it is used for complementing( changing sign) either by increasing 1 or decreasing 1 based on the number sign
           for +ve integer
           =>-(number+1)
           for -ve integer
           =>  +(number-1)
           it can be applied only int and char
         */
        System.out.println(~6);//-7
        System.out.println(~'a');//-98
        System.out.println(~-'a');//96
       // System.out.println(~6.0); not allowed
    }
}
