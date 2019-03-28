
	public class LinkedQueue<E> implements Queue<E> {

		   private LinkedList<E> list = new LinkedList<>();

		   @Override
		   public void enqueue(E element) {
		      list.addLast(element);
		   }

		   @Override
		   public E dequeue() {
		      return list.removeFirst();
		   }

		   @Override
		   public E first() {
		      return list.first();
		   }

		   @Override
		   public int size() {
		      return list.getSize();
		   }

		   @Override
		   public boolean isEmpty() {
		      return list.isEmpty();
		   }
		   
		}


