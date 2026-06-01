
import java.util.*;

public class Interleaving {
    public static void main(String[] args) {
        int[] q=new int[] {2,4,3,1};
        Queue<Integer> q1=new LinkedList<>();
        for(int i=0;i<q.length/2;i++){
            q1.add(q[i]);
        }
        Queue<Integer> q2=new LinkedList<>();
        for(int i=q.length/2;i<q.length;i++){
            q2.add(q[i]);
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            System.out.print(q1.poll()+" ");
            System.out.print(q2.poll()+" ");
        }
    }
}
