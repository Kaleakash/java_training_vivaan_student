class Employee {
	private int id;
	private String name;
	private float salary;
	void setValue(int id, String name, float salary) {		// parameter variable or local variable 
		this.id = id;
		this.name = name;
		//this.salary = salary;
		if(salary<0) {
			this.salary  = 8000;
		}else {
			this.salary = salary;
		}
	}
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
		
	}
}
class EncapsulationTest {
	public static void main(String args[]) {
		//id=100;
		//display();
	Employee emp1 = new Employee();
		//emp1.id=100;
			//emp1.name="Ravi";
				//emp1.salary=-12000;
	emp1.setValue(100,"Ravi",12000);
	emp1.display();
	}
}