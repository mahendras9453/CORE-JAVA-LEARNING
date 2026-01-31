
import java.util.*;
public class scanner_use {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the Total Marks");
        int marks = scn.nextInt();
        scn.nextLine();// reading enter key characters  and making scanner object empty
        System.out.println("Enter the Student Name: ");
        String name =scn.nextLine();



        System.out.println("Name of the Student is :" + name);
        System.out.println("Marks is: " +marks);


    }
}
