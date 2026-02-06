import java.util.Scanner;
class Small4{
    public static void main(String[] args){
        int a,b,c,d;
        try(Scanner obj=new Scanner(System.in);){
            System.out.print("Enter 4 Integers: ");
            a=obj.nextInt();
            b=obj.nextInt();
            c=obj.nextInt();
            d=obj.nextInt();
            if(a<=b&&a<=c&&a<=d){
                System.out.println("Smallest Number Is "+a);
            }
            else if(b<=c&&b<=d){
                System.out.println("Smallest Number Is "+b);
            }
            else if(c<=d){
                System.out.println("Smallest Number Is "+c);
            }
            else{  
                System.out.println("Smallest Number Is "+d);
            }
            obj.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}