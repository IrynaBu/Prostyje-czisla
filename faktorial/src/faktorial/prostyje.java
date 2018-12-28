package faktorial;

public class prostyje {
	public static int prostyje(int x) {
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
				System.out.println(+x + "sostavnoje");
			} else {
				System.out.println(+x + "prostoje");
			}
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(prostyje(2));
	}
}
