package Lab2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueX mainQueue = new QueueX(5);
		Scanner sc = new Scanner(System.in);
		
		int inputStr;
		for(int i=1;i<=5;i++) {
			System.out.print("Enter the transaction ID"+i+":");
			inputStr = sc.nextInt();
			mainQueue.insert(inputStr);
		}
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		int value;
		
		while (!mainQueue.isEmpty()) {
			value = mainQueue.remove();
			if(value % 2 == 0) {
				evenQueue.insert(value);
			}
			else {
				oddQueue.insert(value);
			}
		}
		System.out.println("PC 1");
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction :"+evenQueue.remove());
		}
		System.out.println("PC 2");
		while(!oddQueue.isEmpty()) {
			System.out.println("Transaction :"+oddQueue.remove());
		}
		
	}

}
