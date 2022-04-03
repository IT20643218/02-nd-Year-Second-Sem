package Lab3_3;

public class LinkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link L1 = new Link("Nipuna",53.3);
		Link L2 = new Link("Aravinda",78.0);
		Link L3 = new Link("Prashan",69.5);
		
		L1.next = L2;
		L2.next = L3;
		L3.next = null;
		
		L1.next.next.displayDetails();
				
	}

}
