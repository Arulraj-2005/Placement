
import java.util.Scanner;

public class Monkeys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int j=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int result=0;
        if(m%k!=0 ||  p%j!=0){
            result+=1;
        }
        int a=m/k;
        int b=p/j;
        result+=b+a;
        System.out.println(n-result);
    }
}
