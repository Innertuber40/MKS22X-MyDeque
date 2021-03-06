import java.util.NoSuchElementException;

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
		if (element == null) {
			throw new NullPointerException("No nulls, jerk");
		}
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
		if (element == null) {
			throw new NullPointerException("No nulls, jerk");
		}
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
	
	public E removeFirst() {
		if (size == 0) {
			throw new NoSuchElementException("Sorry, the deque is empty right now");
		}
		E returns = deque[start];
		deque[start] = null;
		if (start == deque.length - 1) {
			start = 0;
		} else {
			start++;
		}
		size--;
		return returns;
	}
	public E removeLast() {
		if (size == 0) {
			throw new NoSuchElementException("Sorry, the deque is empty right now");
		}
		E returns = deque[end];
		deque[end] = null;
		if (end == 0) {
			end = deque.length - 1;
		} else {
			end--;
		}
		size--;
		return returns;
	}
	
	public E getFirst() {
		if (size == 0) {
			throw new NoSuchElementException("Sorry, the deque is empty right now");
		}
		return deque[start];
	}
 	public E getLast() {
		if (size == 0) {
			throw new NoSuchElementException("Sorry, the deque is empty right now");
		}
		return deque[end];
	}
}
