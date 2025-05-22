package com.abhishek.threadsDemo.main;

public class ThreadsDemo {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sandbox started. Add your thread practice code here!");

        // Example: Basic thread
        //Challenge 3
        //Create threads with shared data and observe race conditions
        Runnable runnable =  new Runnable(){
          public void run(){
            System.out.println("This is inside runnable");
          }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
        
        ThreadsDemo tdemo = new ThreadsDemo();
        
//        tdemo.challenge1Repeat();
        System.out.println("Challenge3 : synchronized to prevent race conditions");
        tdemo.challenge3();

      
    }

    // Add more methods for challenges here as needed
    //Challenge 1: Create and run a basic thread using the Thread class

    public void challenge1(){
      Thread thread = new Thread();
      thread.start();
    }

    //Challenge 2: Create and run a basic thread using the Thread class

    public void challenge2(){
      Runnable runnable = new Runnable(){
        public void run(){
          System.out.println("This is inside the runnable definition");
        }
      };
  
      Thread thread = new Thread(runnable);
      thread.start();
    }

    //Challenge 3
    //Create threads with shared data and observe race conditions

    public void challenge3(){
      Counter counter = new Counter();
      

      Thread thread1 = new Thread(
        ()->{
          for(int i=0; i<10; i++)
            counter.inc();
        }
      );
      Thread thread2 = new Thread(
        ()->{
          for(int i=0; i<5; i++)
            counter.dec();
        }
      );

      thread1.start();
      thread2.start();
      
      try {
		thread1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try {
		thread2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
      System.out.println("Count:"+counter.getCount());
      
      
    }
    
    
    
    
    public void challenge1Repeat() {
    	//Create a basic thread
    	Thread thread = new Thread();
    	thread.start();
    	//Use runnable 
    	Runnable runnable = ()->System.out.println("This is inside runnable");
    	
    	Thread thread1 = new Thread(runnable);
    	thread1.start();
    }

}


class Counter{

	  private int count = 0;

	  public int getCount() {
		return count;
	  }

	  public synchronized void inc(){
	    count++;
	  }

	  public synchronized void dec(){
	    count--;
	  }
}

