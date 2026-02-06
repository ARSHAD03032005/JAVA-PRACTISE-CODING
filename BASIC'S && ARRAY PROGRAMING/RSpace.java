import java.util.Scanner;

public class RSpace {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);) {
            String s=sc.nextLine();
            String r=" ";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c==' '){
                    c=s.charAt(i+1);
                    r=r+c;              
                  }
                else{
                    r=r+c;
                  }
            }
            System.out.println("Characte Space :"+r);
            sc.close();
        } catch (Exception e) {
        }
}
}
