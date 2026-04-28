public class CountRabbitsAndChiken {
    public static void main(String[] args) {
        int leg=40;
        int head=15;
        int rabbit=(leg-(2*head))/2;
        int chicken=head-rabbit;
        System.out.println("Rabbits: " + rabbit);
        System.out.println("Chickens: " + chicken);
    }
    
}