class SuperClass {
	public int a = 10;
	public void metohd1() {
		System.out.println("SuperClass.method1");
	}
}

class SubClass extends SuperClass{
	public int a = 20;
	public void metohd1() {
		System.out.println("SubClass.method1");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		SuperClass class1 = new SuperClass();
		System.out.println(class1.a);
		class1.metohd1();
		
		SubClass class2 = new SubClass();
		System.out.println(class2.a);
		class2.metohd1();
		
		SuperClass class3 = new SubClass();
		System.out.println(class3.a);
		class3.metohd1();
		
		// SubClass class4 = new SuperClass();
		// cannot convert from SuperClass to SubClass
	}

}
