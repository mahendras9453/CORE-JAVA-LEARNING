public class parse_method {
    public static void main(String[] args) {
        /*
         parse method is used to convert string into int,byte,long,short,float,double
         Now
         the classes (wrapper class)
         In short class
                  public static short parseShort(String Value)
         In int class
                  public static Integer parseInt(String Value)
         In boolean class
                  public static boolean parseBoolean(String Value)
         In long class
                  public static long parseLong(String Value)
         In float class
                  public static float parseFloat(String Value)
         In double class
                  public static double parseDouble(String Value)

         Note : we can not convert in into char using parse class

         */
        String a="10";
        String b="20";
         //int c= a+b; it will show error
        int a1=Integer.parseInt(a);// parse method is used
        int b1=Integer.parseInt(b);// parse method is used
        int c=a1+b1;
        System.out.printf("sum of %d and %d is %d",a1,b1,c);
    }
}
