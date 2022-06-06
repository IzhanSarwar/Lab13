package Lab9;

import java.util.Stack;
public class Loan implements Banking_system {
	static void stack_push(Stack<Integer> F) {
		for (int i= 1; i<= 5; i++) {
			F.push(i);
		}
	}

	static void stack_pop(Stack<Integer> S) {
		System.out.println("Customer List According To Least Limit Extension");
		System.out.println("-------------------------------------------------");
		int j=1;
		for(int i=1; i<= 5; i++) {
			Integer A= (Integer) S.pop();
			System.out.println("Customer " +A+ " has the time of " +j*2+" month");
			j++;
		}
	}
	
	static void stack_peek(Stack<Integer>S) {
		Integer element = (Integer) S.peek();
		System.out.println("Customer whose extension limit is going to expire : Customer" + element);
		}
	public void print() {
		Stack<Integer> F = new Stack<Integer>();
		stack_push(F);
		stack_pop(F);
		stack_push(F);
		stack_peek(F);
	}
}
