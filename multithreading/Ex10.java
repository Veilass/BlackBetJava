package multithreading;

public class Ex10 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnableImpli runnableImpli = new MyRunnableImpli();
        Thread thread1 = new Thread(runnableImpli);
        Thread thread2 = new Thread(runnableImpli);
        Thread thread3 = new Thread(runnableImpli);
        thread1.start();
        thread2.start();
        thread3.start();


    }
}


class Counter{
    static int count = 0;
}

class MyRunnableImpli implements Runnable{
    public synchronized void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
