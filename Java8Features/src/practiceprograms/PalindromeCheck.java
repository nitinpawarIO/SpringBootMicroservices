package practiceprograms;

public class PalindromeCheck {
	
	
	public static void main(String[] args) {
		String input = "Good Morning madam , I am nitin bbbb";
		
		String[] inputs = input.split(" ");
		
		for(String str : inputs)
		{
			if (isPalindrome(str))
				System.out.println(str);
		}
		
	}
	
	public static boolean isPalindrome(String input)
	{
		int start = 0;  // start 
		int end = input.length()-1;
		
		while(end > start)
		{
			if(input.charAt(start) != input.charAt(end))
				return false;
			
			start++;
			end--;
			
		}
		return true;
	}

}
