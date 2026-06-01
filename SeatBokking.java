import java.util.*;
public class SeatBokking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seats=new int[n];
        while (true) { 
            int seatNumber = sc.nextInt();
            if(seatNumber==-1){
                break;
            }
            if (seatNumber<0 || seatNumber >= n) {
                System.out.println("Invalid seat number.");
                continue;
            }
            if(seats[seatNumber]==0){
                System.out.println("Seat " + seatNumber + " booked successfully.");
                seats[seatNumber]=1;
            } else {
                System.out.println("Seat " + seatNumber + " is already booked.");
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(seats[i]+" ");
        }
    }
}