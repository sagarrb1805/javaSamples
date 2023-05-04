package DeadLock;

class DataInit{
    int initial;
    public void increase(){
        initial += 1;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataInit di = new DataInit();

    Runnable ch1 = ()->{
        for (int i=0; i<10; i++){
            di.increase();
            
        }
    };
    Runnable ch2 = ()->{
        for (int i=0; i<10; i++){
            di.increase();
            System.out.println("Thread 2 "+ di.initial);
        }
    };
    Thread t1 = new Thread(ch1);
    Thread t2 = new Thread(ch2);

    t1.start();
    t2.start();
    t1.join();
    t2.join();

    System.out.println(di.initial);
    }
    
    
}
