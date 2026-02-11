

public class varTerminology {

        /*
         Variable Terminology
         1.Variable declaration      >>>> int x;
         2.Variable  definition       >>>> int y=20;
         3.Variable initialization    .....  x=40;
         4.Variable assignment        >>>>>.  x=50;
         5.Variable accessing         /int z=x
                                      \ Sopln(x);
         */
    static int a=10;
    static int b= 20;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(varTerminology.a);
        varTerminology e1= new varTerminology();
        System.out.println(e1.a);
        varTerminology e2=null;
        System.out.println(e2.a);
    }


}
