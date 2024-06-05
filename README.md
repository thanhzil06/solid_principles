# SOLID_principles

Practice coding exercises to enhance understanding of SOLID Principles in Java.

1. Single Responsibility Principle - There should never be more than one reason for a class to change.

2. Open-Closed Principle - Software entities (Class, Modules, Methods...) should be open for extension, but closed for modification.

	+) open for extension: be able to extend existing behavior --> can derive from base and override methods
	
	+) closed for modification: existing code remains unchanged --> avoid modifying base class
	
Thought: When combined SRP and OP, they compliment each other.

	+) Although SRP talks about modification to exiting code it is NOT the intent of principle to force modifications in existing code. Intent of SRP is to ensure methods/classes are concise, well designed and do one thing only.
	
	+) Intent of open-closed principle is about doing modifications that will not break existing code by implementing changes in derived class/overridden methods. 

3. Liskov Substitution Principle - Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program/breaking the application.

	+) The LSP allows for generalization and specialization in object-oriented design. Superclasses represent more general concepts, while subclasses represent more specific concepts. Subclasses should refine or specialize the behavior of their superclass without breaking the contract established by the superclass.
	
	==> OR: Substitute base class objects with child class objects and this SHOULDN'T alter behaviour of program.
	
	+) An example of LSP
public class Bird{
	public void hasWing(){}
}
public class FlyingBird extends Bird{
    public void fly(){}
}
public class Duck extends FlyingBird{}
public class Ostrich extends Bird{} 

4. Interface Segregation - Client should not be forced to depend upon interfaces that they do not use. In other words, clients should not be forced to depend on methods defined in interfaces that they don't use.

=> Interface Segregation tell us to break bigger interfaces so that methods/behaviors/contracts defined in a particular interface are cohesive/related to each other. 

**Explanation**
- TO avoid interface pollution: We should not make our interfaces bigger, i.e. not cram methods unrelated in a one big interface and make all other classes in our software system/module implement that interface.

- Example of principle violation: Some normal classes have
	
	+) Methods have empty implementations.

	+) Methods throw Unsupported Operation Exception.

	+) Methods don't do anything or return null.

=> These mean, a particular class is implementing an interface which has method makes no sense for it.