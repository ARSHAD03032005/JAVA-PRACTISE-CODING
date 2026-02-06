import java.util.Scanner;
public class Dynamic2D 
{
    public static void main(String[] args) {
     
      int a[][]=new int[3][3];
      try(Scanner obj=new Scanner(System.in);){
        System.out.println("\nEnter the given Elements:");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        a[i][j]=obj.nextInt();
        }}
      System.out.println("Dynamic Declaration:");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        System.out.print(a[i][j]+" ");
        }
             System.out.println("\n");
    }
   obj.close(); 
}
catch(Exception e){}
} 
    
}
