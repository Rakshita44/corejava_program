//Write a Java Program  to pass  this keyword as argument in the constructor call
package ANP;
class College {
	This_ConstArgu obj;//object of This_ConstArgu class
	College (This_ConstArgu obj)// Constructor of College class
	{
		this.obj = obj; 
		obj.display(); // Call the display method
	}
}
//main class passing 'this' keyword
public class This_ConstArgu {
	int y = 3;
	This_ConstArgu() { 
		// Passing the current obj (this) of This_ConstArgu class to the College constructor
		College  obj = new College (this); 
	}
	void display()
	{
		System.out.println("Value of x in Class B: " + y);
	}

	public static void main(String[] args) {
		// Creating an object of This_ConstArgu, calls to constructor and the College
        
		This_ConstArgu obj = new This_ConstArgu();

	}
}
/*Output:
Value of x in Class B : 3
 */
