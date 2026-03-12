import java.io.*;
import java.util.*;

public class EvenOddFile {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // File writers
        FileWriter evenFile = new FileWriter("Even.txt");
        FileWriter oddFile = new FileWriter("Odd.txt");

        System.out.println("Enter numbers (enter -1 to stop):");

        while(true){

            int num = sc.nextInt();

            if(num == -1)
                break;

            // Check even or odd
            if(num % 2 == 0){
                evenFile.write(num + "\n");
            } else{
                oddFile.write(num + "\n");
            }
        }

        evenFile.close();
        oddFile.close();

        System.out.println("Numbers saved to files successfully.");
    }
}
