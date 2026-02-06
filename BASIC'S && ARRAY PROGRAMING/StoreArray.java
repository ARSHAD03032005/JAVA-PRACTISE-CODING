import java.util.Scanner;

public class StoreArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the size of the array (up to 50): ");
        int size = sc.nextInt();

        if (size > 50 || size <= 0) {
            System.out.println("Invalid size! Please enter a number between 1 and 50.");
            sc.close();
            return;
        }

        int[] rno = new int[size];

        
        for (int i = 0; i < size; i++) {
            rno[i] = i + 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + rno[i]);
        }

        sc.close();
    }
}

