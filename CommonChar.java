import java.util.*;
public class CommonChar{
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "grape";
        Set<Character> set = new HashSet<>();
        for(char c : s1.toCharArray()) {
            set.add(c);
        }
        for(char c : s2.toCharArray()) {
            if(set.contains(c)) {
                System.out.print(c + " ");
                set.remove(c);
            }
        }
    }
} 
