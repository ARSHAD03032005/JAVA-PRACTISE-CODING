
import java.util.Scanner;

public class EO {
    public static void main(String[] args) {
        int a[]=new int[10];
        int n,i,e=0,o=0;
        System.out.print("Enter No Of Elements: ");
        try(Scanner obj=new Scanner(System.in);){
            n=obj.nextInt();
            System.out.println("Enter The Elements In The Array: ");
            for(i=0;i<n;i++)
            {
                a[i]=obj.nextInt();
            }
            for(i=0;i<n;i++)
            {
                if(a[i]%2==0)
                {
                    e=e+a[i];
                }
                else{
                    o=o+a[i];
                }

            }
            System.out.println("Even Sum: "+e+"\nOdd Sum: "+o);
            obj.close();

        }
        catch(Exception m){}
    }
}
