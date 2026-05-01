public class AddOneArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int carry=0;
        arr[arr.length-1]++;
        int i=arr.length-2;
        if(arr[arr.length-1]>=10){
            carry=arr[arr.length-1]/10;  
        }
        
        while(carry>0){
                arr[i]=arr[i]+carry;
                carry=arr[i]/10;
        }
    
        
}
}
