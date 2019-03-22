public class MyDeque<E> {
	private E[] deque;
	private int size;
	private int start;
	private int end;

	@SuppressWarnings("unchecked")
	public MyDeque() {
		deque = (E[])new Object[10];
	}
	@SuppressWarnings("unchecked")
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
				returns += deque[i] + " ";
			}
		} else {
			for (int i = start; i < deque.length; i++) {
				returns += deque[i] + " ";
			}
			for (int i = 0; i < end; i++) {
				returns += deque[i] + " ";
			}
		}
		return returns;
	}

	@SuppressWarnings("unchecked")
	public void addFirst(E element) {
		if (start == end) {
			E[] newArray = (E[])new Object[deque.length * 2];
			int j = 0;
			if (start < end) {
				for (int i = start; i < end; i++) {
					newArray[j] = deque[i];
					j++;
				}
			} else {
				for (int i = start; i < deque.length; i++) {
					newArray[j] = deque[i];
					j++;
				}
				for (int i = 0; i < end; i++) {
					newArray[j] = deque[i];
					j++;
				}
			}
			deque = newArray;
		}
		start--;
		if (start == -1) {
			deque[deque.length - 1] = element;
			start = deque.length - 1;
		} else {
			deque[start] = element;
		}
		size++;
	}
	@SuppressWarnings("unchecked")
	public void addLast(E element){
	
	}
	
	public E removeFirst(){
		return null;	
	}
	public E removeLast(){
		return null;
	}
	
	public E getFirst(){
		return null;
	}
 	public E getLast(){
		return null;
	}
}
