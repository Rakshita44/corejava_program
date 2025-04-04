package ANP;
import java.util.*;
public class MapExample { public static void main(String[] args) {
    
    Map<Integer, String> m = new HashMap<>();
    
    
    m.put(1, "Mango");
    m.put(2, "Kiwi");
    m.put(3, "Banana");
    m.put(4, "Grapes");
    m.put(5, "Apple");
    m.put(5, "Pineapple");
    
    System.out.println("The map contains: " + m);
    
    Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
    
    Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
    
    System.out.println("Iterating over the map entries:");
    while (it.hasNext()) {
        Map.Entry<Integer, String> entry = it.next();
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
}
/*Output:
 The map contains: {1=Mango, 2=Kiwi, 3=Banana, 4=Grapes, 5=Pineapple}
Iterating over the map entries:
1 : Mango
2 : Kiwi
3 : Banana
4 : Grapes
5 : Pineapple
*/
