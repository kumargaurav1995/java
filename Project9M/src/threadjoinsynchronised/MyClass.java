package threadjoinsynchronised;

public class MyClass {
	private static int count=0;
	public static synchronized void countinc(){
		count++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Thread th1=new Thread(new Runnable(){


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++){
			countinc();
		}
	}
});
Thread th2=new Thread(new Runnable(){


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++){
			countinc();
		}
	}
});
th1.start();
th2.start();
try {
	th1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	th2.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println(count);
	}

}
