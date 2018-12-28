package faktorial;

public class prostyje {
	public static int prostyje(int x) {
		if (x <= 1) {
			System.out.println(+x + "- nie prostoje czislo");
		} else if (x == 2) {
			System.out.println(+x + " -  prostoje czislo");
		}
	else

	{

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				System.out.println(+x + " - nie prostoje czislo");
				return x;
			} else {
				System.out.println(+x + "- prostoje czislo");
				return x;
			}

		}
	}

	return x;

	}

	public static void main(String[] args) {
		System.out.println(prostyje(33));
	}
}
