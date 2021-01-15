package stackedPackage;

public class Runner {

	public Runner() {
		
	}

	public static void main(String[] args) {
		Stack nums = new Stack();
		nums.push(15);
		nums.push(8);
		System.out.println(nums.peek());
		nums.push(10);
		nums.push(12);
		System.out.println(nums.pop());
		System.out.println("size is " + nums.size());
		System.out.println("empty =  " + nums.isEmpty());
		nums.show();
	}

}
