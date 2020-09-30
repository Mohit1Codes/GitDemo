package AbstractionConcept;


class Employee {
	
	int id;
	int age;
	static String ceo = "Larry";
	
	public void show() {
		System.out.println("id : "+ id + " age : "+age+" ceo : " + ceo);
	}
		
}

public class Static_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee.ceo = "yoyo";
		Employee e1 = new Employee();
		e1.id = 123;
		e1.age = 21;
		e1.show();
		
		Employee.ceo = "gogo";
		Employee e2 = new Employee();
		e2.id = 223;
		e2.age = 23;
		e2.show();		

	}

}
