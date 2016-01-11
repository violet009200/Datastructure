package DS_LinkedList;

public class LinkedList {

	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	//at the front of linked list
	public void insertFront(int d){
		System.out.println("Insert Node at the front of the list");
		Node newNode = new Node(d);
		
		if(head == null){
			head = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
		System.out.println("After Insert Node");
		printList();
	}
	
	//after a given data node
	public void afterGivenNode(int d, int t){
		Node newNode = new Node(d);
		Node cur = head;
		
		while(cur!=null){
			
			if(cur.data == t){
				newNode.next = cur.next;
				cur.next = newNode;
				break;
			}
			else{
				cur = cur.next;
			}
		}
		System.out.println("put new node next "+ t+" node");
		printList();
	}
	
	//at the end of the linked list
	public void insertEnd(int d){
		Node newNode = new Node(d);
		Node cur = head;
		
		while(cur.next!=null){
			cur = cur.next;
		}
		
		cur.next = newNode;
		newNode.next =null;
		
		System.out.println("at the end of the node");
		printList();
	}
	
	//print linkelist
	public void printList(){
		Node cur = head;
		while(cur != null){
			System.out.print(cur.data+" ");
			cur = cur.next;
		}
		System.out.println("");
	}
	
	public void deleteNode(int d){
		Node cur = head;
		
		while(cur.next != null){
			if(cur.next.data == d){
				//delete node
				cur.next = cur.next.next;
				break;
			}
			else cur = cur.next;
		}
		System.out.println("after delete node");
		printList();
	}
	
	public void deleteNodeatPosition(int pos){
		Node cur = head;
		int i;
		for(i=1; i<pos-1; i++){
			cur = cur.next;
		}
		//delete cur.next
		cur.next = cur.next.next;
		
		System.out.println("deleting Node at pos: "+pos);
		printList();
	}
	
	public void insertNodeatPosition(int d, int pos){
		Node newNode = new Node(d);
		Node cur = head;
		
		for(int i=1; i<pos;i++){
			cur = cur.next;
		}
		newNode.next = cur.next;
		cur.next = newNode;
		
		System.out.println("Insert Node at pos: "+pos);
		printList();
	}
	
	public void findLengthIterative(LinkedList ll){
		System.out.println("find length of LL by using Iterative");
		int length = 0;
		Node cur = ll.head;
		
		while(cur != null){
			length++;
			cur = cur.next;
		}
		
		System.out.println("length is: "+length);
		
	}
	
	public int findLengthRecursive(Node n){
		
		if(n == null) {
			return 0;
		}
		
		return 1+findLengthRecursive(n.next);
	}
	
	
	public void swapNode(int x, int y){
		
	}
	
	public static void main(String[] args){
		LinkedList linkedlist = new LinkedList();
		linkedlist.insertFront(5);
		linkedlist.insertFront(4);
		linkedlist.insertFront(3);
		linkedlist.insertFront(2);
		linkedlist.insertFront(1);
		
		linkedlist.afterGivenNode(0,3);
		linkedlist.afterGivenNode(9,5);
		
		linkedlist.insertEnd(10);
		linkedlist.insertEnd(11);
		
		linkedlist.deleteNode(3);
		
		linkedlist.deleteNodeatPosition(2);
		
		linkedlist.insertNodeatPosition(7, 2);
		
		linkedlist.findLengthIterative(linkedlist);
		
		System.out.println("find length of LL by using Recursive");
		int len = linkedlist.findLengthRecursive(linkedlist.head);
		System.out.println("length is :"+len);
	}
}
