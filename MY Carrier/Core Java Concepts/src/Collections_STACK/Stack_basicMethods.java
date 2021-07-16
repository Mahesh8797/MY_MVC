package Collections_STACK;
import java.util.*;
public class Stack_basicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		stack.push(100);
		stack.push(101);
		stack.push(102);
		stack.push(103);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		stack.push(104);
		System.out.println(stack);
		System.out.println(stack.search(102));
	}

}
