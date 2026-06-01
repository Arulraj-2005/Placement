import java.util.*;
public class CowsAndBulls {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first Player Name:");
      String n1=sc.nextLine();
      System.out.println("Enter the second Player Name:");
      String n2=sc.nextLine();
      int turns=2;
      int a=0;
      int score1=0;
      while (turns>0) {
            System.out.println("Enter secret number:");
            String[] secret=sc.nextLine().split(" ");
            a=0;
            while(true){
            a++;
            System.out.println("Enter guess number:");
            String[] guess=sc.nextLine().split(" ");
            int cows=0;
            int bulls=0;
            
            for(int i=0;i<secret.length;i++){
                if(secret[i].equals(guess[i])){
                    cows++;
                }
                else{
                    for(int j=0;j<secret.length;j++){
                        if(secret[i].equals(guess[j]) && i!=j){
                            bulls++;
                        }
                    }
                }
             }
             System.out.println("Cows: " + cows + ", Bulls: " + bulls);
                if(cows==secret.length){
                    System.out.println("Correct Guess!");
                    turns--;
                    break;
                }
            
            }
            score1=a;

      }
      
      if(score1>a){
            System.out.println(n1 + " wins with score: " + score1);
        }
        else if(score1<a){
            System.out.println(n2 + " wins with score: " + a);
        }
        else{
            System.out.println("It's a tie!");
      }
      
    }
}
