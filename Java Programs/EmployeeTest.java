class Employee {
	int id;
	String name;
	float salary;
	
	Employee(){
		System.out.println("memory created..");
		id=123;
		name = "Unknown";
		salary = 8000;
	}
	Employee(int id, String name, float salary){
		System.out.println("memory created..");
		this.id = id;
		this.name  = name;
		this.salary = salary;
	}
	void setValue(int id, String name, float salary) {		// local or parameter variable. 
		this.id=id;			// local  = local 	this.instancevariablename = localvarialbename;
		this.name = name;
		this.salary = salary;
	}
	void display(){
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}

class EmployeeTest {
	public static void main(String args[]) {
	Employee emp1 = new Employee();			// empty constructor 
	Employee emp2 =new Employee();			// empty constructor 
		Employee emp3 = new Employee(102,"Ajay",16000);	// parametetrized constructor 
	emp1.setValue(100,"Ravi",12000);
	emp2.setValue(101,"Ramesh",14000);
		emp2.setValue(1001,"Ramesh Kumar",16000);
	/*emp1.id=100;
	emp1.name="Ravi";
	emp1.salary=12000;
	emp2.id=101;
	emp2.name="Ramesh";
	emp2.salary = 14000;*/
	emp1.display();
	emp2.display();
	emp3.display();
	}
}