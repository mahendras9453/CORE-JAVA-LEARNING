public class NSfinalKW {
    /*
     A NSFV must be initialized before object creation is completed
     Hence a NSFV can be initialized
     1. either in its declaration statement
     2. or in any of the non static block
     3. or in all constructors those does not have this () call

     If the constructor has this () call , we can not  initialize  NSFV
     because it is initialized from the  this() calling  constructor
     */
    final int x=10;
    final int y;

    {
        //x=17;
        y=20;
    }

    {
        // y=30;
    }


}
