import java.util.Scanner;
class Number{
    public static void main(String[] args) {
        int n;
        try(Scanner obj =new Scanner(System.in);){
        System.out.println("Enter a number:");
        n=obj.nextInt();
        if(n>0){
        System.out.println("Given Number is Positive Number");
        }
        else if(n<0){
        System.out.println("Given Number is Negitive Number");
        }
        else{
        System.out.println("Given Number is Zero");
        }
        obj.close();
    }
    catch(Exception e){
        System.out.println("e");
    }
    }
}