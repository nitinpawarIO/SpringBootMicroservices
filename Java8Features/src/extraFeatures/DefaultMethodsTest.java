package extraFeatures;

interface Left 
{
	default void m1() {
		System.out.println("Left inteface m1 method");
	}
}

interface Right
{
	default void m1() {
		System.out.println("Right interface m1 method");
	}
}

interface Myinteface
{
	public static int myvar = 10;
	public static void myMethod()
	{
		System.out.println("My interface method !");
	}
}
public class DefaultMethodsTest implements Myinteface{

		
	public static void main(String[] args) {
		DefaultMethodsTest obj = new DefaultMethodsTest();
		//obj.myMethod(); error
		Myinteface.myMethod();
		System.out.println(Myinteface.myvar);
		
		
	}
	

}
