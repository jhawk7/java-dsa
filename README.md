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

