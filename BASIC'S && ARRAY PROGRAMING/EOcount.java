import java.util.Scanner;

public class EOcount {
    public static void main(String[] args) {
      int[] b=new int[5];
      int j,e=0,o=0;
    try(Scanner obj=new Scanner(System.in);){
     System.out.println("\nEnter the given elements:");
     for(j=0;j<b.length;j++){
       b[j]=obj.nextInt();
     } 
     for(j=0;j<b.length;j++){
          if(b[j]%2==0){
            e=e+1;
          }
          else{
            o=o+1;
          }
     }
      System.out.println("No Of Even Elements In An Array: "+e);
     System.out.println("No Of Odd Elements In An Array: "+o);

   obj.close();
    }
    
catch(Exception r){}

}
    
}
