import java.util.NoSuchElementException;

public class Dever {
	public static void main(String[] args) {
		MyDeque<Integer> nDegree = new MyDeque<Integer>();
		nDegree.addFirst(6);
		nDegree.addFirst(-678);
		nDegree.addFirst(112);
		nDegree.addFirst(345);
		nDegree.addFirst(0);
		nDegree.addFirst(-6);
		System.out.println("-6, 0, 345, 112, -678, 6");
		System.out.println(nDegree);
		for (int i = 0; i < 500; i++) {
			nDegree.addFirst(i);
		}
		System.out.println(nDegree);
		for (int i = 0; i < 500; i++) {
			nDegree.addLast(i);
		}
		System.out.println(nDegree);
		String tester = "{";
		for (int i = 499; i >= 0; i--) {
			tester += i + " ";
		}
		tester += "-6 0 345 112 -678 6 ";
		for (int i = 0; i < 499; i++) {
			tester += i + " ";
		}
		tester += "499}";
		if (!nDegree.toString().equals(tester)) {
			System.out.println(false);
		}
		System.out.println(nDegree.removeFirst());
		System.out.println(nDegree);
		System.out.println(nDegree.removeLast());
		System.out.println(nDegree);
		System.out.println(nDegree.getFirst() + " " + nDegree.getLast());
		MyDeque<String> empty = new MyDeque<String>(500);
		try {
			empty.removeFirst();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		try {
			empty.removeLast();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		try {
			empty.getFirst();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		try {
			empty.getLast();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
	}
}
