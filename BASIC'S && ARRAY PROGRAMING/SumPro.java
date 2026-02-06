import java.util.Scanner;

public class SumPro {
    public static void main(String[] args) 
        {
            int[] a=new int[10];
            int s=0,p=1,i,n;
            System.out.print("Enter the no.of elements: ");
            try(Scanner sc=new Scanner(System.in);){
                n=sc.nextInt();
                System.out.print("Enter lements in array: ");
                for(i=0;i<n;i++)
                {
                    a[i]=sc.nextInt();
                }
               
                for(i=0;i<n;i++)
                {
                    s=s+a[i];
                    p=p*a[i];
                }
                System.out.println("Sum: "+s);
                System.out.println("Product: "+p);
                sc.close();
            }

        
        catch(Exception t){}
    }
}
