package InnerClass;

class Outer{
    public void outerMethod(){
        System.out.println("outer class method!");
    }

    // class InnerClass{
    //     public void innerMethod(){
    //         System.out.println("inner class method!");
    //     }
    // }
    static class InnerClass{
        public void innerMethod(){
            System.out.println("inner class method!");
        }
    }
}

public class Main {
    
    public static void main(String[] args) {
        Outer outObj = new Outer();
        outObj.outerMethod();

        // Outer.InnerClass innObj = outObj.new InnerClass();
        Outer.InnerClass innObj = new Outer.InnerClass();
        innObj.innerMethod();

    }

}
