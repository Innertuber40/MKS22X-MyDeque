public class MyDeque<E> {
	private E[] deque;
	private int size;
	private int start;
	private int end;

	@SuppressWarnings("unchecked")
	public MyDeque() {
		start = 1;
		deque = (E[])new Object[10];
	}
	@SuppressWarnings("unchecked")
	public MyDeque(int initialCapacity) {
		start = 1;
		deque = (E[])new Object[initialCapacity];
	}

	public int size() {
		return size;
	}
	public String toString() {
		String returns = "{";
		/*for (int i = 0; i < deque.length; i++) {
			System.out.print(deque[i] + " ");
		}*/
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
		return returns + deque[end] + "}";
	}

	@SuppressWarnings("unchecked")
	private void resize() {
		E[] newArray = (E[])new Object[deque.length * 2];
		int j = 1;
		if (start >= end) {
			for (int i = start; i < deque.length; i++) {
				newArray[j] = deque[i];
				j++;
			}
			for (int i = 0; i < end + 1; i++) {
				newArray[j] = deque[i];
				j++;
			}
		} else {
			for (int i = start; i < end + 1; i++) {
				newArray[j] = deque[i];
				j++;
			}
		}
		deque = newArray;
		start = 1;
		end = j - 1;
	}

	public void addFirst(E element) {
		start--;
		if (start == -1) {
			start = deque.length - 1;
		}
		if (size == deque.length) {
			resize();
		}
		deque[start] = element;
		size++;
	}
	public void addLast(E element){
		end ++;
		if (end == deque.length) {
			end = 0;
		}
		if (size == deque.length) {
			resize();
		}
		deque[end] = element;
		size++;
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
