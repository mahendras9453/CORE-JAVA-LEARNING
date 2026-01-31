import java.util.*;
public class Readname_using_sc {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter your name;\t");
        //String c=scn.next();// here do not use int
       // System.out.println("Your name first word is: \t"+c);
        /*
        but if you only next then itt will return the only one word
        to return whole line we should use the next Line
         */
        String s=scn.nextLine();


        System.out.println("Your name is:\t" +s);
    }
}
