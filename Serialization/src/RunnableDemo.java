class Hey implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hey");
            try{ Thread.sleep(1000); } catch (Exception e){}
        }
    }
}
class Hola implements Runnable{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Hola");
            try { Thread.sleep(1000);}catch (Exception e){}

        }
    }
}

public class RunnableDemo {

    public static void main(String[] args){
        Runnable obj1 = new Hi();
       // Runnable obj2 = new Hello();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(new Hello());
        t1.start();
        try { Thread.sleep(10);}catch (Exception e){}
        t2.start();
    }
}
