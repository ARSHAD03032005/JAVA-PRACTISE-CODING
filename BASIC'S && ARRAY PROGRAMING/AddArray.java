import java.util.Scanner;
public class AddArray {
    public static void main(String[] args) {
     try(Scanner sc=new Scanner(System.in);){
        int count=0;
        System.out.printf("\nr:");
        int r=sc.nextInt();
        System.out.print("unit:");
        int unit=sc.nextInt();
        System.out.print("n:"); 
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=a.length-1;i++){
            a[i]=sc.nextInt();
        }
        int sum=r*unit;
        int s=0;
        for(int i=0;i<=a.length-1;i++){
            if(sum>=s){
                s=s+a[i];
                count=count+1;
            }
        }
        System.out.println("Count: "+count);


     } catch (Exception e) {
     }
    }
}
