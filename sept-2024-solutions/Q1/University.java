// Q1 Student deep copy constructor

// Define a copy constructor to create `s2` from `s1` such that changing the values of instance variables of either `s2` or `s1` does not affect the other one. 
/*
 * ## Test Case
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
 */
import java.util.*;
class Student{
    private String name;
    private String[] projects;

    //***** Define constructor(s) here
    // Method 2
    public Student(String n, String[] p){
        name = n;
        projects = Arrays.copyOf(p, p.length); // copy
    }

    public Student(Student s){
        name = s.name;
        projects = Arrays.copyOf(s.projects, s.projects.length);
    }
    
    // default parameterised constructor
    //copy constructor
    
    
    public void setName(String n) {
        name = n;
    }

    public void setProject(int indx, String g) {
        projects[indx] = g;
    }

    public String getName() {
        return name;
    }

    public String getProject(int indx) {
        return projects[indx];
    }
}

public class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] projects = {"Data Exploration", "Imaging", "MRI"};
        Student s1 = new Student("Ranjit", projects); 
        Student s2 = new Student(s1); 
        s2.setName(sc.next());
        s2.setProject(1, sc.next());
        System.out.println(s1.getName() + ":" + s1.getProject(1));
        System.out.println(s2.getName() + ":" + s2.getProject(1));
    }
}
