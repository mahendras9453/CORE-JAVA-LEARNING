public class Setter_getter {
    /*
    Develop a project to create that real-world object Student in programming world. You use setter and getter methods
    to initialize, modify and read Student object fields/properties
    You must define two fields in student class they are sno and sname.

     A method whose name starts with 'set' and fallowed by a  field name is called setter method
     it is used for setting new value or modifying existing value of a private field of a class in this object.

      A method whose name starts with 'get' and fallowed by a  field name is called getter method
     it is used for retrieving the  existing value of a private field of a class in this object.

     */
    int sno;
    String sname;
    void setSno(int sno){
        this.sno=sno;
    }
    int getSno(){
        return this.sno;
    }
    void setSname(String sname){
        this.sname=sname;
    }
    String getSname(){
        return this.sname;
    }
    void display(){
        System.out.println(sno +"..."+sname);
    }

}
class college{
    public static void main(String[] args) {
        Setter_getter s1 = new Setter_getter();
        s1.setSno(101);
        s1.setSname("mahendra");
        System.out.println(s1.getSno());
        System.out.println(s1.getSname());

    }
}