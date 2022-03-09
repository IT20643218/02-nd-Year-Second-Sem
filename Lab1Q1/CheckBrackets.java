package Lab1Q1;

import java.util.Stack;

public class CheckBrackets {
	
	public static void ValidPranthathese(String input) {
		
		final int length = input.length();
		Stack stack = new Stack();
	
	for (int i=0;i<length ;i++) {
		
		if (input.charAt(i) == '(') {
			stack.push(input.charAt(i));
			continue;
		}else if (input.charAt(i)==')') {
			
			if(stack.isEmpty()) {
				System.out.println("Invalid");
				return;
			}else {
				stack.pop();
			}
			
		}
	}
	if(stack.isEmpty()) {
		System.out.println("Valid Expression");
	}else {
		System.out.println("Invalid Expression");
	}
}

}
