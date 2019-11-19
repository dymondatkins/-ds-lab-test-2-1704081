
public class Node {

	private Book data;
	private Node next;
	
	public Node() {
		
	}
	public Node(Book data) {}
	
	public Node(Book data, Node next) {}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Book getData() {
		return data;
	}
	public void setData(Book data) {
		this.data = data;
	}
	public Node getNexts() {
		return nexts;
	}
	public void setNexts(Node nexts) {
		this.nexts = nexts;
	}
	private Node nexts;
	
	public void display() {}
}
