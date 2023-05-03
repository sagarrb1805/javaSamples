package Anony;


class Outer{
    public void outerMethod(){
        System.out.println("outer class method");
    }
}


public class Main {

    public static void main(String[] args) {
        Outer inObj = new Outer(){
            public void outerMethod(){
                System.out.println("outer mehtod of inner class");
            }
            
        };

        inObj.outerMethod();
        // inObj.innerMethod();
    }
    
}
