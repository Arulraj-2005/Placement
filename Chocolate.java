import java.util.*;
public class Chocolate {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int price=sc.nextInt();
    int total=0;
    while(price>0){
        int q=price/3;
        int rem=price%3;
        total+=q;
        price=q+rem;
    }
    System.out.println(total);
}
}   