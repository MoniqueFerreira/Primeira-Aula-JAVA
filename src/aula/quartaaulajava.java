package aula;

public class quartaaulajava {

	public static int adicao(int n1, int n2) {
		int total = n1 + n2;
		return total;
	}
	public static double subtracao(int n1, int n2) {
		double total = n1 - n2;
		return total;
	}
	public static double mult(int n1, int n2) {
	double total = n1 * n2;
	return total;
	}
	public static double divisao(int n1, int n2) {
		double total = n1 / n2;
		return total;
	}
	public static double expo(int n1, int n2) {
		double total = n1 ^ n2;
		return total;
	}
	public static void main(String[] args) {
		System.out.println(adicao(10,2));
		System.out.println(subtracao(10,2));
		System.out.println(mult(10,2));
		System.out.println(divisao(10,2));
		System.out.println(expo(10,2));
		
	}
}

