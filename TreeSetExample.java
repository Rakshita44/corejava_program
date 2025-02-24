package ANP;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		 // Create a TreeSet for Integer values
        SortedSet<Integer> ss = new TreeSet<>();
        
        // Add Integer values to the TreeSet
        ss.add(10);
        ss.add(20);
        ss.add(5);
        ss.add(30);
        ss.add(15);
        ss.add(25);
        ss.add(5); // Duplicate value, will not be added
        // ss.add(null); // null not allowed in TreeSet

        // Print the TreeSet
        System.out.println("SortedSet elements (Integer): " + ss);
        
        // Use an iterator to print each element in the TreeSet
        Iterator<Integer> it = ss.iterator();
        System.out.println("Iterating over the SortedSet:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Create another TreeSet for Integer values
        TreeSet<Integer> ts = new TreeSet<>();
        
        // Add some more Integer values
        ts.add(100);
        ts.add(50);
        ts.add(200);
        ts.add(75);
        
        // Print the TreeSet elements
        System.out.println("TreeSet Elements: " + ts);
        
        // Print the TreeSet again using default toString()
        System.out.println(ts);
        
        // Clone the TreeSet and print the clone
        System.out.println("Cloned TreeSet: " + ts.clone());
        
        // Get and print the first and last elements in the TreeSet
        System.out.println("First element in TreeSet: " + ts.first());
        System.out.println("Last element in TreeSet: " + ts.last());

	}

}
/*Output:
 SortedSet elements (Integer): [5, 10, 15, 20, 25, 30]
Iterating over the SortedSet:
5
10
15
20
25
30
TreeSet Elements : [50, 75, 100, 200]
[50, 75, 100, 200]
Cloned TreeSet: [50, 75, 100, 200]
First element in TreeSet: 50
Last element in TreeSet: 200
*/
