public class void_nonvoid {
    /*
     Void method does not return anything
     not void return data types
     */
    void m1(){
        System.out.println("void");
    }
  // int m2(){}        It will generate error because we are not used return
       // int m3(){
        //return ;
     //   }  it will also show error, although we have declared return but not defined any int datatype
    int m4(){
        return 5;
    }//allowed
   int m5() {

       // return true; generate error because we have  defined method int type and returning boolean value (return according to declaration of method)
       return 'a'; // allowed will return ASCII value
   }
   /*                                                                                VM          NVM
     we can invoke by                                                                     ===========
     1. as single element .......................> m1();                             Y            Y
     2. as a variable assignment    ............ > int a=m1();                       N            Y
     3. As an operand in an expression............> int b= a*m1();                   N            Y
     4. As a method argument.......................>  m2(m1());                      N            Y
                                                     System.out.println(m1());       N            Y
     5. as a method return value ...................> int m3(){
                                                      return m1();                   N            Y
                                                      }
    */
}
