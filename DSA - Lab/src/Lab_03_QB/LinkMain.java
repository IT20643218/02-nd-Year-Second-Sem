package Lab_03_QB;

public class LinkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList linklist = new LinkList();
		
		linklist.insertFirst("Phrashani",69.5);
		linklist.insertFirst("Aravinda",78.0);
		linklist.insertFirst("Nipuna",53.5);
			
		
		//linklist.deleteFirst();
		//linklist.displayList();
		
		//linklist.deleteLink("Aravinda");
		linklist.displayList();
	}

}
