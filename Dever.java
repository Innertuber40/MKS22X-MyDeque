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
	}
}
