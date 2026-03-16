public class typescons {
    /*
     In the java there are three types of the constructor
       1. Default constructor >> compiler  generated constructor
       2. Non-Parameterized | NO-Param| No-argument | zero Param | nullary constructor
       3. Parametrized Constructor  { with parameter}
     */
    private int x;
    private int y;
    // no-param
    typescons(){
        x=20;
        y=10;
    }
    //parametrized
    typescons(int x,int y){
        this.x=x;
        this.y=y;
    }void display(){
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

}
class test{
    public static void main(String[] args) {
        typescons e1=new typescons();
        typescons e2=new typescons(28,93);
        e1.display();
        e2.display();
    }
}
/*
 problem of constructor
 1) can execute only one time per object
 2) using constructor we can perform only initialization  we can not perform modification
 3) can not initialize each property separately one at  a time, we must pass all property initial values at a time to the constructor .
    Then of we have more properties we must define more parameters , and must remember order, and can not ignore some of the properties initializtion
    4) must use local variable for reading initial values from KB
 */