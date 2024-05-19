class A extends Thread{
  public void run(){
    for(int i = 1; i <= 100; i++){
      System.out.println("Hi " + i);
    }
  }
}

class B extends Thread{
  public void run(){
    for(int i = 1; i <= 100; i++){
      System.out.println("Hello " + i);
    }
  }
}

public class Hello {
  public static void main(String args[]){
    A objA = new A();
    B objB = new B();

    objA.start();
    objB.start();
  };
};