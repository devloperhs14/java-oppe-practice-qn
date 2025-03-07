/* QUESTION (OPPE PRACTICE 1)
 * Consider the program given below. Complete the program such that the program satisfies the given test cases.
 */
 // setters method!

import java.util.*;
class Rectangle{
    int w;    //width
    int h;    //height

    //methods - setters
    public void setw(int width){
        this.w = width;
    }

    public void seth(int height){
        this.h = height;
    }

    //width * height
    public int area(){
        return this.h * this.w;
    }
}

public class FClass{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // input
        int w = Integer.parseInt(sc.nextLine()); //10
        int h = Integer.parseInt(sc.nextLine()); //20
        Rectangle r = new Rectangle(); //object
        r.setw(w);
        r.seth(h);
        int area = r.area();
        System.out.print(area);
    }
}
