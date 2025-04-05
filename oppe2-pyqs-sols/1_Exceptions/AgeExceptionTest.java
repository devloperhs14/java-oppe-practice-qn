import java.util.Scanner;

// DEFINE a user-defined exception: InvalidAgeException
// must extend exception
// define paramrized constructor - as need to use it to throw exception with text
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg); 
    }
}


public class AgeExceptionTest {
    // DEFINE method isEligibletoVote
    // make sure to also throw the exception - as a new exception object
    // must use throws, to skip try catch
    public static boolean isEligibletoVote(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Invalid age to vote");
        } else {
            return true;
        }
    }

    // DEFINE method isEligibletoWriteUPSC
    public static boolean isEligibletoWriteUPSC(int age) throws InvalidAgeException{
        if (age > 32){
            throw new InvalidAgeException("Invalid age to write UPSC");   
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        try {
            isEligibletoVote(age);
            isEligibletoWriteUPSC(age);
            System.out.println("Eligible to vote and to write UPSC");
        } catch (InvalidAgeException ie) {
            System.out.println(ie.getMessage());
        }
        sc.close();
    }
}
