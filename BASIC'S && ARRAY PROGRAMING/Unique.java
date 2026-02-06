import java.util.Scanner;
public class Unique {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);) {
            System.out.print("\nEnter no.of elements: ");
            int n=sc.nextInt();
            System.out.println("Enter the elements in array: ");
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            System.out.println("Unique Elements: ");
            
            for (int i = 0; i < n; i++) {
                int c=0;
                for(int j=0;j<n;j++){
                    if(a[i]==a[j]){
                        c=c+1;
                    }
                }
                if(c==1)
                System.out.print(a[i]+" ");
            }
            sc.close();
        } catch (Exception e) {
        }
    }
}
