import java.util.*;
public class rotateK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<k;i++){
            st.push(arr[i]);
        }
        Queue<Integer> q = new LinkedList<>();
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=k;i<arr.length;i++){
            q.add(arr[i]);
        }
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }    
    }
}