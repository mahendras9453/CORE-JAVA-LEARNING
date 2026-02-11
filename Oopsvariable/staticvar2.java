public class staticvar2 {
    //  int x=10;  non-static variable x cannot be referenced from a static context
       static int x=10;
       int y=20;
    public static void main(String[] args) {
        System.out.println(x);//10
           staticvar2 e1 =new staticvar2();
           staticvar2 e2=new staticvar2();
           // creating object

        System.out.println(e1.y);//20
        System.out.println(e1.x + " " +e2.x);//10 10
        System.out.println(e1.y + " " +e2.y);// 20 20
        e1.x=15;
        e1.y=25;
        // static var modification affect all the object
        System.out.println(e1.x + " " +e2.x);//15 15
        System.out.println(e1.y + " " +e2.y);// 25 20

    }
}
