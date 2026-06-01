public class Soldier{
    public static void main(String[] args) {
        int n = 10;
        boolean [] visited = new boolean[n+1];
        for(int i=1; i<=n; i++){
            visited[i] = true;
        }
        int i=1;
        int count =n;
        while(count>1){
            int next =i;
            do { 
                next = (next%n)+1;
            } while (!visited[next]);
            visited[next] = false;
            count--;
            do { 
                i=(i%n)+1;
            } while (!visited[i]);
        }
        for(int j=1; j<=n; j++){
                System.out.println(j+" "+visited[j]);
        }
    }
}