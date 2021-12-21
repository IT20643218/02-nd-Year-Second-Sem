package StackX;

public class StackX {
	private int maxsize;
	private char[] stackArray;
	private int top;
	
	//constructor
	public StackX(int s)//constructor
	{
		maxsize = s;
		stackArray = new char[maxsize];
		top=-1;
	}
	
	//to insert an item to the stack
	public void push (char j) 
	{
	
	if(top == (maxsize -1))
		System.out.println("Stack is full")
	else{
		stackArray[++top]=j;
	}

	//to remove an item from stack
	public char pop()
	{
		return stackArray[top--];
	}
	
	//to access top item to the stack
	public char peek()
	{
		return stackArray[top];
	}
	
	//check whether stack is empty
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	
	//check whether stack is full
	public boolean isFull()
	{
		if(top == maxsize-1)
			return true;
		else
			return false;
	}
}
