import java.util.Scanner;
public class FToggle {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String r=" ";
       int x=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(i==0){
            r=r+Character.toUpperCase(c);
            continue;
        }
        if(c==' '){ 
            char t=s.charAt(i+1);           
           if(Character.isLowerCase(t)){
            r=r+' '+Character.toUpperCase(t);
           }
        }
        else 
        {
            r=r+c;
        }
       }
       System.out.println(r);
        sc.close();
    }
}
