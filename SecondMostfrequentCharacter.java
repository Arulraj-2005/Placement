import java.util.*;
public class SecondMostfrequentCharacter {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }
        int[] freq = new int[256];
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        }
        int first = 0, second = 0;
        for(int i = 0; i < 256; i++){
            if(freq[i] > first){
                second = first;
                first = freq[i];
            } 
            else if(freq[i] > second && freq[i] != first){
                second = freq[i];
            }
        }
        for(int i = 0; i < 256; i++){
            if(freq[i] == second){
                System.out.println((char)i+" ");
                return;
            }
        }
        System.out.println("No second most frequent character");
    }
}