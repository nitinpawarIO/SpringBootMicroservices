package test;

abstract class MyAbstract{
	public abstract void fly();
	public static void dispayData() {
		System.out.println("In abstract classes display Data..");
	}
	
	public void testMethod() {
		System.out.println("Inside TestMethod of abstract class..");
	}
}

public class TestExamples {
	
	
	public static void main(String[] args) {
		MyAbstract.dispayData();
		MyAbstract obj = new MyAbstract() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
		};
		obj.testMethod();
	}

}
