class Car {
	String color;
	float price;
	int wheel=4;				// properites 

	void start() {
			System.out.println("Car Start");
	}
	void appliedGear() {
		System.out.println("applied gear");
	}
	void moving() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car Stop");
		//System.out.println("Info "+info);
		System.out.println("Color is "+color);
		System.out.println("Wheel is "+wheel);
		System.out.println("Price is "+price);
	}
	void displayCarDetails() {
			String info="Hello";
			System.out.println("Car Details");
			System.out.println("Color is "+color);
			System.out.println("Wheel is "+wheel);
			System.out.println("Price is "+price);
			System.out.println("info is "+info);
	}
}

class Demo {
	public static void main(String args[]) {
		System.out.println("Welcome to java ");
		//start();
		/*Car innova = new Car();		// heap memory
		innova.start();
		innova.stop();
			Car bmw = new Car();			// separate heap memory created..
		bmw.start();
		bmw.appliedGear();
		bmw.moving();
		bmw.stop();*/
		
		Car innova = new Car();
			//innova.displayCarDetails();
		innova.color="Gray";
		//innova.wheel = 4;
		innova.price = 2500000;
			innova.displayCarDetails();
		Car santro = new Car();
			//santro.displayCarDetails();
		santro.color="Red";
		//santro.wheel = 4;
		santro.price = 1300000;
		santro.displayCarDetails();
	}
}