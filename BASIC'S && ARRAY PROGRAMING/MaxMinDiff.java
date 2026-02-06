import java.util.Scanner;
public class MaxMinDiff {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the size of an array: ");
            int n=sc.nextInt();
            System.out.println("Enter elements in an array: ");
            int[] a=new int[n];
            for(int i=0;i<a.length;i++){
              a[i]=sc.nextInt();
            }
            int max,min,f;
             max=a[0];
             min=a[0];
             for(int i=1;i<a.length;i++){
                if(max<a[i]){
                    max=a[i];
                }
                if(min>a[i]){
                    min=a[i];
                }
             }
             System.out.println("Maximum Element In An Array: "+max);
             System.out.println("Minimum Element In An Array: "+min);
             f=max-min;
             System.out.println("Difference Of Maximum Element In An Array & Minimum Element In An Array Is  "+f);
             sc.close();
        }
        catch(Exception q){}
    }
    
}
