public class variable {
    public static void main(String[] args) {
        /*

        class example{
        int x=10;//////////>>>>>>class level variables (strong object values)
        double d=20;
        void m1(){
        int p=50;///////>>>>>>. method level variable(string operation values)
        String s="abc";
        Java supports  four types of variables
        1) static is also known as class variable
        2) non-static also known as class instance variable
         above both are  class level variable

        3) local    also known as stack variable
        4) parameter also known as stack or auto variable
         above both are method level variable

        when class is loaded into jvm static will get memory.
        when object is created  non-static will get the memory
        when object is created  in the background one copy memory is created one copy memory is known as instance
           HWn we run a class a variable is provided a class in three situations
           1) when class is loaded into jvm
           2) when new instance or object is created
           3) when method is called
           when class is loaded into jvm all static variables get memory automatically
           when object is created all not static variables are provided memory .
           when method is called parameter and local variables provided memory
          NOTE-Local variable memory may  or may not created even though method is called because its declaration statements may not executed
             when we run the class static and main method variable all automatically allocated
             For not static  variable ,memory is  created  only when object is created
          User defined method parameter  and local memory allocated when only method is called
           class Example
           // static variables
           static int a=10;
          static int b=20;
          // non-static
           int x=30;
           int y=40;                      // parameter
           public static void main(String[] args)
           //local variable
           int p=50;
           int q=60;
            > java example
            7 variables are declared
            a,b,x,y,args,p,q,
            5 variable are provided memory
            a,b,args,p,and,q
             class Example
           // static variables
           static int a=10;
          static int b=20;
          // non-static
           int x=30;
           int y=40;                      // parameter
           public static void main(String[] args)
           //local variable
           int p=50;
           int q=60;
           Example e1 =new Example();
           Example e2 = new Example();
            m1(40)
           static void m1(int m){
           int n=50;
            }

           11 variables are declared
            a,b,x,y,args,p,q,e1,e2,m,n
            5 variable are provided memory
            a,b,args,p,q,e1 x y,e2 x y,m,n
         */


    }
}
