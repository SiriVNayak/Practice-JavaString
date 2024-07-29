package exception_handling_practice;

class Base extends Exception{}
class Derived extends Base{}
public class HirarchtTest {
	public static void main(String[] args) {
		System.out.println("First");
		try {
			throw new Derived();
		} catch (Base b) {
			// TODO: handle exception
			System.out.println("Called Based Class");
		}
//		catch (Derived d) {
//			// TODO: handle exception
//		}
		System.out.println("Second");
	}
}
