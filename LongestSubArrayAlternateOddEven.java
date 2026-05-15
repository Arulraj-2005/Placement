import java.util.*;
public class LongestSubArrayAlternateOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ArrayList<Integer> list=new ArrayList<>();
               for (int k = i; k <= j; k++) {
                   list.add(arr[k]);
               }
               if(list.size()%2==0){
               for(int a=0;a<list.size()-1;a+=2){
                    if(list.get(a)%2==0){
                        
                    }
               }
               }
            }
        }
    }
}
