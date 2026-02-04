public class Decrement_op {
    public  static void main(String[] args) {
        /*
         it is of two types
         1) Pre decrement
         2) Post decrement
         if we use -- before op we will call it  pre decrement
          if we use --  after op we will call it  post decrement

         */
        int a = 5;
        int b = 6;
        --a;
        System.out.println(a);
        b--;
        System.out.println(b);
        /*
        they give same result but in same line value will be different
         */
        int c = 10;
        --c;
        System.out.println(c);
        int d = 10;
        System.out.println(d--);// first used then in next line decrease
        System.out.println(d);
        /*
        in an expression --a  means we must use decrease the value clear
        in a-- after executed either in same expression or in the next expression we must use decrease value
        in --a
        1) decrease
        2) read the decrease value
        3) return/use the value
        ina--
        1) Read the original value
        2) decrease
        3)return/use the original value
         */
        int x = 10;
        int y = --x;
        System.out.println(x);//9
        System.out.println(y);//9
        x = 10;
        y = x--;
        System.out.println(x);//9
        System.out.println(y);//10
    }
}
