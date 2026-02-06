import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a year to check leap year or not:");
        try(Scanner obj=new Scanner(System.in);){
        n=obj.nextInt();
        if(n%100==0){
            if(n%400==0){
                System.out.println("Given Year "+n+" is Leap Year");
            }
            else{
                System.out.println("Given Year "+n+" is not a Leap Year");  
            }
        }
        else{
            if(n%4==0){
                System.out.println("Given Year "+n+" is Leap Year");
                }
            else{
                System.out.println("Given Year "+n+" is not a Leap Year");  
                }
            }
        
        obj.close();
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
