import java.util.Scanner;
public class MagicHappy {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);) {
            int n=sc.nextInt();
            int sum;
            while(n>=10){
                  sum=0;
                  while(n>0){
                    sum=sum+n%10;
                    n=n/10;
                  }
                  n=sum;
           }
            if(n==1){
                System.out.println("Magic Number");
            }
            else{
                System.out.println("Not a Magic Number");
            }
            sc.close();

        } catch (Exception e) {
        }
    }
}
