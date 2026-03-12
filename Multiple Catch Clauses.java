// Demonstrates exception handling using multiple catch blocks

public class MultipleCatchExample {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            // Arithmetic Exception
            int result = a / b;

            int arr[] = new int[5];

            // ArrayIndexOutOfBounds Exception
            arr[10] = 50;

        }

        // Catch arithmetic exception
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero");
        }

        // Catch array index exception
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds");
        }

        // Catch general exception
        catch (Exception e) {
            System.out.println("General Exception Occurred");
        }

        System.out.println("Program continues...");
    }
}
