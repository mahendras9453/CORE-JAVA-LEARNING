public class Array {
    public static void main(String[] args) {
        /*
        Array is the collection is of the same type of variable.
        - Array is used for to reference the memory to same type of variables.
         Drawback of the Array:>
         1. First drawback is that we can store the variable of the same type of the data type.
         2. As its size is fixed so, we can change it after creation of it.
         3.It does not have inbuilt  method to perform any specific operation like sorting,searching,removing......
         4.It can store the value only in the insertion order we can not store the value
           in the order of lifo,fifo,hash code....
         5. it can store value or object only on the index mapping . It can not store with our own key mapping.
            Syntax of creating the array:>
              Datatypes[] Identifier = new Datatypes[];
              # in the second( [])  we can write the size of the array
              Datatypes[] Identifier = { same types variable according to data types};




         */
             int[] num = new int[6];
             int[] num1 ={1,2,3};
              System.out.println(num1);// its output is  the [I@7b23ec81 that is the reference basically that shows address
         // to print the value of the array we have use the index  calling
        System.out.println(num1[0]); // output : 1




    }
}
