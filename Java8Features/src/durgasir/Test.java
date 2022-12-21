package durgasir;

class Parent{
	private int id;
	private String name;
	
	public Parent() {
		
	}
	private Parent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class Test extends Parent{
	
	/*
	 * public Test(int id, String name) { super(id, name); // TODO Auto-generated
	 * constructor stub }
	 */

	public static void main(String[] args) {
		String str = "";
		if(str.matches("^[^><}{\\]\\[#*;''`\\^]*$")) {
			System.out.println("Valid String input");
		}
		else
			System.out.println("Invalid string input");
		
	}
}
