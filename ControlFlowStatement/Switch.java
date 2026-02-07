import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
        if else  ladder execution is slow because it reaches to the last condition after checking the preivious condition
         to overcome this we use switch CFO
         switch is one fof the CFO it is used for developing a choice based application or menu-driven application
           switch syntex
            switch(arg){

             case label1:
             // some other statements
             break;
              case label2:
             // some other statements
             break;
             default:
             // common statements
             switch arg must be int/char/byte/short type
           from java 5 version we can use wrapper classes int,byte,short,char,enum
           from java 7 version on words string object is also allow
         */
        //develop a program to read week day number from keyword
        // print the day name based on the given number
        // if wrong number is entered print "wrong value enter between 1-7"

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number between 1-7 to gets day name");
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("today is Sunday");
                break ;
            case 2:
                System.out.println("today is Monday");
                break ;
            case 3:
                System.out.println("today is Tuesday");
                break ;
            case 4:
                System.out.println("today is wednesday");
                break ;
            case 5:
                System.out.println("today is Thursday");
                break ;
            case 6:
                System.out.println("today is Friday");
                break ;
            case 7:
                System.out.println("today is Saturday");
                break ;
            default:
                System.out.println("wrong value enter between 1-7");






        }

    }
}
