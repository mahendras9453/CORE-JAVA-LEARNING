public class block {
    /*
     A nameless block , just{ } placed inside a class or inside a method is called a block
     two types of block java support


     */
    static {// class level block further divided into static  initializer and Instance Initializer block
        //1. for executed some logic at the time of class loading
        // 2. used for initializing SVs only once
        System.out.println("hi");//hi
        /*
        variable  are created under static block are the local variable
         we can write every thing  in the static block  which ever we write in the method
         but not
          return;
          return 30;
          throw new ArithmeticException();

         */
    }
    {// Instance Initializer block
       // used for initializing NSv and
        //2. used for executing some logic only once
        // for every new object at the time of object creation
        // common to all constructors of this class

    }


    void m1(){ // method level block || local block

    }

    public static void main(String[] args) {

    }
}
