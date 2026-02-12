public class var_java10 {
    public static void main(String[] args) {
        /*
        in java 10 var has added
        it is just an identifier
         using  this feature we can create a local variable either inside a method/constructor
         /static block/instance block without using a data type.
         rules;
         1) we can use var only to local variable if we use var to static variable ,instance variable and
            to parameter compiler will throw error
            Also we can not use var for class creation and method return type
         2) if we create variable using var, it must be initialized in the same declaration line , else compiler will thow error
         3) The initialized value must have specific type if the value must not have type compiler will throw error
         */
        var i1=10;
        var d1=10.6;
        var c1 ="a";
        var s="hello";
        System.out.println(i1);//10
        System.out.println(c1);
        //class var not allowed
        //var x={1,2,3} not allowed
    }
}
