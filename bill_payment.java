package Lab9;

import java.util.ArrayList;
import java.util.List;
public class bill_payment implements Banking_system {
	
	public void print() {
		List <String> customers = new ArrayList<String>();
		
		customers.add("Fiza");
		customers.add("Laiba");
		customers.add("Yumna");
		customers.add("Dua");

		System.out.println("\nCustomers List for payment:");
		System.out.println("-----------------------------");
		System.out.println(customers);
		System.out.println("\nFollowing are the Pending Customers");
		System.out.println("====================================");
		customers.remove(2);
		customers.remove(0);
		System.out.println(customers);
	}
	

}
