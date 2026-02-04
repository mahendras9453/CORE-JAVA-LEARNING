public class Compound_assign_op {
    public static void main(String[] args) {
        /*
         the combination of the = and other calculation operator is called the compound assignment operator
          Compound Operator  (11)       .....: += -= *= /= %= &= |= ^=

                                             <<= >>= >>>=
           when we need to increase or decrease  variable by  a given value and store the result in the same variable we can use CAO
         */
        int a=10;
        a+=5; // a=a+5;
        /*
        the advantage of CAO is
        1. It is shortcut operator we need to use variable name only one time
        2. It implicitly applies cast operator to destination variable type
         */
        System.out.println(a);//15
        /*
           it has last precedence
           all CAos are allowed to apply only one b,s,i,l,f,d and c type variable but not on
           boolean,[] and class type variables
         */
        a=10;
        a*=a+5;
        System.out.println(a);//150
        a=10;
        a*=++a;
        System.out.println(a);
         a=34;
         double d=20.5;
         d +=a;
        System.out.println(d);//54.5
        a+=d;
        System.out.println(a);//88
        d-=a;
        System.out.println(d);//-33.5
        a-=d;
        System.out.println(a);//121

    }
}
