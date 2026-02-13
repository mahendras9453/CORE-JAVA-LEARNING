public class V_nVoid {
    static void m1(){
        System.out.println("m1");
    }
    static int m2(){
        System.out.println("m2");
        return 5;
    }
    static void m3(int a){}
    static void m4(){
        //return m1(); not allowed
    }

    public static void main(String[] args) {
        System.out.println("start");
        m1();
        //int a=m1(); not allowed
       // m3(m1()); not allowed
        //System.out.println(m1()); not allowed
        System.out.println();
        m2();
        int p=m2();//m2 will pe printed
        int q=10*m2();
        m3(m2());
        System.out.println(m2());//m2 5
        System.out.println("end");

    }
}
