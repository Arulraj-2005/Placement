import java.util.Scanner;

class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Build prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int i = sc.nextInt();
        int j = sc.nextInt();

        int sum;
        if (i == 0)
            sum = prefix[j];
        else
            sum = prefix[j] - prefix[i - 1];

        System.out.println(sum);
    }
}
