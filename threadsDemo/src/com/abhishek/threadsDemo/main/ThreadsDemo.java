package com.abhishek.threadsDemo.main;

/*
🧠 THREADING & EXECUTOR CHALLENGES (Progressive Learning Path)

🔰 Beginner
1. Create and run a basic thread using `Thread` class.
2. Create and run a basic thread using `Runnable`.
3. Shared counter with race condition simulation.
4. Synchronized methods for thread-safe increment/decrement.
5. Demonstrate thread sleep and join.

🟡 Intermediate
6. Print even-odd numbers using two threads.
7. ABCABC printing using 3 threads.
8. Ping-Pong using wait/notify.
9. Producer-Consumer using wait/notify.
10. Bounded Buffer problem.
11. Using ExecutorService to run multiple tasks.
12. Submit Callable tasks and collect Future results.

🔴 Advanced
13. Implement a custom ThreadPoolExecutor.
14. Simulate Deadlock and resolve it.
15. ReentrantLock with fairness setting.
16. CyclicBarrier & CountDownLatch example.
17. Use of ThreadLocal variables.
18. CompletableFuture for async composition.
19. Thread-safe Singleton (double-checked locking).
20. Parallel processing using ForkJoinPool.

📌 Tip: Add each challenge method inside `ThreadPracticeSandbox` class to organize your solutions.
*/


public class ThreadsDemo {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sandbox started. Add your thread practice code here!");
        
        
        
        Thread thread = new Thread();
        thread.start();
        
        Thread  thread1 = new Thread(
        		new Runnable() {
        			
        			public void run() {
        				System.out.println("This is inside runnable");
        			}
        	}
        );
        
        

        // Example: Basic thread
        //Challenge 3
        //Create threads with shared data and observe race conditions
        Runnable runnable =  new Runnable(){
          public void run(){
            System.out.println("This is inside runnable");
          }
        };
        
        ThreadsDemo tdemo = new ThreadsDemo();
        
//        tdemo.challenge1Repeat();
        System.out.println("Challenge3 : synchronized to prevent race conditions");
        tdemo.challenge3();
        
        tdemo.challenge4();

      
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
   
    public void challenge4() {
	   SharedData sharedData = new SharedData();
	   
	   Thread producer = new Thread(
			   
			   ()->{
				   for(int i=0; i<5; i++)
				   	sharedData.produce("Data" + i);
			   });
	   
	   Thread consumer = new Thread(
			   
			   ()->{
				   for(int i=0; i<5; i++)
				   	sharedData.consume();
			   });
	   
	   producer.start();
	   consumer.start();
	   
   }
    //Prevent even odd numbers using two threads
    public void challenge6(){
    	Thread thread1 = new Thread(
    			()->{
    				for(int i=0;i<10;i=i+2)
    				{
    					System.out.println(i);
    				}	
    			});
    	
    	Thread thread2 = new Thread(
    			()->{
    				for(int i=1;i<10;i=i+2)
    				{
    					System.out.println(i);
    				}	
    			});
    	
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

	class SharedData{
	
		String data;
		boolean hasData = false;
		
		void produce(String value){
			while(hasData) {
				try{wait();}
				catch(InterruptedException e) {
					Thread.currentThread().interrupted();
				}
			}
			
			this.data = value;
			this.hasData = true;
			System.out.println("Data produced:"+this.data);
			notify();
		}
	
		void consume(){
			while(!hasData) {
				try {
					wait();
				}
				catch(InterruptedException e) {
					Thread.currentThread().interrupted();
				}
			}
			System.out.print("Consumed data:" +this.data);
			this.hasData = false;
			notify();
			
		}
		
	}


