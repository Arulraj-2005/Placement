import java.util.*;
public class QeueSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {5,1,2,6,3,4};
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                st.push(arr[i-1]);
            }
            else{
                q.add(arr[i-1]);
            }
        }
        System.out.println(st);
        System.out.println(q);
        q.add(arr[arr.length-1]);        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        boolean sorted = true;
        int prev = q.poll();
        while(!q.isEmpty()){
            int curr = q.poll();
            if(curr<prev){
                sorted=false;
                break;
            }
            prev=curr;
        }
        if(sorted){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    
}