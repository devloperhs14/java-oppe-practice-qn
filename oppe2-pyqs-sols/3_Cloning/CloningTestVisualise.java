class Author implements Cloneable {
    private String name;
    private int age;

    public Author(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Author: " + name + " (Age: " + age + ")";
    }

    // Define clone method
    public Author clone() throws CloneNotSupportedException {
        return (Author) super.clone();
    }
}

class Book implements Cloneable {
    private String title;
    private Author author;

    public Book(String t, Author a) {
        title = t;
        author = a;
    }

    public void setAuthor(Author author) {
        this.author.setName(author.getName());
        this.author.setAge(author.getAge());
    }

    public String toString() {
        return "Book: " + title + "\n" + author;
    }

    // Define clone method - deep copy
    public Book clone() throws CloneNotSupportedException {
        Book b = (Book) super.clone(); // Shallow copy
        b.author = this.author.clone(); // Deep copy
        return b;
    }
}

public class CloningTestVisualise {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Hardcoded values
        Book b1 = new Book("Programming_Java", new Author("Alice", 25));
        Book b2 = b1.clone();

        // Changing the cloned book's author
        b2.setAuthor(new Author("Bob", 28));

        System.out.println("Original Book:\n" + b1);
        System.out.println("Cloned Book:\n" + b2);
    }
}
