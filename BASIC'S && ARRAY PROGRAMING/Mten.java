import java.util.Scanner;
public class Mten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%10==0){
                int t=a[i];
                a[i]=a[n-i];
                a[n-i]=t;
            }
        }
        System.out.println("Elements Multipled by 10: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
