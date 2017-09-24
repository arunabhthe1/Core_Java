package com.dash;

public class ThreadConcepts {
	String str1 = "Java";
    String str2 = "UNIX";
     
    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
            while(true){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };
     
    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };
     
	public static void main(String[] args) throws InterruptedException {
		System.out.println("In main() method");
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		System.out.println("end main() method");
		FactoryOneRunnable factOne=new FactoryOneRunnable();
		FactoryTwoRunnable factTwo=new FactoryTwoRunnable();
		Thread thread3 = new Thread(factOne);
		Thread thread4 = new Thread(factTwo);
		//thread3.start();
		//thread4.start();
		ThreadConcepts mdl = new ThreadConcepts();
        mdl.trd1.start();
        mdl.trd2.start();
		System.out.println("Deadloack over came");
	}
}

class MyRunnable implements Runnable {
	public void run() {
		System.out.println("in run() method");
		for (int i = 0; i < 300; i++) {
			System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
		}
	}
}

class FactoryOneRunnable implements Runnable {
	public void run() {
		Consumer.cunsume();
		try {
			Thread.sleep(500l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Producer.produce();
	}
}
class FactoryTwoRunnable implements Runnable {
	public void run() {
		
		Producer.produce();
		try {
			Thread.sleep(500l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Consumer.cunsume();
	}
}

class Consumer {
	public synchronized static void  cunsume(){
		System.out.println("Consumer");
		
	}
}
class Producer {
	public synchronized static void produce(){
		System.out.println("Producer");
	}
}