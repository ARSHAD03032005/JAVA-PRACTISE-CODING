
import java.util.Scanner;

class ACount{
public static void main(String[] args) {
    int a[]=new int[10];
    int n,i,count=1;
    try(Scanner sc=new Scanner(System.in);){
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
         a[i]=sc.nextInt();
    }
    for(i=1;i<n;i++){
        if(a[i-1]<=a[i])
        {
            count=count+1;
        }
    }
    System.out.println(count);
    sc.close();
}
catch(Exception e){}
}
}