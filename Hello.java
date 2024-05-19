
public class Hello {
  public static void main(String args[]){

    Runnable objA = () -> {
      for(int i = 1; i <= 5; i++){
        System.out.println("Hi " + i);
        try{
          Thread.sleep(10);
        }
        catch(InterruptedException e){System.out.println(e);}
      }
    };

    Runnable objB = () -> {
      for(int i = 1; i <= 5; i++){
        System.out.println("Hello " + i);
        try{
          Thread.sleep(10);
        }
        catch(InterruptedException e){System.out.println(e);}
      }
    };

    Thread t1 = new Thread(objA);
    Thread t2 = new Thread(objB);

    t1.start();
    t2.start();
  };
};