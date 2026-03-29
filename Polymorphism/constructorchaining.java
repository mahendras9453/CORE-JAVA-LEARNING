public class constructorchaining {
    /*
     Calling one cons from other overloaded constructors either by using this() call or by using super() call
     is called constructor chaining

     */


}
class sample{
    private int x;
    sample(){
        this(10);
        System.out.println("NPC is executed for" + this + "object");
    }
    sample(int x){
        this.x=x;
        System.out.println("IPC is executed for" + this + "object");
    }
    sample(String x){
        this(Integer.parseInt(x));
        System.out.println("SPC is executed for" + this + "object");

    }
    public  void display(){
        System.out.println(this + "x : " +x);
    }

}
class Tst_cchaining{
    public static void main(String[] args) {
        sample s1 =new sample();
        s1.display();
    }
}
