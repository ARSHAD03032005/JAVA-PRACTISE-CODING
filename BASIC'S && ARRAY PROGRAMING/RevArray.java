import  java.util.Scanner;
public class RevArray {
    public static void main(String[] args) {
        int[] rno = new int[50];
        try(Scanner sc=new Scanner(System.in);){
        System.out.println("\nEnter Array Size:");
        int n=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            rno[i] = i + 1;
        }
        System.out.println("\nArray in Reverse Order:");
        for (int i = n-1; i >= 0; i--) {
            System.out.print(rno[i] + " ");
        }
        sc.close();
    }
    catch(Exception x){}
    }
}
