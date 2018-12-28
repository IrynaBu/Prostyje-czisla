package faktorial;

public class fak1 {
	public static int faktorial(int n) {
		int b = 1;
		for (int i = 1; i <= n; i++) {
			b = b * i;
			
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println(faktorial(4));
	}

}
