
import java.util.LinkedList;

public class TheList {

	public static void main(String[] args) {
		
		LIII myList = new LIII(5);
	   
	        myList.insert(9);
	        myList.insert(4);
	        myList.insert(6);
	        myList.insert(17);
	        myList.delete(16);
	        myList.delete(5);
	        myList.delete(4);
	        myList.delete(17);
	        myList.delete(34);
	        myList.print();
}
}