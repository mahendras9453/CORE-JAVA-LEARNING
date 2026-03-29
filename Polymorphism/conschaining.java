public class conschaining {
    /*
     For chaining super class constructor to sub class constructors, we must call super class constructors in sub class constructors bys
      using  super() ca;; by passing argument matching to super class constructors parameter type
       In subclass calling one constructor from other overloaded constructor is optional .
       But calling super class constructor
       form subclass constructor is mandatory
       - In subclass in all constructor , if we do not call super class constructor explicity, compiler automatically calls
       super class no-parm constructor by placing super() in all constructors in sub class

        Every time from subclass all constructors by default super class no-param constructor is executed parameterixed constructor ,
        we must place super(arg) with matched argument of super class constructor


     */
}
//Constructor Chaining in the Same Class
class Student1{
    String name;
    int age;

    Student1() {
        this("Unknown");  // Calls the constructor with one parameter
    }

    Student1(String name) {
        this(name, 18);   // Calls the constructor with two parameters
    }

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
//Constructor Chaining Across Classes (Inheritance)
class person{
    person() {
        System.out.println("Person constructor called");
    }
}

class Employee extends person {
    Employee() {
        super();  // Calls the constructor of Person
        System.out.println("Employee constructor called");
    }
}

