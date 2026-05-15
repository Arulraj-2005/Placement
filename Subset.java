import java.util.ArrayList;
import java.util.Scanner;

public class Subset {
    public static void CreateSubset(ArrayList<Integer> list,int[] arr,int Start){
       System.out.println(list);
       
       for(int i=Start;i<arr.length;i++){
           list.add(arr[i]);
           CreateSubset(list, arr, i+1);
           list.remove(list.size()-1);
       }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        CreateSubset(new ArrayList<>(), arr, 0);
    }
}
