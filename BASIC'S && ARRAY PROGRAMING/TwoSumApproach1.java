public class TwoSumApproach1 {
    static int[] twosum(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == key) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // return -1, -1 if not found
    }

    public static void main(String[] args) {
        int[] a = {16, 4, 23, 8, 15, 42, 1, 2};
        int key = 19;
        int[] result = twosum(a, key);
        System.out.println(result[0] + " " + result[1]);
    }
}
