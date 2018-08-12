package threadcreation2;
class demo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<=10;i++){
			System.out.println(Thread.currentThread().getId()+"value "+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread th1=new Thread(new demo());
Thread th2=new Thread(new demo());
th1.start();
th2.start();
	}

}
