/* QUESTION (OPPE PRACTICE 2)
 * Write a program to accept a string input from user and print the characters at even indices.
 */
 
 /* TOPICS
 input - string, static , void
 for loop , iterator , condtionals, java shorthand opertors, input, output, String methods
 */ 
 
import java.util.*;

class FClass1 {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in); //takes input from user
     String s1 = sc.next(); //retuns next input
     evenDisplay(s1);
   }

 //Define evenDisplay(String) method here\
 public static void evenDisplay(String s){
  for (int i=0; i<s.length(); i+=2){
    System.out.print(s.charAt(i)); 
  }
 }
}
