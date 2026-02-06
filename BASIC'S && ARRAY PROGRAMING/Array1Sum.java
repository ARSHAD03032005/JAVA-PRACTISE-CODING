import java.util.Scanner;

public class Array1Sum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] rno = new int[size];
        int sum = 0;

       
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            rno[i] = sc.nextInt();
            sum += rno[i]; // add to sum directly
        }

       
        System.out.println("\nArray elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + rno[i]);
        }

        
        System.out.println("\nSum of array elements: " + sum);

        sc.close();
          } catch (Exception e) {}
    }
}
