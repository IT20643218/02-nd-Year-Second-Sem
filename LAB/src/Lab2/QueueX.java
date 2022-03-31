package Lab2;

public class QueueX {

	//Attribute
	private int [] queueArr;
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;

	//Constructor
	public QueueX(int s) {
		
		maxSize = s;
		queueArr = new int[maxSize];
		front = 0;
		rear = -1;
		noItems = 0;
	}
	
	//add new value to the queue
	public void insert(int j){
		if(rear == maxSize -1 ) {
			System.out.println("Queue is full...");
		}
		else {
			queueArr[++rear] = j;
			noItems++;
		}
	}
	
	//remove new value to the queue
	public int remove(){
		if(noItems == 0) {
			System.out.println("Queue is Empty...");
			return -99;
		}
		else {
			noItems --;
			return queueArr [front++];
		}
	}
	
	public boolean isEmpty(){
		return (noItems == 0);
	}
		
	public boolean isFull(){
		return(noItems == maxSize );
	}
	
}
