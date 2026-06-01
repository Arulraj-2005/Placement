import java.util.*;
public class NumberMirrorPrammid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<n-i+1;j++){
                System.out.print(" ");
            }
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num++);
            }
            num=num-2;
            for(int j=1;j<i;j++){
                System.out.print(num--);
            }

            System.out.println();
        }
        scanner.close();
    }
}