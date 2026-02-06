import java.util.HashMap;
import java.util.Map;

public class TwoSumApproach2 {
    static int[] twosum(int[] a, int key) {
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int complement=key-a[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(a[i],i);
        }
      return new int[]{-1,-1} ;
    }

    public static void main(String[] args) {
        int[] a = {16, 4, 23, 8, 15, 42, 1, 2};
        int key = 19;
        int[] result = twosum(a, key);
        System.out.println(result[0] + " " + result[1]);
    }
}
