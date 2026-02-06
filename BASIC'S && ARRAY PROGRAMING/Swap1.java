import java.util.Scanner;
class Swap1{
    public static void main(String[] args){
      int a,b,c;
      try(Scanner ob=new Scanner(System.in);){
      System.out.println("Enter two numbers:");
      a=ob.nextInt();
      b=ob.nextInt();
      System.out.println("Entered A & B is "+a+" & "+b);
      c=a;
      a=b;
      b=c;
      System.out.println("Swapped A & B with C is "+a+" & "+b);
      ob.close();  
       }
      catch(Exception e){
        System.out.println(e);
       }
    }
}