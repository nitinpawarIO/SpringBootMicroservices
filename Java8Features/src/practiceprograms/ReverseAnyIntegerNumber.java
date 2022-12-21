package practiceprograms;

public class ReverseAnyIntegerNumber {

	public static void main(String[] args) {

		int number = 1453;
		int reverseNum = 0;
		
		while(number > 0)
		{
			int remainder = number % 10;
			reverseNum = reverseNum * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reversed Number : "+reverseNum);
	}

}
