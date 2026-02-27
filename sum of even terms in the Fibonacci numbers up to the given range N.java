import java.util.Scanner;
class EvenFibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range N: ");
        int n = sc.nextInt();
        int a = 0, b = 1, sum = 0;
        while (a <= n) {
            if (a % 2 == 0) sum += a;
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Sum of even Fibonacci numbers = " + sum);
    }
}
