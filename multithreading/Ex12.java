package multithreading;


//class Connection{}

public class Ex12 {
    static final Object connection = new Object();


    void mobileCall()  {
        synchronized (connection) {

            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

     void skypeCall() {
         synchronized (connection) {
             System.out.println("Skype call starts");
             try {
                 Thread.sleep(5);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("Skype call ends");
         }
     }

     void whatsappCall() {
         synchronized (connection) {
             System.out.println("WhatsApp call starts");
             try {
                 Thread.sleep(3000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("WhatsApp call ends");
         }
     }

    public static void main(String[] args) {
        Thread thr1 = new Thread(new RunnableImplMobile());
        Thread thr2 = new Thread(new RunnableImplSkype());
        Thread thr3 = new Thread(new RunnableImplWhatsApp());

        thr1.start();
        thr2.start();
        thr3.start();
    }
}

class RunnableImplMobile implements Runnable{
    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImplSkype implements Runnable{
    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImplWhatsApp implements Runnable{
    @Override
    public void run() {
        new Ex12().whatsappCall();
    }
}
