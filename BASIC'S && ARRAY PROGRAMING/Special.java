import java.util.Scanner;
public class Special {
    public int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Special s=new Special();
        int n=sc.nextInt();
        
        int fact=0;
        int t;
        while(n!=0){
            t=n%10;
            fact=fact+s.factorial(t);
            n=n/10;
        }
       System.out.println("Special Number: "+fact);
       sc.close();
    }
}
