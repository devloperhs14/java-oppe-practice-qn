//Student copy constructor

import java.util.*;
class Student{
    private String name;
    private String[] projects;

    //***** Define constructor(s) here
    // public Student(String n, String[] p){
    //     name = n;
    //     projects =  p;
    // }

    // public Student(Student s){
    //     name = s.name;
    //     projects = new String[s.projects.length];
    //     for (int i = 0; i< projects.length; i++){
    //         projects[i] = s.projects[i];
    //     }
    // }

    // way 2 - much easier
    public Student(String n, String[] p){
        name = n;
        projects =  Arrays.copyOf(p, p.length);
    }

    public Student(Student s){
        name = s.name;
        projects =  Arrays.copyOf(s.projects, s.projects.length);
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

public class DeepUniversity{
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
