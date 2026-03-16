public class staticblock {
    static{
        int e=10;
        e=20;
    }

    public static void main(String[] args) {
      //  System.out.println(a); gives error becuse e is in static block which is local variable
    }
}
