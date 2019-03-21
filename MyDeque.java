public class MyDeque<E> {
	private E[] deque;
	private int size;
	private int start;
	private int end;

	//@SuppressWarnings("unchecked")
	public MyDeque() {
		deque = (E[])new Object[10];
	}
	//@SuppressWarnings("unchecked")
	public MyDeque(int initialCapacity) {
		deque = (E[])new Object[initialCapacity];
	}

	public int size() {
		return size;
	}
	public String toString() {
		String returns = "";
		if (start < end) {
			for (int i = start; i < end; i++) {
				returns += deque[i];
			}
		} else {
			for (int i = start; i < deque.length; i++) {
				returns += deque[i];
			}
			for (int i = 0; i < end; i++) {
				returns += deque[i];
			}
		}
		return returns;
	}

	@SuppressWarnings("unchecked")
	public void addFirst(E element){
		if (start == end) {
			newArray = (E[]) new Object[deque.length * 2];
			if (start < end) {
				for (int i = start; i < end; i++) {
					returns += deque[i];
				}
			} else {
				for (int i = start; i < deque.length; i++) {
					returns += deque[i];
				}
				for (int i = 0; i < end; i++) {
					returns += deque[i];
				}
			}
		}	
	}
	@SuppressWarnings("unchecked")
	public void addLast(E element){
	
	}
	
	public E removeFirst(){
	
	}
	public E removeLast(){
	
	}
	
	public E getFirst(){
	
	}
 	public E getLast(){
	
	}
}
