package queue;

public class Runner {
	//insert -> enqueue(data
	//remove -> dequeue()
	//implement with array
	//variables needed: front and rear
	//In a new queue, front is equal to rear
	//delete: front++
	//add: rear++
	
	public Runner() 
	{
		
	}

	public static void main(String[] args) 
	{
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		q.deQueue();
		q.deQueue();
		
		q.enQueue(9);
		q.enQueue(1);
		System.out.println("Size " + q.getSize());
		System.out.println("Full " + q.isFull());
		System.out.println("Empty " + q.isEmpty());
		q.show();
	}
}