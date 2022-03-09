package Lab1Q1;

// a) Implement Stack class to store characters. Identify the data members required and 
/*implement the below methods with the constructor.
/*Push(), Pop(), Peek(), isEmpty() and isFull()
//
 * 
 */
public class StackX {
 private int maxSize;
 private char []StackArray;
 private int top;
 
 
 public StackX (int s)//Constructor
 {
	 maxSize= s;
	 StackArray = new char[maxSize];
	 top = -1;
 }
 
 
 public void push (char j)//to insert item to the stack
 {
	 if (top == maxSize -1)
		 System.out.println("Stack is Full");
	 else
	 {
		 StackArray[++top]=j;
 
	 }
}
 
 public char pop()//to remove an item from stack
 {
	return StackArray[top --];
 }
 
 public char peak()//to access top item of the stack
 {
	 return StackArray[top];
 }
 
 public boolean isEmpty()//check whether the stack is empty
 {
	 if(top == 1)
		 return true;
	 else
		 return true;
 }
 
 public boolean isFull()//check whether the stack is full
 {
	 if(top == maxSize-1)
		 return true;
	 else
		 return true;
 }
 
}

