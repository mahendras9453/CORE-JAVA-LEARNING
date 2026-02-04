public class Increment_op {
    public static void main(String[] args) {
        /*
         it is of two types
         1) Pre increment
         2) Post increment
         if we use ++ before op we will call it  pre increment
          if we use ++  after op we will call it  post increment

         */
        int a=5;
        int b=6;
        ++a;
        System.out.println(a);
        b++;
        System.out.println(b);
        /*
        they give same result but in same line value will be different
         */
        int c=10;
        ++c;
        System.out.println(c);
        int d=10;
        System.out.println(d++);// first used then in next line increase
        System.out.println(d);
        /*
        in an expression ++a  means we must use increase the value clear
        in a++ after excuted either in same expression or in the next expression we must used increased value
        in ++a
        1) increase
        2) read the increase value
        3) return/use the value
        ina++
        1) Read the original value
        2) Increase
        3)return/use the original value
         */
        int x=10;
        int y=++x;
        System.out.println(x);//11
        System.out.println(y);//11
        x=10;
        y=x++;
        System.out.println(x);//11
        System.out.println(y);//10
        int k=1;
        k=k++;
        System.out.println(k);//1
        x=1;
        y = x++ + ++x;
        System.out.println(x);//3
        System.out.println(y);//4
        x=1;
        y=x++ + ++x + x++ + x-- + --x + ++x;
        System.out.println(x);//3
        System.out.println(y);//16
        int[] z ={5,10,15};
        int i=0,num;
        num=z[++i] + ++i + (++i);
        System.out.println(i);//3
        System.out.println(num);//15





    }
}
