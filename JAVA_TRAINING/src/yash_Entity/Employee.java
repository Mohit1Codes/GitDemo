package yash_Entity;

public class Employee {
	
	//constructor has same name as class.
	
	//many constructors can be used inside the class.
	
	//constructors with different arguments can be used.
	
	//so using constructor class can be used for multiple purposes.
	
	
	
	
	public int employeeId; //also called field of a class.
	
	public String employeeName;
	
	public double employeeSalary;
	
	public String employeeDesignationString;
	
	
	
	public Employee() {  //public means outside the package it can be accessed. Constructor doesn't have any return type. No Computation should be done inside constructor.
		
		
	}
	
	public Employee(String employeeName,double employeeSalary,String employeeDesignation) { //parameter name should be same as the field that needs to be initialised using it.
		
		//the current object getting created will be assigned the value that is incoming.
		
		this.employeeName = employeeName;
	}
	
	//If we don't specify a constructor in our class, compiler will automatically create one constructor.
	
	
	//We can overload the constructor by creating one more constructor and giving 4 fields.

}
