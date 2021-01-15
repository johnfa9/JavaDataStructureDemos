package stack;



public class StackExample {
	static final int MAX=1000;
	int top;
	int a []=new int[MAX];
	
	public StackExample() {
		top = - 1;
	}

	boolean isEmpty() {
		return (top < 0);
	}
	
	boolean push(int x) {
		if (top>=(MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " Pushed into stack");
			return true;
		}
	}
	
	int pop() {
		if (top <0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}
	
	int peek() {
		if (top <0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x= a[top];
			return x;
		}
	}
	
	public static void main(String[] args) {
		StackExample x = new StackExample();
		x.push(10);
		x.push(20);
		x.push(30);
		System.out.println(x.pop() + " Popped from stack");
		
	}

}
