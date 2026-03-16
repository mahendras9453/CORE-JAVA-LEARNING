public class constructor {

        /*
         Constructor  is kind of method whose name is  same a class  name and  does not have return type .
          - In java , a constructor is used for initializing an object which is created by "new" keyword.
          - In java , object is create by new keyword, and it is initialized by constructor.
          The constructor  does not create an object it just initializes the object that is created by new operator.
          - So in java  a constructor is not a constructor
            It is an initializer
          for whom purpose the constructor and class name is same?
           for new keyword;
         */
      constructor() {     // if we write void constructor  no compile time error treated as method
          System.out.println("constructor");
      }

    public static void main(String[] args) {
        constructor t1=new constructor();
    }

}
