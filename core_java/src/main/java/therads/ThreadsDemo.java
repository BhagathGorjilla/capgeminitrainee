package therads;

public class ThreadsDemo {
	
public static void main(String[] args) {	
	Thread t1=new MyThread();
	Thread t2=new MyThread();
	
	t1.setName("t1");
	t2.setName("t2");
	
	t1.start();
	t2.start();
    System.out.println("In Main Thread");
}

}