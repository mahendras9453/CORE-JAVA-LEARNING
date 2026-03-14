public class this_keywrd {
    /*
   Without , writing  could be ambiguous if local variables shadow instance variables.
   Using  makes it explicit that you’re assigning the parameter  to the object’s field .
   Common uses of  keyword:
• 	Differentiate variables: When method parameters have the same name as instance variables.
• 	Pass current object: You can pass the current object as an argument to another method or constructor.
• 	Invoke other constructors: Using  inside a constructor to call another constructor in the same class.
• 	Return current object: Often used in method chaining (e.g., ).

     */
    int x;
    int y;
    void m1(int p,int q){
        this.x=p;
        this.y=q;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        this_keywrd e1=new this_keywrd();

        e1.m1(10,20);
        e1.display();
    }
}
