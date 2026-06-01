import java.util.Scanner;

public class loop1{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int[] arr ={1,1,0,1,1,1};
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            count+=1;
            max=Math.max(max, count);
        }else{
            count=0;
        }
    }
    System.out.println(max);
} 
}
