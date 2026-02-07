import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        /*
        if(boolean condition){
               ------(statement) // only one statement is allowed
               }
        else{
        statement
        }


         */

    // if(true); semicolon is also an statement
        System.out.println("hi");
        System.out.println();
// Develop an program to read a number from the keyboard
        // if  the number is +tive number print positive
        //else print -ve
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
            if(num==0){
                System.out.println(  num+" number is neutral");
            }
            else if(num<0){
                System.out.println(  num+" number is Negative");
            }
            else{
                System.out.println(  num+" number is Positive");
            }

    }
}
