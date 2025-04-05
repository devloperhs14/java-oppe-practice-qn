# Cloning in Java

* Cloning in Java is a process of creating an exact copy of an object. 
* It is achieved using the `clone()` method from the `Object` class. 
* To enable cloning, a class must implement the `Cloneable` interface.

## Key Points
1. **Cloneable Interface**: A marker interface that indicates a class supports cloning.
2. **`clone()` Method**: Defined in the `Object` class, it performs a shallow copy of the object.
3. **Shallow Copy vs Deep Copy**:
   - **Shallow Copy**: Copies the object but not the objects it references.
   - **Deep Copy**: Copies the object and all objects it references.

## Steps to Implement Cloning
1. Implement the `Cloneable` interface.
2. Override the `clone()` method.
3. Use `super.clone()` to create a shallow copy.

## Example: Shallow Copy

```java
class Author implements Cloneable {
    private String name;
    private int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    @Override
    public String toString() {
        return "Author{name='" + name + "', age=" + age + "}";
    }
}

class Book implements Cloneable {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author=" + author + "}";
    }
}

public class CloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author("John Doe", 45);
        Book book1 = new Book("Java Basics", author);

        Book book2 = (Book) book1.clone(); // Cloning book1

        System.out.println("Original: " + book1);
        System.out.println("Cloned: " + book2);
    }
}

```

## Example: Deep Copy

To achieve deep copy, manually clone the referenced objects.

```java
class Book implements Cloneable {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book clonedBook = (Book) super.clone();
        clonedBook.author = (Author) author.clone(); // Deep copy
        return clonedBook;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author=" + author + "}";
    }
}
```

## Summary

* Use Cloneable and override `clone()` for cloning.
* Use `super.clone()` for shallow copy.
* Manually <u>clone referenced objects</u> for deep copy.
* Always handle `CloneNotSupportedException`.
* Cloning is useful for creating object copies but should be used carefully to avoid unintended side effects. 