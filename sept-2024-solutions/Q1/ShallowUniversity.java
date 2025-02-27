import java.util.*;

class Student {
    private String name;
    private String[] projects;

    // Constructor
    public Student(String n, String[] p){
        name = n;
        projects = Arrays.copyOf(p, p.length); // copy
    }

    // Shallow Copy Constructor
    public Student(Student s){
        name = s.name;
        projects = Arrays.copyOf(s.projects, s.projects.length);
    }

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

public class ShallowUniversity {
    public static void main(String[] args) {
        String[] projects = {"Data Exploration", "Imaging", "MRI"};
        Student s1 = new Student("Ranjit", projects);
        Student s2 = new Student(s1); // Using the shallow copy constructor
        
        // Hardcoded values instead of user input
        s2.setName("Alice");
        s2.setProject(1, "AI Research");
        
        System.out.println(s1.getName() + ":" + s1.getProject(1));
        System.out.println(s2.getName() + ":" + s2.getProject(1));
    }
}
