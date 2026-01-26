public class Printstatement {
    public static void main(String[] args) {
        /* In the java We have 3 print statement
        1st = print()     >it print the content in the same line
        2nd =println()    >first print the content then swift thr cursor to the next line
        3rd = printf()    > that is the c language print type introduced in java 5 version

         */
        System.out.print(10);
        System.out.println("Java");
        System.out.printf("%d",10);  // in this we have declare the  type and it should have the string first
        /*
        %d   =     for int
        %f   =     for float
        %s   =     for string
        %c   =     for chr
       */
        char n='A';
        System.out.printf("%d%f%s%c",10,2.5,"abs",n);
    }
}
