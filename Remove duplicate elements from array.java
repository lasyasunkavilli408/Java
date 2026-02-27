import java.util.Scanner;
class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) System.out.print(a[i] + " ");
        }
    }
}
