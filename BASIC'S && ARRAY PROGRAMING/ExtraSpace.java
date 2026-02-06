
import java.util.Scanner;

public class ExtraSpace {
    public static void main(String[] args) {
        int a[]=new int[10];
        int n,i;
        try(Scanner sc=new Scanner(System.in);) {
            System.out.println("Enter No Of Elements: ");
            n=sc.nextInt();
            System.out.println("Enter Elements: ");
            for (i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.print("Actual Array: ");
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.print("\nChanged Array: ");
            for(i=0;i<n;i++)
            {
                if(a[i]%10==0)
                {
                }
                else{
              System.out.print(a[i]+" ");
                }
            }
            for(i=0;i<n;i++)
            {
                if(a[i]%10==0)
                {
                    System.out.print(a[i]+" ");
                }
              
            }
            
        } catch (Exception e) {
        }
    }
}
