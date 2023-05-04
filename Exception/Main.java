package Exception;

class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int res = 0;

        try {
            res = x/y;
            System.out.println(res);
            if (res == 0){
                throw new CustomException("Result is zero ");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        
        catch(Exception e){
            System.out.println("Some error"+ e);
        }
    }
}
