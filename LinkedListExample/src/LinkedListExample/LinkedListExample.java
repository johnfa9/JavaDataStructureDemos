package LinkedListExample;


public class LinkedListExample {
	Node head; //head of list
	
	static class Node {  //inner class
		int data;
		Node next;
		
		//Constructor
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	//Method to insert a new node
	public static LinkedListExample insert(LinkedListExample list, int data) {
		//Create a new node with given data
		Node new_node = new Node (data);
		new_node.next=null;
		
		//If the Linked List is empty, then make the new node as head
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			//else traverse till the last node
			// and insert the new_node there
			Node last=list.head;
			while (last.next != null) {
				last =last.next;
			}
			last.next = new_node;
		}
		//return the list by head
		return list;
	}
	
	public static void printList(LinkedListExample list) {
		Node currNode = list.head;
		System.out.print("LinkedList: ");
		//Traverse through the LinkedList
		while (currNode != null) {
			//Print the data at the current node
			System.out.print(currNode.data + " ");
			//goto next node
			currNode = currNode.next;
		}
		
	}

	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample();
		list = insert(list,1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		
		printList(list);
	}

}
