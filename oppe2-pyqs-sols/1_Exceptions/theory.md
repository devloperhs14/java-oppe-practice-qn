
# What are Exceptions?

- In Java, an **exception** is an unexpected event that happens while your program is running.
- Think of it as a **problem** that arises during the execution of the program.
- If not handled properly, exceptions can cause the program to stop abruptly.

---

## Why Do Exceptions Happen?

Exceptions can occur for various reasons:

- **Invalid User Input**: E.g., if a user enters text when the program expects a number.
- **Device Failure**: Issues with hardware like a disk drive.
- **Network Connection Loss**: When the program tries to access something online, and the internet drops.
- **Programming Errors**: E.g., trying to divide by zero.
- **File Not Found**: When the program looks for a file that doesn’t exist.

---

## Types of Exceptions

Java organizes exceptions into a hierarchy rooted at `Throwable`. The main branches are **Error** and **Exception**. We'll focus on `Exception` for handling.

### 1. **Checked Exceptions** (e.g., `IOException`):
- Checked at compile time.
- If a method can throw a checked exception, you must handle it (`try-catch`) or declare it (`throws`).
- **Example**: Trying to read from a non-existent file (`FileNotFoundException` is a type of `IOException`).

### 2. **Unchecked Exceptions** (e.g., `RuntimeException`):
- Result from programming errors and aren’t checked by the compiler at compile time.
- While you can handle them, it’s better to fix the underlying issue.
- **Examples**:
  - Accessing an array element outside its bounds (`ArrayIndexOutOfBoundsException`).
  - Using a `null` variable (`NullPointerException`).
  - Dividing a number by zero (`ArithmeticException`).

---

## Handling Exceptions with `try...catch`

To prevent crashes, use a `try...catch` block:

```java
try {
    // Code that might throw an exception
    int result = 10 / 0; // This causes ArithmeticException
    System.out.println("This line won’t be reached if an exception occurs.");
} catch (ArithmeticException e) {
    // Handle the exception
    System.out.println("Error: Cannot divide by zero!");
}
// Program continues here after the catch block (if an exception was caught)
System.out.println("Program continues...");
```

### Key Points:

- Code that might cause an exception is placed inside the **try block**.
- If an exception occurs, the program jumps to the **catch block**.
- You can have **multiple catch blocks** for different exceptions.
- If no exception occurs, the **catch block is skipped**.

---

## The `finally` Block (Optional)

- Code inside the **finally block** always executes, whether an exception occurred or not.
- Useful for cleanup, like closing files or releasing resources.

```java
try {
    // Code that might throw an exception
} catch (Exception e) {
    // Handle the exception
} finally {
    System.out.println("Finally block executed.");
}
```

---

## `throw` and `throws` Keywords

- **`throw`**:
  - Used to explicitly throw an exception.
  - You can create a new exception object and throw it.
  
- **`throws`**:
  - Used in the method signature to declare that a method might throw exceptions.
  - This informs the calling code to handle these potential exceptions.

