import  java.util.Scanner;
public class C3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int idx = 0; idx < a.length; idx++) {
            a[idx]=sc.nextInt();
        }
        int res=0;
        for (int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length;j++){
            if(a[i]<a[j]){
                res=res+(a[j]-a[i]);
                break;
            }
        }
        }
        System.out.println(res);
    }
    
}
