public class Return {
    public static void main(String[] args) {// calling method
        /*
        return  is used for menthadologic execution returning to the calling method
         */
        System.out.println("main start");
       // m1(5);
        m1(7);
        System.out.println("main end");

    }
    static void m1(int p){// called method
        System.out.println("m1 start");
        if(p==5)
            return;
        System.out.println("m1 end");
    }
}
