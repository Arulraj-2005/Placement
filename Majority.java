import java.util.*;
public class Majority {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> freqMap=new HashMap<>();

        for(int i=0;i<n;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()>n/2){
                System.out.println(entry.getKey());
                return;
            }
        }
        System.out.println(-1);
    }
}
