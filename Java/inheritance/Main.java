package inheritance;


class A{

    public A(){
        System.out.println("Class A constructor");
    }
    public void randomMethod(){
        System.out.println("Random method of class A");
    }
}
class B extends A{
    public B(){
        System.out.println("Class B constructor");
    }
    public void randomMethod(){
        super.randomMethod();
        System.out.println("Random method of class B");
    }

}

public class Main {
    
    public static void main(String[] args){
        // new B();
        B b = new B();
        A a = new A();
        b.randomMethod();
        a.randomMethod();
    }
}
