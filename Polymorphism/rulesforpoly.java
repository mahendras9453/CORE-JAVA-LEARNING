public class rulesforpoly {
    /*
     when we hide or override we must fallow
     4 rules
     1. return type must be same or convarient - return
     2. static must no t be ass or remove
     3. AM must be either same or cna be increased , but can not nbe decreeased
     private _> default. >protected .>public
     Note. private method is not considered as overriding method
     then above rules are not applied.If we override private method
     in subclass ,it is considered as sub class own method
     4. Exception handling related , refer exception handling chapter




     */
}

class A1      { void m1(){}}
class B1 extends A1 { void m1(){}} // valid
class A2           { void m1(){}}
// class B2 extends A2 { int m1() { return 5;} // not allowed we can not change return type
class A3 { long m1(){ return 5;}}
//class B3 extends A3 { int m1 () { return 7;}}// not allowed  because return type is not same
class A4 { int m1(){ return 5;}}
//class B4 extends A4 { long m1 () { return 7;}}// not allowed

class P{}
class Q extends P{} // sub type is also as co-varient
class A41                     { P m1() { return new P();}}
class B41 extends A41 { P m1() { return new Q();}}
class c41 extends A41 {Q m1 () { return new Q() ; }} // java 5v onwards allowed
//========================================================================================================================
 // rule #2 : ELM( execution level modifier
// ================= the keyword static must not be added or removed
class A5           { int m1(){return 5;}}
  //class B5 extends A5 { static int m1() { return 7;}} not allowed
class C5 extends A5 { int m1(){return 7;}}
class A6     { static int m1 (){ return 5;}} //not allowd
   //class B6 extends A6 { int m1() { return 7;}}
class C6 extends A6 { static int m1(){ return 7;}}

//===================================================================================================================
//Rule #3 : On Am{ accessbility Modifire) private ,default , protected,public
//==============Am must be same or can be increased but not decreased=====
 class A7 { static int m1() { return 5;}}
// class B7 extends A7 { private static int m1(){ return 7;}}
//class B8 extends  A7 {  int m1(){ return 7;}} not allowed
//class B9 extends  A7 { protected int m1(){ return 7;}} //NA
//class B10 extends  A7 { public int m1(){ return 7;}} //NA
