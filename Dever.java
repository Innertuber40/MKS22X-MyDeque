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
	}
}
