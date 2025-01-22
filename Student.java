/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study". Create an object of the Student class and call both the "speak" and "study" methods. */
package ANP;
class Person {
		int age=22;
		String name="Rakshita";

		 // Method to speak
		void speak() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		}
	}
//Child class Student that inherits from Person
	public class Student extends Person {
		// Additional attribute specific to Student
		String grade="A";
		
		// Method to study
		void study() {
			System.out.println("Grade is "+grade);
			
		}
		// object of the Student class
		public static void main(String[] args) {
			Student s=new Student();
			s.speak();
			s.study();

		}

	}
/*
Output:
Name is Rakshita
Age is 22
Grade is A
*/
