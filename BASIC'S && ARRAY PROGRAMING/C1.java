import java.util.Arrays;
import java.util.Scanner;
public class C1 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);) {
            int n=sc.nextInt();
            int g[]=new int[n];
            for(int i=0;i<g.length;i++){
                g[i]=sc.nextInt();
            }    
            int m=sc.nextInt();
            int s[]=new int[m];
            for(int i=0;i<s.length;i++){
                s[i]=sc.nextInt();
            }
           Arrays.sort(s);
            int count=0;
            for(int i=0;i<g.length;i++){
                for(int j=0;j<s.length;j++){
                    if(s[j]>=g[i]){
                        count++;
                        i++;
                    }
                }
            }  
            System.out.println(count);      
        } catch (Exception e) {
        }
    }
}
