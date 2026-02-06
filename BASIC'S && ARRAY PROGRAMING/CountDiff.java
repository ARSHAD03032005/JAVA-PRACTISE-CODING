import java.util.Scanner;
public class CountDiff {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.print("Enter no.of elements: ");
            int n=sc.nextInt();
            int[] a=new int[n];
            System.out.print("Enter array: ");
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            int diff=2;
            int num=13;
            int c=0;
            for(int i=0;i<a.length;i++){
                if(num-a[i]<=diff){
                    c=c+1;
                }
            }
           System.out.println("No.of elements less than equal to difference: "+c);
        sc.close();
        }catch(Exception t){}
    }
}
    

