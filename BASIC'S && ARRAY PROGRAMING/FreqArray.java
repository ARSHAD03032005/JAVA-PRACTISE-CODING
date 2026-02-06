import java.util.Scanner;
public class FreqArray {
  public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in);){
        System.out.println("Enter The Size Of An Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter The Elements In An Array:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter The Targert To Find Frequency:");
        int t=sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(t==a[i]){
                count++;
            }
        }
        System.out.println("Frequency Of Target Element "+t+" Is "+count+" Times");

          sc.close();
    }
    catch(Exception q){}
  }  
}
