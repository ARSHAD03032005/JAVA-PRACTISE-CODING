import java.util.Scanner;
public class ReplaceGreater {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
          int n=sc.nextInt();
          int[] a=new int[n];
          for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
          }
          
        int t=a[n-1];
          System.out.println("Replaced Array: ");
          
          for (int i=0;i<a.length-1;i++) {
             if(a[i]<a[i+1]){
                a[i]=a[i+1];
                System.out.print(a[i]+" ");
             }
         
              else{
                a[i]=-1;
                System.out.print(a[i]+" ");
              }
          }
            System.out.print(t+" ");
        
          sc.close();
        }catch(Exception e){

        }
    }
    
}
