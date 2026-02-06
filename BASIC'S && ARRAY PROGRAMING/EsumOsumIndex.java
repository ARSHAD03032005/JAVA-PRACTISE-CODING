import java.util.Scanner;

public class EsumOsumIndex {
    public static void main(String[] args) 
        {
            int a[]=new int[10];
            int e=0,o=0,n,i;
            System.out.println("Enter No Of Elements To Enter: ");
            try(Scanner sc=new Scanner(System.in);){
              n=sc.nextInt();
            System.out.print("Enter The Elements: ");
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++) {
               if(i%2==0)
               {
                e=e+a[i];
               }
               else{
                o=o+a[i];
               }
                
            }
                System.out.println("Even Sum: "+e);
                System.out.println("Odd Sum: " +o);
            
                sc.close();
            }

        
        catch(Exception t){}
    }
}
