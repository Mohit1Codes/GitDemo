package Yash_Apps;

import yash_Entity.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		
	System.out.println(e.employeeId);
		
		//new operator is responsible for allocating memory to the object in object pool.

	e.employeeId = 1001;
	e.employeeName = "Mohit";
	e.employeeSalary = 40000;
	
	System.out.println(e.employeeSalary);
	
	Employee e1 = new Employee("Lil Wayne",40000,"Programmer");
	
	}

}
