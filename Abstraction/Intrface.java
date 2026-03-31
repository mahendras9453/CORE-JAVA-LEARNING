public class Intrface {
     /*
      Like  a class , an interface is also a referenced data type
      when we have abstract class for developing abstraction, why di we have interface?
       Java does not support multiple inheritance by using classes
       multiple business at a time by single class
        interface is given in java Language.
        >> Why  Java does not support multiple inheritance by using class ?
         because it leads ambiguous to the compiler in calling and executing constructor and method by using super key word if both
          super class contains a method same signature.
         How  can interface solve multiple inheritance  problem?
           1. interface does not have constructor
           2. interface contains only abstract method , it must be override in sub class
           3. in sub class super keyword does not reference to interface,
           it refers to the one and only the super class
   what is the rule On interface ?
    >>>>> we can not instantiate.
      */

}
interface Bike{
    abstract void printDetails();
}
interface Car{
    abstract void printDetails();
}
class Honda implements Bike, Car{// multiple type inheritance
     public void printDetails(){}
    Honda() {
        super();
    }
    void showDetails(){
        printDetails();
    }

}
