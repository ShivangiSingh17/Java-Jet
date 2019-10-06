
import java.util.Stack;

/**
 * This program converts infix to postfix using stack
 *
 */
public class InfixToPostfix {

	public static int precendence(char ch) {
		if(ch == '+' || ch == '-')
			return -1;
		if(ch == '*' || ch == '/')
			return 0;
		if(ch == '^')
			return 1;
		return -2;
	}

	static void infixToPostfix(String str) {
		Stack<Character> stack = new Stack<>();

		while(!str.isEmpty()) {
			Character ch = str.charAt(0);
			if(ch.isLetterOrDigit(ch))
				System.out.print(ch);
			else if(ch.equals('('))
				stack.push(ch);
			else if(ch.equals(')')) {
				while(!stack.isEmpty() && stack.peek() != '(')
					System.out.print(stack.pop());
				if(!stack.isEmpty() && stack.peek() != '(')
					System.out.print("Invalid Expression");
				else
					stack.pop();
			} else {
				while(!stack.isEmpty() && precendence(ch) <= precendence(stack.peek()))
					System.out.print(stack.pop());
				stack.push(ch);
			}
			str = str.substring(1);
		}
		while(!stack.isEmpty())
			System.out.print(stack.pop());
	}

	public static void main(String args[]) {
		String infix = "A+(B-C)*D";
		String infixTwo = "a+b*(c^d-e)^(f+g*h)-i";
		infixToPostfix(infixTwo);
	}

}
