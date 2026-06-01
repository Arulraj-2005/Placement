public class Pattern1{
    public static void main(String[] args) {
       System.out.println("Vertical:");
       for(int i=0;i<5;i++){
        System.out.println("*");
       }
       System.out.println("Horizontal");
       for(int i=0;i<5;i++){
        System.out.print("*");
       }
       System.out.println("Cross Pattern");
       for (int i = 0; i < 5; i+=2) {
           for (int j =0; j <5 ; j++) {
            System.out.print("*");
           }
           System.out.println("*");
       }
    }
}