Complete the Java code to raise an exception when the input age is either lower than the age to vote or is higher than the age to appear for UPSC exams or both.

* Class `InvalidAgeException` is a user-defined exception.
<br>
* Class `AgeExceptionTest` has the following members:
* **Static method `isEligibletoVote(int age)`** that takes an age (as an `int` value) and returns `true` if `age >= 18`.
* **Static method `isEligibletoWriteUPSC(int age)`** that takes an age (as an `int` value) and returns `true` if `age <= 32`.

## Criteria

* If `age < 18`, then the method should throw `InvalidAgeException` printing the message: `Invalid age to vote.`  
* Else, if `age > 32`, then the method should throw `InvalidAgeException` printing the message: `Invalid age to write UPSC.`


**`main` method** that takes as input an age, 
- invokes methods to check if a person of that age is eligible to vote, 
- and invokes another method to see if the person is eligible to write the UPSC exams. 
- If both are satisfied, then it prints `Eligible to vote and to write UPSC.`

### What you have to do:
- Define a user-defined exception: `InvalidAgeException`
- Define method `isEligibletoVote` inside class `InputExceptionTest`
- Define method `isEligibletoWriteUPSC` inside class `InputExceptionTest`

### Test Cases

```
Public test case 1 (Input):
 10
 Output:
 Invalid age to vote

 Public test case 2 (Input):
 33
 Output:
 Invalid age to write UPSC

 Private test case 1 (Input):
 18
 Output:
 Eligible to vote and to write UPSC

 Private test case 2 (Input):
 43
 Output:
 Invalid age to write UPSC
```