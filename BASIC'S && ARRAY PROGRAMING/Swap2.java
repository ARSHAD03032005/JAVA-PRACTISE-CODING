import java.util.Scanner;
class Swap2{
    public static void main(String[] args){
      int a,b;
      try(Scanner ob=new Scanner(System.in)){
      System.out.println("Enter two numbers:");
      a=ob.nextInt();
      b=ob.nextInt();
      System.out.println("Entered A & B is "+a+" & "+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("Swapped A & B without C is "+a+" & "+b);
      ob.close();  
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}