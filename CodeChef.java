import java.util.*;
class CodeChef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()-1<10){
            System.out.println("NO");
            return;
        }
        boolean caps=false;
        boolean small=false;
        boolean digit=false;
        boolean special=false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' && i!=0 && i!=s.length()-1){
                caps=true;
            }
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                small=true;
            }
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                digit=true;
            }
            if(s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='%' || s.charAt(i)=='&' || s.charAt(i)=='?'){
                special=true;
            }
        }
        if(caps && small && digit && special){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}