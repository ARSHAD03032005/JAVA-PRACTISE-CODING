import java.util.Scanner;
public class Fine {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.print("Enter Date : ");
            int d=sc.nextInt();
            System.out.print("Enter no.of vehicles: ");
            int n=sc.nextInt();
            int[] a=new int[n];
            System.out.print("Vehicle Number Plates: ");
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            int f=500;
            int ce=0,co=0,cf;
            if(d%2==0){
                for(int i=0;i<a.length;i++){
                    if(a[i]%2!=0){
                        co=co+1;
                    }
                }
                cf=co*f;
                System.out.println("No. of fine paid: "+co);
                System.out.println("Fine Amount: "+cf);
            }
            else{
                for(int i=0;i<a.length;i++){
                    if(a[i]%2==0){
                        ce=ce+1;
                    }
                }
                 cf=ce*f;
                System.out.println("No. of fine paid: "+ce);
                System.out.println("Fine Amount: "+cf);
            }
            
        }
        catch(Exception q){}
    }
    
}
