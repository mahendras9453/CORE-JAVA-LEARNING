public class About_loops {
    public static void main(String[] args) {
        /*
        A loop is a one of the control flow statements,
        it is used for executing a block of statements repeatedly
        until condition is false
        java support three loop statements
        1) while
        2) do  while
        3) for and for each ..> [for(;;) and for(:)]
        while >> syntax
        while(boolean condition){
        ------------------------
        ------------------ rules: this one statement must not be variable declaration
        -----------------------
        }

         */
        // write an program to print your name 5 times using while loop

             int n=5;
           while(n!=0){

         System.out.println("mahendra");
           n--;
    }
            /*
            problems of while loop
           - it can not execute statements at least once without checking condition.
           - var dec,checking condition , and incr or decr will be at diff places.hence there is a chance we forget incr  or decr

             */
            // above program with do .. while
            int a=1;
            do{

                System.out.println("mahendra");
                a++;
            } while(a<=5);
            // common problem in both loop is there is a chance we may forget to increase or decrease the var value
        // the variable is used in condition is not destroyed automitically


    }
}
