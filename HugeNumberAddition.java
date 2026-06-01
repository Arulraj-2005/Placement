import java.util.Scanner;

public class HugeNumberAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        // Read number of digits of second number
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        // Result array (max size = max(n1, n2) + 1)
        int[] result = new int[Math.max(n1, n2) + 1];

        int i = n1 - 1, j = n2 - 1, k = result.length - 1;
        int carry = 0;

        // Add digits from right to left
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a[i--];
            if (j >= 0) sum += b[j--];

            result[k--] = sum % 10;
            carry = sum / 10;
        }

        // If carry remains
        if (carry > 0) {
            result[k] = carry;
        } else {
            k++;
        }

        // Print result
        for (; k < result.length; k++) {
            System.out.print(result[k] + " ");
        }
    }
}
