import java.util.*;

class TrafficController{
    private int state=0;
    public synchronized void turnOnRed(int cycle,int time){
        try{
            while(state!=0){
                wait();
            }
            System.out.println("Cycle "+cycle+": RED on for "+time+" seconds");
            
            state=1;
            notifyAll();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public synchronized void turnOnYellow(int cycle,int time){
        try{
            while(state!=1){
                wait();
            }
            System.out.println("Cycle "+cycle+": YELLOW on for "+time+" seconds");
            
            state=2;
            notifyAll();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public synchronized void turnOnGreen(int cycle,int time){
        try{
            while(state!=2){
                wait();
            }
            System.out.println("Cycle "+cycle+": GREEN on for "+time+" seconds");
            
            state=0;
            notifyAll();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class Red extends Thread{
    private TrafficController obj;
    private int cycle;
    private int time;
    Red(TrafficController obj,int cycle ,int time){
        this.obj=obj;
        this.cycle=cycle;
        this.time=time;
    }
    public void run(){
        for(int i=1;i<=cycle;i++){
            obj.turnOnRed(i,time);
        }
    }
}
class Yellow extends Thread{
    private TrafficController obj;
    private int cycle;
    private int time;
    Yellow(TrafficController obj,int cycle ,int time){
        this.obj=obj;
        this.cycle=cycle;
        this.time=time;
    }
    public void run(){
        for(int i=1;i<=cycle;i++){
            obj.turnOnYellow(i,time);
        }
    }
}
class Green extends Thread{
    private TrafficController obj;
    private int cycle;
    private int time;
    Green(TrafficController obj,int cycle ,int time){
        this.obj=obj;
        this.cycle=cycle;
        this.time=time;
    }
    public void run(){
        for(int i=1;i<=cycle;i++){
            obj.turnOnGreen(i,time);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner input=new Scanner(System.in);
        int red=input.nextInt();
        int yellow=input.nextInt();
        int green=input.nextInt();
        int cycle=input.nextInt();

        TrafficController obj=new TrafficController();

        Red t1=new Red(obj,cycle,red);
        Yellow t2=new Yellow(obj,cycle,yellow);
        Green t3=new Green(obj,cycle,green);
        t1.start();
        t2.start();
        t3.start();
        try{

        t1.join();
        t2.join();
        t3.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}