package Thread;

// class ThreadOne extends Thread{
//     public void run(){
//         for (int i=0; i<5; i++){
//             System.out.println("thread one "+i);
//         }
//     }
// }


// class ThreadTwo extends Thread{     //implements Runnable
//     public void run(){
//         for (int i=0; i<5; i++){
//             System.out.println("thread two "+i);
//         }
//     }
// }





public class ThreadDemo {
    public static void main(String[] args) {

        Runnable ct1 = ()->{
            for (int i=0; i<5; i++){
            System.out.println("thread one "+i);
            }
        };

        Runnable ct2 = ()->{
            for (int i=0; i<5; i++){
            System.out.println("thread two "+i);
            }
        };


        Thread t1 = new Thread(ct1);
        Thread t2 = new Thread(ct2);
        t1.start();
        t2.start();

        // ThreadOne td1 = new ThreadOne();
        // ThreadTwo td2 = new ThreadTwo();

        // td1.start();
        // td2.start(); 
    }
}
