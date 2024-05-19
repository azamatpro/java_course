class Counter {
  int count;
  public synchronized void increament(){
    count++;
  }
}

public class Hello {
  public static void main(String args[]){
    Counter c = new Counter();

    Runnable objA = () -> {
      for(int i = 1; i <= 1000; i++){
        c.increament();
      }
    };

    Runnable objB = () -> {
      for(int i = 1; i <= 1000; i++){
        c.increament();
      }
    };


    Thread t1 = new Thread(objA);
    Thread t2 = new Thread(objB);

    t1.start();
    t2.start();

    try{
      // To force main() that wait for threads to complete their task
      t1.join();
      t2.join();
    }catch(InterruptedException e){
      System.out.println(e);  
    }
    System.out.println(c.count);
  };
};