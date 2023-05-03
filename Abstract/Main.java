package Abstract;

abstract class Bike{
    public abstract void rideBike();
    public void TractionControl(){
        System.out.println("Turn on Traction Control");
    }
}

class AfricaTwin extends Bike{
    @Override
    public void rideBike(){
        System.out.println("Riding Africa twin adv DCT");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike afTwin = new AfricaTwin();
        afTwin.rideBike();  
        afTwin.TractionControl();
    }
    
}
