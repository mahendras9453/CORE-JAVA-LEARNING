public class Primitive_datatypes {
    public static void main(String[] args) {
        /*
          byte ...<<. short ..<<<
                                  /
                                  <<<< int...<<<<long
                                 /
                           chr


                        | Type    | Size | Range                          | Default |
                      |---------|------|--------------------------------|---------|
                      | byte    | 8    | -128 to 127                   | 0       |
                      | short   | 16   | -32,768 to 32,767             | 0       |
                      | int     | 32   | -2,147,483,648 to 2,147,483,647 | 0       |
                      | long    | 64   | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 0L |
                      | float   | 32   | ~1.4E-45 to ~3.4E+38          | 0.0f    |
                      | double  | 64   | ~4.9E-324 to ~1.7E+308        | 0.0d    |
                      | char    | 16   | 0 to 65,535 (Unicode)         | '\u0000'|
                      | boolean | 1    | true / false                  | false   |
         */
        int i1=10;
        //int i2=10l;  > not allowed because  you compile will give you storing error and
                      // long type value can not be store in the int type
        long i3 = 10l; //( allowed)
        char i4=97; //( allowed )
        int i5 ='a';
        System.out.println(i5);// output 97
        int i6 = 1000000000;
        // int i7= 10000000000; not allowed
        long i7 = 10000000000l; //Allowed


    }
}
