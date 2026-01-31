import java.util.Scanner;

public class Scanner_method {
    public static void main(String[] args) {
        //Now learn the code of the Addition of the two number using input from keyboard with scanner class
        System.out.println("Enter first Number");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println("Enter Second Number");
        int b =scn.nextInt();
        int c=a+b;
        System.out.println("addition is:\t"+c);
    }
}
