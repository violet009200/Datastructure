package DS_LinkedList;

public class simpleLinkedList {
	
	public Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
		}
	}
	
	public static void main(String args[]){
		simpleLinkedList ll = new simpleLinkedList();
		
		ll.head = ll.new Node(1);
		Node second = ll.new Node(2);
		Node third = ll.new Node(3);
		
		ll.head.next = second;
		second.next = third;
		
		//print Linked List
		Node cur = ll.head;
		
		while(cur != null){
			System.out.print(cur.data+" ");
			cur = cur.next;
		}
		
	}
}
