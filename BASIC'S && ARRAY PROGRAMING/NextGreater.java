import java.util.Scanner;

public class NextGreater {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){ 

        // Input for arr1
        System.out.println("Enter size of arr1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of arr1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for arr2
        System.out.print("Enter size of arr2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of arr2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        
        System.out.println("\nNext Greater Elements:");
        for (int i = 0; i < n1; i++) {
            int element = arr1[i];
            int nextGreater = -1;

           
            int indexInArr2 = -1;
            for (int j = 0; j < n2; j++) {
                if (arr2[j] == element) {
                    indexInArr2 = j;
                    break;
                }
            }

           
            if (indexInArr2 != -1) {
                for (int k = indexInArr2 + 1; k < n2; k++) {
                    if (arr2[k] > element) {
                        nextGreater = arr2[k];
                        break;
                    }
                }
            }

    
            System.out.println(element + " -> " + nextGreater);
        }

        sc.close();
    }
catch(Exception z){

}
}
}

