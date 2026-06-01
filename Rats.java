import java.util.*;
class Rats{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rat=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int foods=sc.nextInt();
        int food=foods*rat;
        int min=Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ArrayList<Integer> subArr=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    subArr.add(arr[k]);
                }
                int sum=0;
                for(int a=0;a<subArr.size();a++){
                    sum+=subArr.get(a);
                }
                if(sum==food){
                    if(subArr.size()-1<min){
                        min=subArr.size()-1;
                    }
                }
            }
        }if(min==Integer.MAX_VALUE){
            System.out.println(0);
        }
        else{
        System.out.println(min);
        }
    }
}