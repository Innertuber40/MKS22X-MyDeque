public class Calculator {
	public static double eval(String s) {
		double[] values = new double[s.length()];
		char[] operators = new char[s.length()];
		int size;
		int valueStart;
		int valuePos;
		int charPos;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
				operators[charPos] = s.charAt(i);
				charPos++;
			}
		}
	}
}
