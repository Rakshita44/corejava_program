package ANP;
import java.util.ArrayDeque;
public class BookQueue {
	 public static void main(String[] args) {
	        // Create an ArrayDeque to store book names
	        ArrayDeque<String> bookQ = new ArrayDeque<>();

	        // Adding book names to the deque (queue)
	        bookQ.add("Great");
	        bookQ.add("1984");
	        bookQ.add("Kill Bird");
	        bookQ.add("Pride");
	        bookQ.add("Sports");

	        // Display the current state of the queue
	        System.out.println("Books in the queue: " + bookQ);

	        // Add a book to the front of the queue
	        bookQ.addFirst("War");
	        System.out.println("After adding to front: " + bookQ);

	        // Add a book to the end of the queue
	        bookQ.addLast("Peace");
	        System.out.println("After adding to end: " + bookQ);

	        // Remove a book from the front of the queue
	        String removedFromFront = bookQ.removeFirst();
	        System.out.println("Removed front: " + removedFromFront);
	        System.out.println("After removing front: " + bookQ);

	        // Remove a book from the end of the queue
	        String removedFromEnd = bookQ.removeLast();
	        System.out.println("Removed end: " + removedFromEnd);
	        System.out.println("After removing end: " + bookQ);
}
	 }
/*Output:
 Books in the queue: [Great, 1984, Kill Bird, Pride, Sports]
After adding to front: [War, Great, 1984, Kill Bird, Pride, Sports]
After adding to end: [War, Great, 1984, Kill Bird, Pride, Sports, Peace]
Removed front: War
After removing front: [Great, 1984, Kill Bird, Pride, Sports, Peace]
Removed end: Peace
After removing end: [Great, 1984, Kill Bird, Pride, Sports]
*/
