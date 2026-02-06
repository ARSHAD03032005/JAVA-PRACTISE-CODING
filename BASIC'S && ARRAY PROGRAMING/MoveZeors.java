
import java.util.Scanner;

public class MoveZeors {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in);) {
            MoveZeors z=new MoveZeors();
            System.err.println("Enter the size of the array: ");
            int n=sc.nextInt();
            System.out.println("Enter " + n +" elements: ");
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            System.out.println("Move zeroes array is : ");
            z.solution(a);
            for(int t:a){
                System.out.print(t+" ");
            }
            sc.close();

        } catch (Exception e) {
        }
    }
    public void solution(int[] a){
        int p=0;
        for(int t:a){
            if(t!=0){
                a[p]=t;
                p++;
            }
        }
        while(p<a.length){
            a[p]=0;
            p++;
        }
}
}
