public class ThreadPriority {
    public static void main(String [] args) throws Exception{
        Thread t1 = new Thread(() -> {
            for (int i=1;i<=5;i++){
                System.out.println("Hola");
                try { Thread.sleep(1000);}catch (Exception e){}
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i=1;i<=5;i++){
                System.out.println("Hey");
                try { Thread.sleep(1000);}catch (Exception e){}

            }
        });
        t1.setName("Hola Thread");
        t2.setName("Hey Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        try { Thread.sleep(10);}catch (Exception e){}
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
        System.out.println("Thread Name: "+t1.getName() + "Thread Priority " + t1.getPriority());
        System.out.println("Thread Name: "+t2.getName() + "Thread Priority " + t2.getPriority());
    }
}
