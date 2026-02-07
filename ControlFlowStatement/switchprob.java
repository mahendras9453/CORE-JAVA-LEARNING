import java.util.Scanner;

public class switchprob {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Char to check it weather it is vowel or constant");
        char c=sc.nextLine().toUpperCase().charAt(0);
        switch (c){
            case 'A' :

            case  'E':

            case 'I' :

            case 'O' :

            case 'U' :
                System.out.println("vowel");
                break  ;
            default:
                System.out.println("consonant");

        }
    }
}
