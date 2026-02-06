
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class CONTAINS_DUP1 {
    public static void main(String[] args){
        
        try(Scanner sc=new Scanner(System.in);) {
            CONTAINS_DUP1 c=new CONTAINS_DUP1();
            System.out.print("\nEnter the size of array:");
            int s=sc.nextInt();
            System.out.println("Enter "+s+" elements in array: ");
            int[] n=new int[s];
            for (int i = 0; i < n.length ; i++) {
                n[i]=sc.nextInt();
            }
            if(c.containsDup(n)){
                System.out.println("Array contains duplicate elements");
            }
            else{
                System.out.println("Array dosn't contains duplicate elements");
            }
            sc.close();
        } catch (Exception e) {
        }
    }
    public  boolean containsDup(int[] n){
      Set<Integer> p=new HashSet<>();
      for(int i=0;i<n.length;i++){
        if(p.contains(n[i])){
            return true;
        }
        else{
            p.add(n[i]);
        }
    }
    return  false;
    }
}
