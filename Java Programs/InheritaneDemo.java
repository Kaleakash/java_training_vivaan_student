class Employee{
	private int id;
	private String name;
	private float salary;
		Address add = new Address();			// Employee has a address;
	void setEmpValue(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary=salary;
	}
	void disEmp() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
class Manager extends Employee{
	private int numberOfEmp;
	void setMgrValue(int nubmerOfEmp) {
			add.setAdd("Bangalore","Kar");
		this.numberOfEmp = nubmerOfEmp;
	}
	void disMgr() {
			add.disAdd();
		System.out.println("Number of employee working "+numberOfEmp);
	}
}
class Address{
	private String city;
	private String state;
	void setAdd(String city, String state) {
		this.city = city;
		this.state = state;
	}
	void disAdd() {
		System.out.println("City is "+city);
		System.out.println("State is "+state);
	}
}
class Developer extends Employee{
	private String project;
	void setDevValue(String project) {
			add.setAdd("Mysore","Kar");
		this.project = project;
	}
	void disDev() {
			add.disAdd();
		System.out.println("Project name is "+project);
	}
}


class InheritanceDemo {
	public static void main(String args[]) {
	//Employee emp1 = new Employee();
	//emp1.setEmpValue(1,"Ravi",12000);
	//emp1.disEmp();
	System.out.println("Manager details");
	Manager mgr1 =new Manager();
	mgr1.setEmpValue(100,"Ravi",45000);		// 
	mgr1.setMgrValue(7);
	mgr1.disEmp();
	mgr1.disMgr();
	System.out.println("Developer details");
	Developer dev = new Developer();
	dev.setEmpValue(101,"Ramesh",28000);
	dev.setDevValue("Python");
	dev.disEmp();
	dev.disDev();
	}
}