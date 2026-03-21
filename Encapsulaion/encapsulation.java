public class encapsulation {
    /*
       First why we need it?
       Loose Data Security
       1) Any one can access object data
       2) Wrong values can be stored
       3) Code redundancy
       4) For every change we must modify complete project
       What is encapsulation and why encapsulation?
       The process of wrapping up of variable and methods as one unit  by using a class and operating those variable via
       methods either for reading or modifying values is called encapsulation
      By developing encapsulation we are hiding data from direct access from other objects; and providing access via publicily available getter and setter method
      with proper validation
      Hence through encapsulation
      we will get security to object data
      and reusability , centralized modification to object code
      1.declare var as private
      2.define set and get method to access variables
     */
    private int x=0;
    void Set(int x){
        this.x=x;
    }
    int Get(){
        return this.x;
    }

    public static void main(String[] args) {
        encapsulation e=new encapsulation();
        e.Set(500);
        System.out.println(e.Get());
    }
}
/*
Advantages of encapsulation
1) we can stop unauthorized people to access obj data
2) we can stop storing wrong values as per project
3) we can modify code without effecting other classes
 */
