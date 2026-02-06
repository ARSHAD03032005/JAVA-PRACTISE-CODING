import java.util.Scanner;
public class Sum3D {
    public static void main(String[] args) {
        int a,b=0;
        try(Scanner obj=new Scanner(System.in);){
            System.out.println("Enter a 3-digit Number:");
            a=obj.nextInt();
            while(a!=0){
                b=b+a%10;
                a=a/10;

            }
            System.out.println("Answer Sum is "+b);
        obj.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
    
}
