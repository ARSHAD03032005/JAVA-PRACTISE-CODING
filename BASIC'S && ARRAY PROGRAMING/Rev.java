import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
      int[] b=new int[5];
      int[] a=new int[5];
       int i,j;
    try(Scanner obj=new Scanner(System.in);){
     System.out.println("\nEnter the given elements:");
     for(j=0;j<b.length;j++){
       b[j]=obj.nextInt();
     } 
  
      System.out.println("\nActual given elements:");
     for(j=0;j<b.length;j++){
       System.out.print(b[j]+" ");
     } 
     for(i=0,j=b.length-1;j>=0;i++,j--)
     {
        a[i]=b[j];
     }
     System.out.println("\nReverse Elements In Array:");
     for(j=0;j<b.length;j++){
       System.out.print(a[j]+" ");
     } 
   obj.close();
    }
    
catch(Exception r){}

}
}
