import java.util.Scanner;

public class Ternary_op {
    public static void main(String[] args) {


    /*
    ?  and :  is called ternary op. it is also called conditional op.
    it shortcut of writing if else statement
    Syntax

        boolean exp ? exp1      : exp2
     */
        int a=8;
        System.out.println(true ? false ? 10 :a<20 ? a+25 :45 : 50);






        // write a program to verify even or add
        Scanner src= new Scanner(System.in);
        System.out.println("Enter any number  +tive number to check the number is odd or even ");
        int num=src.nextInt();
        System.out.println(num%2==0 ? num+ " is  even"  : num +" is odd");

    }
}
