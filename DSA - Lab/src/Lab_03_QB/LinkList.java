package Lab_03_QB;

public class LinkList {
	
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	//this method will return true if the list is Empty
	public boolean isEmpty() {
		return (first == null);
	}
	
	//insertFirst method
	public void insertFirst(String name ,double average) {
		Link newLink = new Link(name,average);//step 1 - create new Link
		newLink.next = first;//step 2 - link this new link with the existing link list
		first = newLink;//step 3 - make the new link as the first in the link list
	}
	
	//delete first method
	public Link deleteFirst() {
		Link temp = first;//save the reference of the current first to temp
		first = first.next;//change the first reference to next available to next
		
		return temp;
	}
	
	public void displayList() {
		System.out.println("List from first link to the first link");
		Link current = first;
		 
		while (current != null) {
			
			//display the details
			current.displayDetails();
			current = current.next;//moving the current to the next position of the link list
		}
	}
}
