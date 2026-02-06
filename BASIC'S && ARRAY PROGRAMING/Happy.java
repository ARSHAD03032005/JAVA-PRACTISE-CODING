import java.util.Scanner;
public class Happy {
   public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in);) {
        int n=sc.nextInt();
        boolean b=true;
        int sum;
        while(n>9||b)  {
            b=false;
            sum=0;
            while(n>0){
             sum+=Math.pow(n%10,2);
             n=n/10;
            }
            n=sum;
        }
        if(n==1){
            System.out.println("Happy Number");
        }
        else{
            System.err.println("Not a Happy Number");
        }

       } catch (Exception e) {
       }
   } 
}
