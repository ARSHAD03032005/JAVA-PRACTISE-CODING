
import java.util.Scanner;

public class SecGre {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
           System.out.print("\nEnter no.of elements:");
            int n=sc.nextInt();
            int[] a=new int[n];
            int max=0;
            System.out.print("Enter the elements:");
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                if(a[i]>max){
                    max=a[i];
                }
            }
            int secmax=0;
            for (int i = 0; i < n; i++) {
                if(a[i]>secmax&&a[i]<max){
                    secmax=a[i];
                }
            }
            System.out.println("Second Maximum Elements: "+secmax);


        } catch (Exception e) {
        }
    }
}
