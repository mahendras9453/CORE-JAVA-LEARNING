public class Equality_op {
    public static void main(String[] args) {
        /*
        == and != are called equality op
        these two op are also known as relational op
        these are used for knowing to given operands exactly equal to or not

        ==   returns  true when operand are equal
        !=   return true when both operand are not equal
        both op can be applied on all type of operands num,char, strings, arr,class
        Primitive dt are compared by their values.
        in case of string ,arr, class objects it compares references of the object but not data
         */
        int a=10;
        int b=20;
        int c=20;
        System.out.println(a==b);// false
        System.out.println(a!=b); //true

        System.out.println(b==c);// true
        System.out.println(b!=c);// false
    }
}
