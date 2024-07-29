package oops_concepts;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent p1 = new Child();
		p.m1();
		c.m1();
		p1.m1();
	}

}
class Parent {
	public void m1() {
		System.out.println("Parent m1");
	}
}

class Child extends Parent{
	public void m1() {
		System.out.println("Child m1");
	}
}
