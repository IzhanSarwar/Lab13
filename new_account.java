package Lab9;

import java.util.LinkedList;
import java.util.Queue;
public class new_account implements Banking_system {

	
	public void print() {
		Queue<String> q = new LinkedList<String>();
		q.add("Izhan");
		q.add("Shayan");
		q.add("Arman");
		q.add("Ali");
		System.out.println("\nCustomer Queue For Account Opening");
		System.out.println("-------------------------------------");
		System.out.println(q);
	}
	

}
