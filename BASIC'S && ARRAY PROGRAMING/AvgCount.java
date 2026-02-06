
import java.util.Scanner;

public class AvgCount {
    public static void main(String[] args){
        try(Scanner sc =new Scanner(System.in);){
            System.out.print("\nEnter no.of elements: ");
            int n=sc.nextInt();
            System.out.println("Enter the elements:");
            int a[]=new int[n];
            int sum=0,c=0;
            for (int i=0;i< n; i++) {
                a[i]=sc.nextInt();
                sum=sum+a[i];
                c=c+1;
            }
            int avg=sum/c;
            System.out.println("The average of array is: "+avg);
            System.out.println("The Elements greater than average: ");
            for (int i = 0; i < n; i++) {
               if(avg<=a[i]) {
                System.out.print(a[i]+" ");
               }
            }
            sc.close();
        } catch (Exception e) {
        }
    }
}
