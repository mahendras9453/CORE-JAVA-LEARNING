public class constructorOverloading {
    /*
     Defining multiple constructors with different parameters or list or order is called constructor overloading
     */
    constructorOverloading(){
        System.out.println("NpC");

    }
    constructorOverloading(int a){
        System.out.println("IPC");

    }
    constructorOverloading(String s){
        System.out.println("SPC");

    }
}
/*
 when we overload a constructor , the constructor execution is decided based on the type of argument
 is passed when it is called in an object creation.

 */
class test1{
    public static void main(String[] args) {
        constructorOverloading e1=new constructorOverloading();//NpC
        constructorOverloading e2=new constructorOverloading();//NpC
        constructorOverloading e3=new constructorOverloading(4);//IPC
        constructorOverloading e4=new constructorOverloading('a');//IPC
        constructorOverloading e5=new constructorOverloading("a");//SPC


        System.out.println("hello world");
    }
}

