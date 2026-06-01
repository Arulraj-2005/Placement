import java.util.Scanner;

public class loop {
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while (num != 1 && num != 4) {
            num = isSum(num);  
        }

        System.out.println("Final num value: " + num);  
        input.close();
    }

    public static int isSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        
        }
        System.out.println(sum);
        return sum;
    }
}