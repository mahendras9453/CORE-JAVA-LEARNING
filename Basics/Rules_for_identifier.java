public class Rules_for_identifier {
    public static void main(String[] args) {
        /*
        there are 7 rules for creating any identifier
        1. Identifier mus contain only:
             a: letters[a-z or A-Z]
             b: digits[0-9]
             c: special character only $ and _
        2. Identifier must not start with digits,
            but we can use digit from the second chr onwards
        3. Identifier can not contain special chr excepts % and _
        4. space is special chr so we can not use between chr or words if
           space is required then we will _ (underscore)
        5. Java identifier are the case-sensitive (a!=A)
        6. we can not use a keyword or reserved word as an identifier But we can use
           predefined class name, variable, method name as user defined identifier

        7. _ (underscore) single is not allowed we can use more than one
           up to java 8 it is allowed but after java 9 it is considered as keyword.

         */
         int a=5; // (  allowed)
         int Mah$ =5; //( allowed)
        // int 84=8; ( not allowed)
        // int 8j=7; ( not allowed)
        // int _ =8; ( not allowed)
        int __=9; //(  allowed)
        int $=8; // (  allowed)
        //String null="hell"; // not allowed null is reserved word
       // String static="age"; ( not allowed )
        String Static="age";

        String Null="IT"; //( allowed)
        String String= "hello"; // (  allowed)
        System.out.println(String);


    }
}
