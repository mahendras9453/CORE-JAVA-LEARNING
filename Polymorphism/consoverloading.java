public class consoverloading {
    /*
     For initializing the current class objects NSVs
     1. either by taking argument in different types
     2. or by developing different initialization logics
      we  must overload constructors
      For Example : for intializing int variable by taking
      integer number as int, Integer and String Type
      we must overload constructor as below
     */

}
class Sample{
    private int x;
    Sample(){
        x=10;
    }
    Sample(int x){
        this.x=x;

    }
    Sample(Integer x){
        this.x=x.intValue();//Integer object to int value

    }
    Sample(String x){
        this.x=Integer.parseInt(x);

    }
    @Override
    public String toString(){
        return "x: " +x;
    }
}
class test_COVL_Case1{
    public static void main(String[] args) {
     Sample e1 =new Sample();
        System.out.println(e1);
        Sample s2=new Sample(30);
        System.out.println(s2);

    }


}
