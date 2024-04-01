# SOLID_principles

Practice coding exercises to enhance understanding of SOLID Principles in Java.

1. Single Responsibility Principle - There should never be more than one reason for a class to change

2. Open-Closed Principle - Software entities (Class, Modules, Methods...) should be open for extension, but closed for modification

	+) open for extension: be able to extend existing behavior --> can derive from base and override methods
	
	+) closed for modification: existing code remains unchanged --> avoid modifying base class
	
Thought: When combined SRP and OP, they compliment each other.

	+) Although SRP talks about modification to exiting code it is NOT the intent of principle to force modifications in existing code. Intent of SRP is to ensure methods/classes are concise, well designed and do one thing only.
	
	+) Intent of open-closed principle is about doing modifications that will not break existing code by implementing changes in derived class/overridden methods. 

3. Liskov Substitution Principle: objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program/breaking the application.

	+) The LSP allows for generalization and specialization in object-oriented design. Superclasses represent more general concepts, while subclasses represent more specific concepts. Subclasses should refine or specialize the behavior of their superclass without breaking the contract established by the superclass.
	
	==> OR: Substitute base class objects with child class objects and this SHOULDN'T alter behaviour of program.
	
	+) An example of LSP
public class Bird{}
public class FlyingBird extends Bird{
    public void fly(){}
}
public class Duck extends FlyingBird{}
public class Ostrich extends Bird{} 