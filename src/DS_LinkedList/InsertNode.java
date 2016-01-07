package DS_LinkedList;

public class InsertNode {

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
	
	public static void main(String[] args){
		InsertNode linkedlist = new InsertNode();
		linkedlist.insertFront(5);
		linkedlist.insertFront(4);
		linkedlist.insertFront(3);
		linkedlist.insertFront(2);
		linkedlist.insertFront(1);
		
		linkedlist.afterGivenNode(0,3);
		linkedlist.afterGivenNode(9,5);
		
		linkedlist.insertEnd(10);
		linkedlist.insertEnd(11);
	}
}
