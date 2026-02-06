import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int f5,f10,f20;
     f5=0;
     f10=0;
     f20=0;
     int n=5;
     int b[]=new int[n];
     for(int i=0;i<b.length;i++){
        b[i]=sc.nextInt();
     }
     for(int i=0;i<b.length;i++){
        if(b[i]==5){
            f5=f5+1;
        }
        else if(b[i]==10){
            if(f5==0){
                System.out.println("false");
                return;
            }
            else{
                f5=f5-1;
                f10=f10+1;
            }
        }
        else{
            if(f5>0 && f10>0){
                f5=f5-1;
                f10=f10-1;
                f20=f20+1;
            }
            else if(f5>=3){
                f5=f5-3;
                f20=f20+1;
            }
            else{
                System.out.println("false");
                return;
            }
        }
     }

     System.out.println("true");
     sc.close();

    }
}
