package day8;

public class DemoThread {

	public static void main(String[] args) {
		Thread t1 = new Thread1("new thread 1");
		t1.start();		
		
		Thread t2 = new Thread(new Thread2("new thread 2"));
		t2.start();
		System.out.println(t1.isAlive());
		for(int i=0; i< 10;i++)
		{
			System.out.println("main thread : " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());

	}

}
