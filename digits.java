
import java.util.Scanner;

public class digits {
	int sum = 0;

	int sumOfDigits(long num) {
		if (num != 0) {
			sum += num % 10;
			num /= 10;
			sumOfDigits(num);
		}
		return sum;
	}

	public static void main(String arg[]) {
		int num, res;
		digits main = new digits();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		num = sc.nextInt();
		System.out.println("The sum of digits of the number is " + main.sumOfDigits(num));

	}
}