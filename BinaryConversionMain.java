import java.util.Scanner;

public class BinaryConversionMain {
	public static void main (String[]args) {
		System.out.println("Do you want to convert from decimal to binary (d) or binary to decimal (b)?");
		Scanner s = new Scanner (System.in);
		String option = s.next();
		if (option.equals("d")) {
			System.out.println("What demical number do you want to convert to binary?");
			long number = s.nextLong();
			for (int i = 50; i >= 0; i--) {
				long other = (long) Math.pow(2, i);
				if (number >= other) {
					System.out.print("1");
					number -= other;
				}
				else {
					System.out.print("0");
				}
			}
		}
		else {
			System.out.println("What binary number do you want to convert to decimal?");
				String number = s.next();
				long out = 0;
				int power = 0;
				for (int i = number.length(); i > 0; i--) {
					String check = number.substring(i-1,i);
					if (check.equals("1")) {
						out += Math.pow(2, power);
					}
					power++;
				}
			System.out.println(out);
		}
	}
}
