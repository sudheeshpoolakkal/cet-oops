
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }
    
    synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    SharedResource resource;
    
    Producer(SharedResource resource) {
        this.resource = resource;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
        }
    }
}

class Consumer extends Thread {
    SharedResource resource;
    
    Consumer(SharedResource resource) {
        this.resource = resource;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
        }
    }
}

class Exp59 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer p = new Producer(resource);
        Consumer c = new Consumer(resource);
        
        p.start();
        c.start();
        
        try {
            p.join();
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
