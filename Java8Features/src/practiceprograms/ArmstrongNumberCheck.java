package practiceprograms;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {

		// int input = 153; 1634
		int input = 9474;

		System.out.println("count : " + countDigits(input));

		if (isArmstrong(input))
			System.out.println("The number is armstrong");
		else
			System.out.println("The number is not armstrong");

	}

	public static boolean isArmstrong(int input) {
		int j = input;
		int sum = 0;
		int digit = 0;
		int numDigits = countDigits(input);
		while (j > 0) {
			digit = j % 10;
			j = j / 10;

			sum = (int) (sum + Math.pow(digit, numDigits));
		}

		return sum == input;
	}

	public static int countDigits(int input) {
		int count = 0;
		while (input > 0) {
			input = input / 10;
			count++;
		}
		return count;
	}

}
