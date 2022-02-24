
public class NewTest {

	public static void main(String[] args) {
		        StackX theStack = new StackX();//create a stack with max size 10
		        
		        theStack.push(30);
		        theStack.push(80);
		        theStack.push(100);
		        theStack.push(25);

		        while(!theStack.isEmpty()){ //until it is empty ,delete item from stack
		            double val =  theStack.pop();
		            System.out.println(val);
		            System.out.println(" ");

		      }
	}
	
}

