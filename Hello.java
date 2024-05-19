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


    Thread t1 = new Thread(objA); // in new state
    Thread t2 = new Thread(objB);

    t1.start(); // moved to runnable state from new state
    t2.start();
    //After this, run() called in Runnable, and thread moves to running state from runnable state.
    // When we call wait() or sleep(), thread moves to waiting state from running state, 
    // notify() is used to move thread from waiting thread to runnable state.
    // stop() is used to move thread to Dead state

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