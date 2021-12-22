package StackX;

public class BracketChecker {
	private String input;//input string
	
	public BracketChecker (String in)
	{
		input=in;
	}

	public void check() 
	{
		//Get max Stack Size
		int StackSize = input.length();
		StackX theStack1 = new StackX (StackSize);
		
		for (int j=0;j<input.length();j++) {
			char ch=input.charAt(j);
			switch(ch)
			{
			//opening symbols
			case '{':
			case '[':
			case '(':
				
				//Push Character to the stack
				theStack1.push(ch);
				break;
				
			//closing symbols	
			case '}':
			case ']':
			case ')':
				if (!theStack1.isEmpty())//if the stack not end
				{
					char chx=theStack1.pop();//pop end checker
					if((ch=='}' &&  chx!= '{') || (ch == ']' &&  chx !='[') || (ch==')'&& chx!='('))
					
						System.out.println("Error : "+ch+" at "+j);
					else
						System.out.println("Valid");
				}
				else
					System.out.println("Error : "+ch+" at "+j);
					break;
					default:
					break;
				}//end of the switch
			}//end of the for loop
		
		if (!theStack1.isEmpty())
			System.out.println("Error Missing Delimiters");
		}//end of the checker
	}

