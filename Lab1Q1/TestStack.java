package Lab1Q1;

public class TestStack {
	
	public static void main(String[] args) {
		StackX theStack = new StackX(5);
		
		theStack.push('S');
		theStack.push('T');
		theStack.push('A');
		theStack.push('C');
		theStack.push('K');

		//Print Peek Element
		System.out.println("The Peek Value is :"+theStack.peak());
		
		while(!theStack.isEmpty())
		{
			char val = theStack.pop();
			System.out.println(val);
			System.out.println("");
				
				
		}
	}
}
