# Java Streams Documentation

## Introduction to Streams
Streams provide an alternative way to process collections in Java. Unlike traditional iterators that use explicit looping (imperative programming), streams allow for a declarative approach where transformations are specified rather than iterating step-by-step.

---

## Key Concepts
* **Stream as a Sequence**: Streams represent a sequence of elements processed one by one.
* **Declarative Processing**: You specify *what* needs to be done rather than *how* to do it.
* **Pipeline of Operations**: Stream processing involves three stages:
  * *Creating a Stream*
  * *Applying Transformations (Intermediate Operations)*
  * *Performing a Terminal Operation*
* **Lazy Evaluation**: Stream operations are performed lazily and only executed when a terminal operation is invoked.
* **Parallel Processing**: Streams can be parallelized for better performance.
* **Non-destructive**: Stream operations do not modify the original data source; they produce new streams.

---

## Creating Streams
1. **From Collections**
2. **From Arrays**
3. **Generating Streams**
   * Infinite Stream using `Stream.generate()`
   * Infinite Stream using `Stream.iterate()`
   * Finite Stream with Predicate

---

## Transforming Streams (Intermediate Operations)
* `filter(Predicate<T>)`:
  Filters elements based on a condition.
* **Using Predicate with Streams**: 
    A `Predicate<T>` is a functional interface representing a boolean-valued function. It is commonly used in `filter()` to define filtering logic.

* `map(Function<T, R>)`: 
  Transforms each element.

* `flatMap(Function<T, Stream<R>>)`:
  Flattens nested streams.

* `limit(long n)`:
  Restricts stream size.

* `skip(long n)`:
  Skips the first `n` elements.

* `takeWhile(Predicate<T>)`:
  Takes elements while the condition is true.

* `dropWhile(Predicate<T>)`:
  Drops elements while the condition is true.

---

## Example - Using Stream with predicate

```
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers and square them
        List<Integer> squaredEvens = numbers.stream()
                                            .filter(n -> n % 2 == 0)  // Keep only even numbers
                                            .map(n -> n * n)          // Square each number
                                            .collect(Collectors.toList()); // Collect results into a list

        System.out.println("Squared Even Numbers: " + squaredEvens);
    }
}
```

---

## Terminating Streams (Terminal Operations)
* `count()`: 
  Counts elements in the stream.

* `max(Comparator<T>)`: 
  Finds the maximum element.

* `min(Comparator<T>)`: 
  Finds the minimum element.

* `findFirst()`: 
  Gets the first element.

---

## Additional Stream Operations
* **Distinct elements**: `distinct()`
* **Sorting elements**: `sorted()`
* **Reducing elements**: `reduce()`
* **Merging streams**: `Stream.concat()`

---

## Handling Optional Results
Terminal operations like `max()`, `min()`, and `findFirst()` return `Optional<T>` to handle cases where the stream may be empty.

---

## Conclusion
Java Streams enable a functional approach to working with collections, improving readability and maintainability while supporting powerful data transformations.
