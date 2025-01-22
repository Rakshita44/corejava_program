//Write java program to invoke current class method using this keyword
package ANP;

public class Invoke_CurrentClass {
	// method 'display' call 'show'
	 void display()
	    {
	        this.show();
	 
	        System.out.println("Display function");
	    }
	    // Method 'show' 
	    void show()
	    {
	        System.out.println("Show function");
	    }
	public static void main(String[] args) {
		// instance of the class Invoke_CurrentClass
		Invoke_CurrentClass cc = new Invoke_CurrentClass();
        cc.display();
	}
}
/*Output:
Show function
Display function
*/
