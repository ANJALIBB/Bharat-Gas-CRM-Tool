public class greatwstNumber extends Thread{
	int c=0;
	Thread t=new Thread();
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("hello");
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
		public void run(int c) {
			for(int i=0;i<=10;i++) {
				System.out.println("hello");
				try { 
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
	}
}
class Hello implements Runnable{
	public void run() {
		for(int i=0;i<1;i++) {
			System.out.println("hi");
		}}
}