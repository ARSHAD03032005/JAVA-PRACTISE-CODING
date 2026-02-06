import java.util.Scanner;
public class Large {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[8];
        int i=0;
        while(n!=0){
            a[i]=n%10;
            n=n/10;
            i++;
        }
        int max=0;
        for(int j=0;j<=i;j++){
            if(a[j]>max){
                max=a[j];
            }
        }
        System.out.println("Largest Digit:"+max);
        sc.close();
    }
}   

