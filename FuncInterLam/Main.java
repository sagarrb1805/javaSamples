package FuncInterLam;

@FunctionalInterface
interface Sample{
    // public void Show();
    public int add(int x, int y);
}

public class Main{
   
    public static void main(String[] args) {
        // Sample m = () -> System.out.println("Show method from Sample interface");
        // m.Show();

        Sample m = (int x, int y) -> x+y;
        System.out.println(m.add(5, 2)); 
    }
}





// public class Main implements Sample {
//     @Override
//     public void Show(){
//         System.out.println("Show method from functional interface");
//     }

//     public static void main(String[] args) {
//         Sample m = new Main();
//         m.Show();
//     }
// }
