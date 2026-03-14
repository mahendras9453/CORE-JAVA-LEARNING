public class st_getprogram {
    /*
    Develop a program to create  room with its dimension  L and B
    Create a room in a building with some L and B
    Perform Business Operation - findarea() and findperimeter()
    using setter and getter method
     */
    int length;
    int breadth;

    void setL(int Length) {
        this.length = Length;

    }

    int getL() {
        return this.length;

    }

    void setB(int Breadth) {
        this.breadth = Breadth;

    }

    int getB() {
        return this.breadth;
    }

    double findarea() {

        return length*breadth;
    }

    int findperimeter() {
       return  2*(length+breadth);
    }
}

     class room {
        public static void main(String[] args) {
            st_getprogram e1= new st_getprogram();
            e1.setL(5);

            e1.setB(6);


            System.out.println("The length is : " + e1.getL());
            System.out.println("The Breadth is : " + e1.getB());
            System.out.println("The area of the room is : " +e1.findarea( ));
            System.out.println("The Perimeter of the room is : " +e1.findperimeter( ));


        }
    }



