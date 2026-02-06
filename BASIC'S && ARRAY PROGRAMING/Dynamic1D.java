import java.util.Scanner;
public class Dynamic1D {
    public static void main(String[] args) {
      int[] b=new int[5];
      int j;
    try(Scanner obj=new Scanner(System.in);){
     System.out.println("\nEnter the given elements:");
     for(j=0;j<b.length;j++){
       b[j]=obj.nextInt();
     } 
     System.out.println("\nDynamic Declaration:"); 
     for(j=0;j<b.length;j++){
     System.out.print(b[j]+" ");
     }
   obj.close();
    }
    
catch(Exception e){}

}
}
    



