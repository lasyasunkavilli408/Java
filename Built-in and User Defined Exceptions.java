//Custom Exception Class
// User defined exception class

class AgeException extends Exception {

    AgeException(String message) {
        super(message);
    }
}
//Main Program
// Demonstrates built-in and user-defined exceptions

import java.util.Scanner;

public class ExceptionExample {

    static void checkAge(int age) throws AgeException {

        if(age < 18) {
            throw new AgeException("You must be 18+ to vote");
        }
        else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            checkAge(age);

        }

        catch(AgeException e) {
            System.out.println("User Defined Exception: " + e.getMessage());
        }

        catch(Exception e) {
            System.out.println("Built-in Exception occurred");
        }
    }
}
