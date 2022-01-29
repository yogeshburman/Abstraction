// -------------abstraction is mainly use for hiding implementation--------------

abstract class Test {
  
  abstract void method1(); // in abstraction method body cannot write here for hiding implementation 
}

class Test2 extends Test{
  
  // method body decleared 
  void method1(){
    
    System.out.println("implements abstraction");
    
  }
  
  
  
}
class Test3{
  
  public static void main (String[]args){
    
    Test2 t = new Test2();
    t.method1();
    
  }
}