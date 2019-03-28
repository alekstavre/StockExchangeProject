

public class LinkedList<E> {

	private int size;
	private Node<E> headNode;
	private Node<E> tailNode;
		
	 public int getSize() {
	      return size;
	   }
	 
	public Node<E> getHead() {
	      return headNode;
	   }

	   public Node<E> getTail() {
	      return tailNode;
	
	   }
	   
	   public void addFirst(E element) {
			Node newEntry = new Node(element);
			newEntry.setNext(headNode);
			headNode = newEntry;
			
			if(this.isEmpty()) {
				tailNode = headNode;
			}
			
			size++;
		}
	   
	   public void addLast(E element) {
		   Node newEntry = new Node(element);
		   
		   if(this.isEmpty()) {
			   headNode = newEntry;
			   tailNode = headNode;
		   }else {
			   tailNode.setNext(newEntry);
			   tailNode = newEntry;		   
		   }
		   size++;
			 
	   }
	   
	public E removeFirst() {
		if(this.isEmpty()) {
			return null;
		}
		E element = headNode.getElement();
		headNode = headNode.getNext()	;
		size--;
		
		return element;
		
	}

	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public E first() {
	       return headNode.getElement();
	   }
}
