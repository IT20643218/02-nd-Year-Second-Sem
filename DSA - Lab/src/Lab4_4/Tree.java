package Lab4_4;

public class Tree {
	private Node root;
	
	public void insert(int Eno,String Name)
	{
		//Create a node
		Node newNode = new Node();
		
		//assing the EmoNo to new node
		newNode.EmpNo = Eno;
		
		//assing the name to new node
		newNode.name = Name;
		
		//Checking the tree is empty
		if(root ==null)
		{
			//if the tree is empty make the new node as the root
			root = newNode;
		}
		else
		{
			Node current = root;
			Node parent;
			
			while (true)//allways condition is true
			{
				parent = current;
				if(Eno<current.EmpNo)//left
				{
					current = current.leftChild;
					if(current == null)
					{
						parent.leftChild = newNode;
						return;
					}
				}
				else//right
				{
					current = current.rightChild;
					if(current == null)
					{
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	private void inOrder(Node localRoot)//left,right,root
	{
		if (localRoot != null) 
		{
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.leftChild);
		}
		/*else
		{
			System.out.println("The tree is empty");
		}*/
	}
	
	public void TraverseinOrde()
	{
		inOrder(root);
	}

	private void preOrder(Node localRoot)//root,left,right
	{
		if(localRoot != null)
		{
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	public void TraversepreOrder()
	{
		preOrder(root);
	}
	
	private void postOrder(Node localRoot)//left,right,root
	{
		postOrder(localRoot.leftChild);
		postOrder(localRoot.rightChild);
		localRoot.displayNode();
	}
	
	public void TraversepostOrder()
	{
		postOrder(root);
	}
	
	private Node findRecursive(Node localRoot, int emp)
	{
		if (localRoot == null)
		{
			System.out.println("Value is not in the tree");
			return null;
		}
		
		else if (localRoot.EmpNo == emp)
		{
			System.out.println(localRoot. name);
			return localRoot;
		}
		
		else if(emp <localRoot. EmpNo)
		{
			return findRecursive(localRoot.leftChild, emp);
		}
		
		
		{
			return findRecursive(localRoot.rightChild, emp);
		}
		
	}
	
	public Node callRecursive(int eno)
	{
		 return findRecursive(root,eno);
	}
	
	public Node find(int emp)
	{
		Node current = root;
		
		while (current.EmpNo != emp)
		{
			if (emp < current.EmpNo) 
			{
				current = current.leftChild;
			}
			else
			{
				current = current.rightChild;
			}
			
			if (current == null)
			{
				System.out.println("Value is not in the tree");
				return current;
			}
		}//found the value
		System.out.println(current.name);
		return current;
	}
	public void deleteAll()
	{
		root = null;
	}
}

