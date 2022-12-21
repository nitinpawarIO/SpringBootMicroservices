package practiceprograms;

public class PrintOneToHunredWithoutUsingNumbers {

	public static void main(String[] args) {
		
		int one = 'a'/'a';
		int ten = "**********".length();
		for(int i=one; i<=(ten*ten); i++)
			System.out.println(i);
		
		// Another Approach
		
		for(int i=one; i<='d'; i++)
			System.out.println(i);
	}

}
