package threadcreation3;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread th1=new Thread(new Runnable(){
	@Override
	public void run() {
	for(int i = 0;i<=10;i++){
		System.out.println(Thread.currentThread().getId()+"value "+i);
	}
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		// TODO Auto-generated method stub
		
	}
});
th1.start();
	}

}
