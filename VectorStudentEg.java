package ANP;

import java.util.Vector;

public class VectorStudentEg {
    public static void main(String[] args) {
        
        // Creating a Vector object to store student names (String type)
        Vector<String> vec = new Vector<String>();

        // Checking if the vector is empty initially
        System.out.println("Is Empty=>" + vec.isEmpty()); //print'true' the vector is empty 
        // Adding student names to the vector
        vec.add("Rakshita");
        vec.add("Dipali");
        vec.add("Ram");
        vec.add("Gouri");
        vec.add("Raju");

        // Adding a null element to the vector
        vec.add(null);
        
        // Printing the elements 
        System.out.println("Student Details in Vector:" + vec);
        
        // Getting the size of the vector 
        System.out.println("Size of Vector=>" + vec.size());
        
        // Checking if the vector contains the name "Sidd"
        System.out.println("Contain Method of vector=>" + vec.contains("Ram"));//print 'true' since "Ram" is in the vector
    }
    }
 
/*Outpu:
     Is Empty=>true
Student Details in Vector:[Rakshita, Dipali, Ram, Gouri, Raju, null]
Size of Vector=>6
Contain Method of vector=>true
*/