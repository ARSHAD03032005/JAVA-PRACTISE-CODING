
import java.util.Scanner;

public class RotateArray1 {
    static void rotate(int a[],int k){
        int temp=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
    }
 public static void main(String[] args) {
     int a[]={1,2,3,4,5};
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter no.of Rootations: ");
        int k=sc.nextInt();
        if(k<0){
            k=k+a.length;
        }
        k=k%a.length;
     for(int i=0;i<k;i++){
        rotate(a,k);
     }
      for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
     }
     sc.close();
 }   
}
