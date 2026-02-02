public class Assignment_op {
    public static void main(String[] args) {
        int a=10;
        int b;
        int c=a+(b=90); // valid
       // int d=10+(int e=10); not valid
        int i2=20;
        int i3=20+(i2=90);// valid
        System.out.println(c);//108
        System.out.println(i2);//10
        System.out.println(i3);//110
    }
}
