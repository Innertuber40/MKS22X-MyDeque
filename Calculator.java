public class Calculator {
	public static double eval(String s) {
		MyDeque<Double> calc = new MyDeque<Double> (s.length());
		int valueStart = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+') {
				calc.addLast(calc.removeLast() + calc.removeLast());
				i++;
				valueStart = i + 1;
			}
			if (s.charAt(i) == '-') {
				calc.addLast(-calc.removeLast() + calc.removeLast());
				i++;
				valueStart = i + 1;
			}
			if (s.charAt(i) == '*') {
				calc.addLast(calc.removeLast() * calc.removeLast());
				i++;
				valueStart = i + 1;
			}
			if (s.charAt(i) == '/') {
				calc.addLast(1 / calc.removeLast() * calc.removeLast());	
				i++;
				valueStart = i + 1;
			}
			if (s.charAt(i) == '%') {
				Double late = calc.removeLast();
				calc.addLast(calc.removeLast() % late);
				i++;
				valueStart = i + 1;
			}
			if (s.charAt(i) == ' ') {
				calc.addLast(Double.parseDouble(s.substring(valueStart, i)));
				valueStart = i + 1;
			}

		}
		return calc.removeLast();
	}
}
