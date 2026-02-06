
import java.util.Scanner;

public class GreaterNei {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);) {
            System.out.print("\nEnter no.of elements:");
            int n=sc.nextInt();
            System.out.print("Enter the elements:");
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                  a[i]=sc.nextInt();
            }
            System.out.print("Greater Elements To their Neighbors: ");
            for (int i = 1; i < n-1; i++) {
                if(a[i]>a[i-1]&&a[i]>a[i+1]){
                    System.out.println(a[i]+" ");
                }
                
            }

        } catch (Exception e) {
        }
    }
}
