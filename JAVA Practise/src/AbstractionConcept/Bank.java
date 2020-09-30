package AbstractionConcept;

public abstract class Bank {

	//In abstract class atleast one method should be abstract.
	// No method body, only declaration = abstract method.
	// We can have concrete methods (with body) in abstract class.
	// We achieve partial abstraction through abstract class.
	// Abstraction = Hiding the implementation logic.
	// We cannot create object of abstract classes.
	// We cannot create object of interfaces as well.
	//Methods in interfaces are automatically declared abstract.
	//Abstract class can have static variable, final variable, non static or non final variables.
	//In interface all variables are final and static by default.
	// Child class object can be referenced by parent abstract class, interface or normal parent class,
	//this is called dynamic polymorphism.
	
	public abstract void loan(); //abstract method
	
	public void credit() {
		System.out.println("Bank -- Credit");
		
	}
	
	public void debit() {
		System.out.println("Bank -- Debit");
		
	}
	
}
