package Interface;

interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Drawable rec = new Rectangle();
        rec.draw();
    }
    
}


