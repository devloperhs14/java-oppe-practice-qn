# Java Cloning

Write a Java program that, given as input, details of an original book, represented by Book b1. 

## Details
* The details include the book’s title, author’s name, and author’s age. 
* Subsequently, the program should clone the original book to create a new book, denoted as Book b2. 

* The cloning process should ensure that modifications to the details of either b1 or b2 do not affect the other. 
* Finally, the program displays the details of both the original and cloned books.

Complete the program as specified below:

* **Class Author** implements `Cloneable` interface and has/should have the following members:
  * Private instance variables `String name` and `int age`
  * A constructor to initialize the instance variables
  * Accessor and Mutator methods for the `name` and `age`
  * Method `toString` to print in the format shown in the test cases
  * Implement the `clone()` method
<br>
* **Class Book** implements `Cloneable` interface and has/should have the following members:
  * Private instance variables `String title` and an instance of the `Author` class
  * A constructor to initialize instance variables, taking the book’s title and an `Author` object
  * Method `toString` to print in the format shown in the test cases
  * Mutator method to set a new author
  * Implement the `clone()` method
<br>
* **Class CloningTest** contains the `main` method that takes the inputs in the order of book’s title, author’s name, and age and invokes appropriate methods to achieve the functionality.

### What you have to do:
* Define method `clone` in class `Book`
* Define method `clone` in class `Author`


### Test Cases

```
 Input:
 Programming_Java
 Alice 25
 Bob 28

 Output:
 Original Book:
 Book: Programming_Java
 Author: Alice (Age: 25)
 Cloned Book:
 Book: Programming_Java
 Author: Bob (Age: 28)
 ```

 