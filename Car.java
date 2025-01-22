/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". Create an object of the Car class and call both the "drive" and "honk" methods.*/
package ANP;
//Parent class Vehicle
class Vehicle{
	String brand;
	String model;
	int year;
	// Method to drive
	void drive() {
		this.brand="Honda";
		this.model="Bike";
		this.year=2025;
		System.out.println(brand);
		System.out.println(model);
		System.out.println(year);
	}
}
//Child class Car that inherits from Vehicle
public class Car extends Vehicle {
	String color;
	  // Method to honk
	void honk() {
		this.color="black";
		System.out.println(color);
	}

	public static void main(String[] args) {
		// object of the Car class
		Car c=new Car();
		// Call methods from both Vehicle and Car
		c.drive();
		c.honk();

	}

}
/*Output:
Honda
Bike
2025
black
*/
