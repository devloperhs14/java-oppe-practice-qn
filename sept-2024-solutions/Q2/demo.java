/* Write a program to find if a SmartWatch is a Weareable or Fitness Tracker Device?
*/

/*Topic : Interfaces & Abstract methods
*/

import java.util.*;
//DEFINE interface WearableGadget
interface WearableGadget{
    String showTime(); //public abstract
}

//DEFINE interface FitnessTracker
interface FitnessTracker{
    String trackSteps(); //public abstract
}

//DEFINE class SmartWatch
class SmartWatch implements WearableGadget, FitnessTracker{
    private String name;

    //constructor
    public SmartWatch(String n){
        name = n;
    }

    public String showTime(){
        return name + " shows the current time";
    }

    public String trackSteps(){
        return name + " plays media";
    }
}

class demo{
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
