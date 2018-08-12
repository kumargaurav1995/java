package threadcreation1;
class threadcreation extends Thread{

	@Override
	public void run() {
		for(int i=0;i<=10;i++){
			System.out.println(Thread.currentThread().getId()+"value "+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		//super.run();
	}
	
}
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadcreation th1=new threadcreation();
		th1.start();
		threadcreation th2= new threadcreation();
		th2.start();
	}

}
