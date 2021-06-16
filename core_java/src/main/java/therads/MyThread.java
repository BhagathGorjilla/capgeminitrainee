package therads;

public class MyThread extends Thread {
	
public MyThread(){}
	
@Override
public void run() {
	
	if(Thread.currentThread().getName().equals("t1")) {
		System.out.println("INVOKED THREAD T1");
	}
	
	if(Thread.currentThread().getName().equals("t1")) {
		System.out.println("INVOKED THREAD T2");
	}	
}
}
