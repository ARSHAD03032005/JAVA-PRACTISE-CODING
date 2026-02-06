import java.util.Scanner;
public class Toggle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);) {
            String s=sc.nextLine();
            String r=" ";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if( c>='a' && c<='z'){
                    r=r+(char)(c-32);
                }
                else  if( c>='A' && c<='Z'){
                    r=r+(char)(c+32);
                }
                else{
                    r=" ";
                }
            }
            System.err.println("Toggeled String:"+r);
            
        } catch (Exception e) {
        }
    }
}
