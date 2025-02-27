# Problem Statement 1
Create a student deep copy constructor!

> Topics : Constructor, Copy Constructor, Deep Copy, Shallow Copy

## Problem Details
In a University, `Student s1` is working on a set of projects. `Student s2` also works on same set of projects as `s1` except for the second project, which `s2` replaces with another project. 

Write a program that defines two classes `Student` and `University`. 

Define a copy constructor to create `s2` from `s1` such that changing the values of instance variables of either `s2` or `s1` does not affect the other one. 
The program accepts name of student `s2` and the new book contributed by `s2` as input.

- Class `Student` has/should have the following members.
  - Private instance variables `String name` and `String[] projects` to store student's name and projects of the student respectively
  - Required constructor(s)
  - Accessor methods `getName()` and `getProject(int)` to get the student name and the book at a specific index respectively.
  - Mutator methods `setName(String)` and `setProject(int,String)` to set the name of the student and the project at a specific index respectively.

- Class `University` has method `main` that does the following.
  - Two objects of `Student s1` and `s2` are created using `s1`
  - name of Student `s2` and the second project of `s2` are updated by taking the input
  - Finally, name of `s1`, `s2` and second project of `s1` and `s2` are printed

## What you have to do
- Define a constructor to initialize the instance variables in class `Student`.
- Define a copy constructor in class `Student` to create `s2` from `s1`.

Java documentation can be accessed at: [https://docs.oracle.com/en/java/javase/11/docs/api](https://docs.oracle.com/en/java/javase/11/docs/api)

## Note: (Ignore)
It has been observed that when there are several concurrent submissions, sometimes we get ClassNotFoundException. In this case, please refresh, try again and try submitting multiple times.

## Test Case
```
Input:
Alice
AI Research
```
```
Output:
Ranjit:Imaging
Alice:AI Research
```