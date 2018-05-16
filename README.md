# Solid Design Principles in Java
![Solid Design ](https://img.shields.io/badge/Solid_Design-Principles--in--Java-green.svg?longCache=true&style=for-the-badge)

**[Polskie tłumaczenie]()**


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

### YAGNI - You ain’t gonna need it

The principle says not to create functionality until it is actually needed. This is a good practice because we do not create redundancy in the application and we do not leave code that is not used in any way.

**[YAGNI on Wiki](https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it)**

### DRY - Don’t repeat yourself

Analysis of the written code and the desire to improve it are always key in software writing.

When writing several classes with similar properties, we may encounter similar problems. This is a sign that the code inside these classes is common and it may indicate that it should be separated into another class that will deal with repetitive tasks in one place. Thanks to this operation, both classes will use the same code, and thus, the probability of error will drop.