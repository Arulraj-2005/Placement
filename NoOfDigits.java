public class NoOfDigits{
    public static void main(String args[]){
     int n=123;
     int count=0;
     while(n>0){
        n/=10;
        count+=1;
     }
     System.out.println(count);   
    }
}