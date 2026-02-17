
import java.util.Scanner;

public class even_odd {
    /*
    Develop a program with a user defined method to take a number as an argument as an argument
     find whether it is even or odd and return result
     if ever return true ,else false;
     in calling method  print the message to user The given number is even or odd
     */
     static boolean m1(int num){
      return num%2==0;

      }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number to check that is even or odd");
        int num=sc.nextInt();
        System.out.println(m1(num)? num +" is even": num+" is odd");


    }

}
