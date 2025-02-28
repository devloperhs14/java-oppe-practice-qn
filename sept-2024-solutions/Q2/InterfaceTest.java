import java.util.*;
//DEFINE interface WearableGadget
interface WearableGadget{
    String showTime(); //by default public abstract
}
//DEFINE interface FitnessTracker
interface FitnessTracker{
    String trackSteps();
}
//DEFINE class SmartWatch
class SmartWatch implements WearableGadget, FitnessTracker{
    private String name;

    //constructor
    public SmartWatch(String name){
        this.name = name;
    }

    //define showtime
    public String showTime(){
        return name + " shows the current time";
    }

    //define tracksteps
    public String trackSteps(){
        return name + " plays media";
    }
}

class InterfaceTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> messagesList = new ArrayList<>();
        
        for(int i=0;i<3;i++){
            String type = sc.next();
            
            if (type.equals("W")){
                WearableGadget g = new SmartWatch(sc.next());
                messagesList.add(g.showTime());
            }
            else if (type.equals("F")){
                FitnessTracker t = new SmartWatch(sc.next());
                messagesList.add(t.trackSteps());
            }
        }
        for (String s:messagesList){
            System.out.println(s);
        }
        sc.close();
    }
}
