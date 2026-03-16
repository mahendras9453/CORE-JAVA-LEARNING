public class nonstatticblock {
    /*
    without name  static  known as non-static block
    automatic executed by jvm
     */
    {
        System.out.println("hello");
    }// we can multiple block execution will be top to bottom
    nonstatticblock(){
        System.out.println("NPC");
    }
    nonstatticblock(int x){
        System.out.println("IPC");
    }
    nonstatticblock(String s){
        System.out.println("Spc");
    }

    public static void main(String[] args) {
        nonstatticblock e1=new nonstatticblock();
        nonstatticblock e2=new nonstatticblock(5);
        nonstatticblock e3=new nonstatticblock("a");
    }
}
/*
hello
NPC
hello
IPC
hello
Spc

 */
