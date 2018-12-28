package faktorial;

public class GeneratorProstychCzisiel {

	public static int Generator(int x) {

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				System.out.println(+x + " - nie prostoje czislo");
				return x;

			} else {
				System.out.println(+x + "- prostoje czislo");
				return x;

			}
		}
		return x;
	}

	public static void main(String[] args) {
		int x = (int) (2 + Math.random() * 10000000);
		System.out.println(Generator(x));

	}

}
