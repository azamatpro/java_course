class A extends Thread{
  public void run(){
    for(int i = 1; i <= 10; i++){
      System.out.println("Hi " + i);
      try{
        Thread.sleep(10);
      }
      catch(InterruptedException e){System.out.println(e);}
    }
  }
}

class B extends Thread{
  public void run(){
    for(int i = 1; i <= 10; i++){
      System.out.println("Hello " + i);
      try{
        Thread.sleep(10);
      }
      catch(InterruptedException e){System.out.println(e);}
    }
  }
}

public class Hello {
  public static void main(String args[]){
    A objA = new A();
    B objB = new B();

    objA.start();

    try{
        Thread.sleep(10);
      }
      catch(InterruptedException e){System.out.println(e);}
      
    objB.start();
  };
};