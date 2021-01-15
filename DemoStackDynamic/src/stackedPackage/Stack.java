package stackedPackage;


//this is not the LinkedList object included in Java
public class Stack {
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int data)
	{
		if(size()==capacity)
		{
			expand();
		}
			stack[top]=data;
			top++;
		}
	private void expand() {
		int length = size();
		int newStack[] = new int[capacity*2];
		
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity*=2;
	}
	
	
	public int pop()
	{
		int data=0;
		if(isEmpty()) {
			System.out.println("Stack is empty!");
		}
		else
		{
			top--;
			data =stack[top];
			stack[top] = 0;
			shrink();

		}
		return data;
	}
	
	private void shrink() {
		int length = size();
		if(length<=(capacity/2)/2) {  //if array size is 16 and there are 8 elements, don't shrink unless there are 2 elements
			capacity = capacity/2;
			int newStack[] = new int[capacity];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack = newStack;
		}
		
	}
	public void show()
	{
		for (int n :stack)
		{
			System.out.print(n + " ");
		}
	}
	
	public int size()
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		return top<=0;
	}
	
	public int peek()
	{
		int data;
		
		data =stack[top-1];
		
		
		return data;
	}
	
}
