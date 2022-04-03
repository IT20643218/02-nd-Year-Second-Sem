package Lab4_4;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree  T1 = new Tree();
		
		T1.insert(149,"Anusha");
		T1.insert(167,"Kosala");
		T1.insert(47,"Dinusha");
		T1.insert(66,"Mihiri");
		T1.insert(159,"Jayani");
		T1.insert(118,"Nimal");
		T1.insert(195,"Nishantha");
		T1.insert(34,"Avodya");
		T1.insert(105,"Bimali");
		T1.insert(133,"Sampath");
		
		System.out.println("Inorder (left ,root,");
		T1.TraverseinOrde();
	}

}
