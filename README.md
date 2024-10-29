# Java 101

## Basics
- Java is a strongly tped OOP language that uses a platform-independent Java Virtual Machine (JVM) to to run compiled bytecode
- Java uses a Java Runtime Environment (JRE) to run the JVM (this is all installed via the JDK)
- Everything in Java is a class or instance of a class; all code needs to be within a class
- The entrypoint to java code is the **Main class** and its **main method** which is a public method belonging to the class itself that takes in an array strings called "args" returns nothing
- The filename must match the class name in Java
- `new` constructor is used to create an object in heap memory; the object and its fields are created in memory and a **reference** to the object in memory is returned
- objects are passed by reference; all other values are passed by value

```
public class Main {
  public static void main(String[] args) {
    System.out.println("This will be printed");
  }
}
```

### Java Primitives
- `byte` - 1 byte number
- `short` - 2 byte number
- `int` - 4 byte number
- `long` - 8 byte number
- `float` - 4 byte float number (float) 4.5 or 4.5f
- `double` - 8 byte float number
- `char` - 2 byte character (String is not a primitive, but is the only object that is overloaded to use '+')
- `boolean` - 1 byte boolean value (true, false)
- (some of the primitives have corresponding **class versions** that must be used to initialize objects (e.g. int ~ Integer, bool ~ Boolean))

### Comparisons
- java has all the logical and value comparisons
- one thing to note `==` compares the actual object while `.eqauls()` compares the values of objects

### Control
- java has **for**, **while**, **do-while**, **if-else** and  **foreach** (`for (int v : arr)`) loops
- if statements **do not require {}**

### Try/Catch and Exceptions
- Java has alot of exceptions that can be thrown when an error occurs. Use `try/catch` block to handle them gracefully
```
try {
  //some code
} catch (SomeException e) {
  //code to handle some exception gracefully
}
```

### Generics
- Java has `generics` that can be used as placedholders for types when creating interfaces, classes, methods, etc. to eliminate explicit type casting
- (e.g. `List<Integer> l = ArrayList<>();` - the List interface uses generics so that we can create lists of any type)
```
public class MyClass<T1, T2> {
  private T1 something1;
  private T2 something2;

  MyClass(T1 a, T2 b) {
    this.something1 = a;
    this.something2 = b;
  }
}

// type can is specified at object creation
MyClass<Integer, String> mine = new MyClass<>(1, "one");
```

### Collections
- Collections in Java are frameworks that provide an architecture to store and manipulate a group of objects. They offer various data structures like `lists, sets, maps, and more`, along with algorithms to work with these structures. The `java.util package` contains the Java Collections Framework (JCF). Here’s a quick overview:
  - `List`: Ordered collection that allows duplicate elements (e.g., `ArrayList, LinkedList`).
  - `Set`: Collection that does not allow duplicate elements (e.g., `HashSet, LinkedHashSet, TreeSet`).
  - `Map`: Collection of key-value pairs with unique keys (e.g., `HashMap, TreeMap, LinkedHashMap`).
  - `Queue`: Collection used to hold multiple elements prior to processing (e.g., `PriorityQueue`).
- More on java collections - `https://www.digitalocean.com/community/tutorials/collections-in-java-tutorial`
- `https://www.geeksforgeeks.org/collections-in-java-2/`

## OOP
- `public` - grants everyone access to the class or member
- `static` - declares a class member that does not belong to an instance of the class
- `void` - means the method does not return a value
- `private` - only accessible from within class
- `inheritance` - the adoption of all non-private properties and methods of a superclass by a subclass via the `extends` keyword (the `super` method prefix can be used to invoke superclass methods from the derived class (e.g. `super.mehtod`))
- `interafaces` - define the structure of a class and class members; class templates that define method signatures
  - interfaces can be implemented by a class which must contain all the interface's methods
  - generally uses as templates for multiple classes
```
interface IAnimal {
  boolean feed(boolean timeToEat);
  void groom();
  void pet();
}

//an instance of class Dog will also be recognized as an instance of type IAnimal
class Dog implements IAnimal {
  boolean feed(boolean timeToEat) {
    //pour food
    return true;
  }

  void groom() {
    //brush
  }

  void pet() {
    //slowly pet
    //wash hands
  }
}
```

- `polymorphism` -
- `abstraction` -
- `encapsulation` - 
- `abstract classes` - classes with the `abstract` keyword prefixed that are declared but not implemented **(though they can contain concrete methods)**; a class must be abstract if it has one or more methods with the abstract keyword; the derived class MUST implement all the abstract methods of the abstract base class
  - abstract classes can't contain fields which are both `final` and `static`
  - abstract classes with only abstract methods **should be defined as interface**
  - derived class can `implement` - define the abstract class - or `extend` - add additional functionality to the class
```
abstract class abstractClass {
  abstract void abstractMethod();
  void concreteMethod() {
    //concrete methods can still exist in abstract class, but don't need to be re-implemented in child classes
  }
}

class concreteClass implements abstractClass {
  void abstractMethod() {
    //implementation
  }
}

```

## Strings

## Arrays
- you can declare an array with a size in java like this (`int[] arr = new int[10];`)
- arrays can be initialized with values like this (`int[] arr = {1,2,3}`)
- use `.length` to get the size of an array
- use foreach loops to iterate over an array without an index; use traditional for loop for indices
```
int[] arr = {1,2,3,4};
for (int v: arr) {
  System.out.println(v)
}
```

## ArrayLists & LinkedLists
- in java, the `List` interface from the util package is used to impelement `ArrayList` - dynamic arrays - as well as `LinkedList` - doubly linked lists
- LinkedList and ArrayList both implement the List interface and are therefore both of the List type
- use the `.get(v)`, `.add(v)`, `.remove(v)` methods to access, insert, and delete from a list

```
List<Integer> myList = new ArrayList<>();
List<Integer> myLinkedList = new LinkedList<>();
```

## Stacks

## Queues

## Maps
`https://www.w3schools.com/java/java_ref_hashmap.asp`

## Sets

## Heaps

## Trees

## Tries

## Graphs


