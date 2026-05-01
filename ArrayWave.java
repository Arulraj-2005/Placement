import java.util.Scanner;

public class ArrayWave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=true;
        // for(int i=0;i<arr.length-1;(flag?i+=2:i++)){
        //     if(arr[i]!=arr[i+1]){
        //     int temp=arr[i];
        //     arr[i]=arr[i+1];
        //     arr[i+1]=temp;
        //     }else{
        //        flag=false;
        //     }
        // }
        int i=0;
        while(i<arr.length-1){
            if(arr[i]!=arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            }else{
               flag=false;
            }
            if(flag){
                i+=2;
            }else{
                i++;
            }
        }
        for(int n1:arr){
            System.out.print(n1+" ");
        }
    }
}
