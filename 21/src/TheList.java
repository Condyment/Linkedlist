import java.awt.List;
import java.util.LinkedList;

public class TheList {

	public static void main(String[] args) {
		String[] things= {"another stuff","news tuff","best stuff","amazing stuff","legendary stuff"} ;
		LinkedList<String>list1=new LinkedList<String>();
		for(String x:things)
		{
			list1.add(x);
		}

		printlist(list1);
	}
	static void printlist(LinkedList<String>L)
	{
		for(String b:L)
			System.out.printf("%s\n",b);
	}

}
