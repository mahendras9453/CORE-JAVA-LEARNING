public class pri_nprivate {
    /*
      A method is declared as private keyword that is known as private method.
       we can not access private method in any other class.
       we can access it with in  that class
       default method are non-private
     */
    private static void m1(){
        System.out.println("m1");
    }
    static void m2(){
        System.out.println("m2");
    }
    static void m3(){
        m1();
    }
}
class other{
    public static void main(String[] args) {
        // m1();
        // pri_nonprivate.m1();// not allowed because we have marked it as private
        pri_nprivate.m2(); //allowed
        pri_nprivate.m3();//allowed
    }
}

