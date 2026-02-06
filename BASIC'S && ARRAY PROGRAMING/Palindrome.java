import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
      }
      int c=1;
      for(int i=0,j=1;i<a.length;i++,j++){
        if(a[i]==a[n-j]){
            c=1;
            continue;
        }
        else{
            c=0;
        }
      }
      if(c==1){
      System.out.println("Palindrome Array");
      }
      else{
        System.out.println("Not a Palindrome");
      }
      sc.close();
  }
}
