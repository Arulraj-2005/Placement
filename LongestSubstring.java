import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String str ="abcabcbb";

        // for(int i=0;i<=str.length();i++){
        //     for(int j=i+1;j<=str.length();j++){
        //         System.out.println(str.substring(i, j));
        //     }
        // }

        Set<Character> set = new HashSet<>();
        int left =0;
        int right =0;
        int max=0;
        for(right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                max=Math.max(max, right-left);
                left++;
            }
            set.add(str.charAt(right));
        }
        System.out.println(max);
    }
    
}