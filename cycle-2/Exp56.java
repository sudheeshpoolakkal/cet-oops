
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

class Exp56 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
