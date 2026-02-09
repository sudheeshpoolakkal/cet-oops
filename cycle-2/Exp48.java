
class GarbageDemo {
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }
}

class Exp48 {
    public static void main(String[] args) {
        GarbageDemo obj = new GarbageDemo();
        obj = null;
        System.gc();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
