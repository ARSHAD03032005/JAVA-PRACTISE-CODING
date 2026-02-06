
import java.util.Scanner;

public class Ignore {
    public static void main(String[] args) {
        int a[]=new int[10];
        int i,n;
        System.out.print("Enter No. Of Elements: ");
        try(Scanner sc=new Scanner(System.in);) {
            n=sc.nextInt();
            System.out.print("Enter The Elements: ");
            for (i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.print("Elements Printed After Ignoring Multiples Of 3: ");
            for(i=0;i<n;i++)
            {
                if(a[i]%3!=0){
                   
                    System.out.println(a[i]+" ");
                }
            }
                
            sc.close();
        } catch (Exception t) {
        }
    }
}
