import java.util.Scanner;

public class CheckIndex {
    public static void main(String[] args) {
      int a[]=new int[5];
      int m=0;
      try(Scanner obj=new Scanner(System.in);){
        System.out.println("\nEnter the given Elements:");
      for(int i=0;i<5;i++){
        a[i]=obj.nextInt();
        }
    System.out.print("Enter the key element to find index:");
    int key=obj.nextInt();

      for(int i=0;i<5;i++){
         if(key==a[i])
         {
            System.out.print(a[i]+" Index is: "+i);
            m=1;
            break;

         }  
    }
  if(m!=1){
 System.out.println("Index Not Found For Key Element");

  }
           
    obj.close();
      }
      catch(Exception e){}
}

    

}
