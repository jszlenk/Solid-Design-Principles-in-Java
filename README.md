# Solid Design Principles in Java 9
![Solid Design ](https://img.shields.io/badge/Solid_Design-Principles--in--Java-green.svg?longCache=true&style=for-the-badge)

**[Polskie tłumaczenie](https://github.com/jszlenk/Solid-Design-Principles-in-Java/blob/master/docs/READMEPL.md)**


**SOLID is a collection of important programming practices that were developed by Robert C. Martin.**

SOLID consists of 5 coding practices:

1. SRP - Single responsibility principle
2. OCP - Open/close principle
3. LSP - Liskov substitution principle
4. ISP - Interface segregation principle
5. DIP - Dependency inversion principle

### SRP - Single responsibility principle

SRP - says that each method / class should be responsible for one specific activity. Inserting everything into one method does not meet the basic assumptions of objectivity, but also makes it difficult to read, repair or expand programs.

This principle is very noticeable when we write an application that begins to grow with time. It is enriched with new functionalities. Then we want to use already existing classes and their capabilities. However, it turns out, that the class that A should do is also do B, C and D, which is not desired by the currently created implementation. Then the problem arises because we can no longer use the given class. In this situation, you can avoid sticking to the SRP.

### OCP - Open/close principle

The OCP principle says that the classes that we create are open to extensions and closed to modifications.

The application that we create must be ready for extensions, because the systems are changing very quickly these days. Thanks to the OCP principle, we are able to repeatedly use our classes for various tasks, which promotes reusability of the code, but also makes it easy to understand.

### LSP - Liskov substitution principle

Functions that use pointers or references to base classes must also be able to use class objects that inherit from the base classes without having a thorough knowledge of these objects.

### ISP - Interface segregation principle

ISP says: "Many dedicated interfaces are better than one overall".

The interface should give a specific shape to the class, and the methods that must be implemented within the class should be common to all implementation classes.

### DIP - Dependency inversion principle

High-level modules should not depend on low-level modules.<br>
Both should depend on abstractions.

Abstractions should not depend on details.<br>
Details should depend on abstractions.

Usually by abstraction, we mean an abstract class or interface. Essentially, this means that we are introducing a certain abstraction, which allows us to exchange individual elements of the program with other ones more suitable for a specific task.

We try not to enter into classes depending on its smaller parts.

---

### YAGNI - You ain’t gonna need it

The principle says not to create functionality until it is actually needed. This is a good practice because we do not create redundancy in the application and we do not leave code that is not used in any way.

**[YAGNI on Wiki](https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it)**

### DRY - Don’t repeat yourself

Analysis of the written code and the desire to improve it are always key in software writing.

When writing several classes with similar properties, we may encounter similar problems. This is a sign that the code inside these classes is common and it may indicate that it should be separated into another class that will deal with repetitive tasks in one place. Thanks to this operation, both classes will use the same code, and thus, the probability of error will drop.

**[DRY on Wiki](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself)**

### KISS - Keep It Simple, Stupid!

This rule is often mentioned when discussing architecture or details of building projects. Its essence is striving to maintain an elegant and transparent structure, without adding unnecessary elements.

**[KISS on Wiki](https://en.wikipedia.org/wiki/KISS_principle)**

### SOC - Separation of Concern

The separation of issues consists in the division of the program into separate modules that overlap with as little functionality as possible. We call this kind of program modular. Each element of the system should have its separate and singular application. The purpose of SoC (Separation of Concern) is to create a system in which each part plays a significant role while maintaining the possibility of maximum adaptation to changes. SoC does not refer only to the system architecture, but to various issues, eg to divide the application into layers (presentation, business logic, access to data, database).

**[SOC on Wiki](https://en.wikipedia.org/wiki/Separation_of_concerns)**

### CQS - Command Query Separation

It is a rule that says that every method in the system should be classified into one of two groups:

- Command - these are methods that change the state of the application and do not return anything.
- Query - these are methods that return something, but do not change the state of the application.

**[CQS on Wiki](https://en.wikipedia.org/wiki/Command%E2%80%93query_separation)**
