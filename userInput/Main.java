package userInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter username: ");

        String userName = obj.nextLine();
        System.out.println("username is "+ userName);

        int age = obj.nextInt();
        System.out.println(userName + " : "+ age);

        obj.close();
    }
}
