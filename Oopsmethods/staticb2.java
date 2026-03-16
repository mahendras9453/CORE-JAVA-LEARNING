public class staticb2 {
    static int a=10;
    static{
        a=20;
        a=30;
    }

    public static void main(String[] args) {
        System.out.println(a);//30;
    }

}
