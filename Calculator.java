public class Calculator {
    String calculatorName;
    String color;
    public int add(int n1, int n2) {
        return n1+n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1+n2+n3;
    }

    public int add(int n1, int n2, int n3, int n4) {
        return n1+n2+n3+n4;
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println(cal.add(1, 2));
        System.out.println(cal.add(1, 2, 3));
        System.out.println(cal.add(1, 2, 3, 4));
    }
}
