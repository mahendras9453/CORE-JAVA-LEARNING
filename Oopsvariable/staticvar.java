public class staticvar {
    /*
     if we modify static variable value in one method that modification is affected to other methods because
     static var memory is shared to all methods
     */

    static int a=10;
    static int b=20;
    static void m1(){
        a=15;
    }
    static void m2(){
        System.out.println("from m2 a:" +a);
    }

    public static void main(String[] args) {
        System.out.println("from mm a:" +a);//10
        m2();//10
         m1();
        System.out.println("from mm a" +a);//15
        m2();//15

    }

}
