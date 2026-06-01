
import java.util.Scanner;

public class Stockprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {   
            prices[i] = sc.nextInt();
        }
        int maxProfit = 0;
        int profit=0;
        int l=0,r=0;
        while(true){
            if(prices[l]>prices[r]){
                profit+=prices[r-1]-prices[l];
                maxProfit+=profit;
                profit=0;
                l=r;
                r++;
            }
            else if(r==prices.length-1){
                profit+=prices[r]-prices[l];
                maxProfit+=profit;
                profit=0;
                break;
            }else if(prices[l]<=prices[r]){
                r++;
            }
            
        }
        System.out.println(maxProfit);

    }
}
