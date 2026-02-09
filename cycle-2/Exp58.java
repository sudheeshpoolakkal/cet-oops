
class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(n * i);
            if (i < 5) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

class MyThread58 extends Thread {
    Table t;
    int num;
    
    MyThread58(Table t, int num) {
        this.t = t;
        this.num = num;
    }
    
    @Override
    public void run() {
        t.printTable(num);
    }
}

class Exp58 {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread58 t1 = new MyThread58(obj, 5);
        MyThread58 t2 = new MyThread58(obj, 100);
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
