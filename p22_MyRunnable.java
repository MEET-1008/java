 class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("This is a runing thread!");
    }
}

public class p22_MyRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
