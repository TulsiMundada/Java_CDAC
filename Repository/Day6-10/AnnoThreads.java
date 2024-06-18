package day8;


public class AnnoThreads {

	public static void main(String[] args) {
		
		Thread t1 =new Thread(new Runnable() {			
			@Override
			public void run() {
				for(int i=0; i< 10;i++)
				{
					System.out.println(Thread.currentThread().getName() + " " + i);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		});
		t1.start();
		
		Runnable tt = () -> {
			for(int i=0; i< 10;i++)
			{
				System.out.println(Thread.currentThread().getName() + " " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(tt);
		t1.start();

	}

}
