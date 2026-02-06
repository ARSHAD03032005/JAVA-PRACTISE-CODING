import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        TwoSum Q=new TwoSum();
        System.out.print("\nENTER THE SIZE OF ARRAY:");
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("ENTER THE ELEMENTS OF ARRAY:");
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("ENTER THE TARGET VALUE:");
            int t=sc.nextInt();
            System.out.println("THE INDICES ARE:"+ Arrays.toString(Q.resultIndices(a,t)));
        }
    }


    int[] resultIndices(int[] a,int targert){
         Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int diff=targert-a[i];
            if(m.containsKey(diff)){
                return new int[]{m.get(diff),i};
            }
            m.put(a[i],i);
        }
        return null;

    }
}
