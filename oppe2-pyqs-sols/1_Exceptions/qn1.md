Problem Statement

Write a Java program that allows the user to create projects, add team members to each project, and ensure that every project has at least one team member. If the project doesn’t have any member, then add a default team member. 
<br>
The program takes the project name, number of team members followed by team members' names of some projects as input and finally prints the project list with their team members. Complete the program as specified below.

Class **NoTeamMemberException** extends the Exception class and should have the following member:
* Constructor that calls its `superclass` constructor

Class **Project** has/should have the following members:

* Private instance variables `String projectName` and `List<String> teamMembers`
* A constructor to initialize the instance variables
* Method `addTeamMember` that adds a team member to the project
* Method `toString` to print in the format shown in the test cases
* Method `hasTeamMembers` that returns `true` if the project has team members, and throws `NoTeamMemberException` otherwise

Class **ProjectManager** has the following members:

* Method `updateProjectList` that takes a `Project` list as a parameter and checks if each project has at least one team member. If not, it catches the `NoTeamMemberException` and adds a default team member to the project
* Method `displayProjectList` that takes a `Project` list as a parameter and prints the updated project list
* Method `main` takes input to create a `Project` list, invokes the `updateProjectList` method to ensure that each project has at least one team member, and also invokes the `displayProjectList` method to print the updated project list.

**What you have to do**
• Define class `NoTeamMemberException`
• Define method `updateProjectList` in class `ProjectManager`


----

Test Case 

```
 Public test case 1:
 Input:
 ChatGPT-Enhancement 3 Alice Bob Charlie
 OpenAI-Research 2 David Eva
 ProjectX 1 Ian

 Output:
 Updated Project List:
 Project: ChatGPT-Enhancement, Team Members: [Alice, Bob, Charlie]
 Project: OpenAI-Research, Team Members: [David, Eva]
 Project: ProjectX, Team Members: [Ian]

 Public test case 2:
 Input:
 Website-Redesign 1 Elena
 Machine-Learning-Project 0
 Data-Analysis 0

 Output:
 Exception caught: null
 Updated Project List:
 Project: Website-Redesign, Team Members: [Elena]
 Project: Machine-Learning-Project, Team Members: [Default Member]
 Project: Data-Analysis, Team Members: [Default Member]
 
 ```