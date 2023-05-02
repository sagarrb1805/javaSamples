import java.io.Console;

public class Main {
    public static void main(String[] args){
        // Animal animal = new Animal();
        // animal.name = "Django";
        // animal.getName();
        // animal.makeSound();

        StringBuffer sb = new StringBuffer("Thomas kutty");
        sb.append("kottayam");
        sb.insert(0, "Hello ");
        System.out.println(sb);
        String s1 = sb.toString();
        System.out.println(sb.capacity());
        System.out.println(s1);
    }
}
