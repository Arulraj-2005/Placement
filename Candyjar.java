import java.util.*;
public class Candyjar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int buy=sc.nextInt();
        int total=n-k;
        int sold=0;
        System.out.println("no.of candies bought: "+buy);
        System.out.println("No.of candies remaining: "+(total+buy));
    }
}
