package faktorial;

public class GeneratorProstychCzisiel {

	public static int Generator(int x) {
		if (x <= 1) {
			System.out.println(+x + "- nie prostoje czislo");
		} else if (x == 2) {
			System.out.println(+x + " -  prostoje czislo");
		} else

		{
			boolean resault = false;

			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					resault = true;
					break;

				}
			}
			if (resault) {
				System.out.println("   ");
			} else {
				System.out.println(+x + "prostoje");
			}
		}
		return x;
	}

	public static void main(String[] args) {
		int x = (int) (2 + Math.random() * 10000000);
		System.out.println(Generator(x));

	}

}
