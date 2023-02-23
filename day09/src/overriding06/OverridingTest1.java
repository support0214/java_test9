package overriding06;
class Parent{ //오버라이딩 매개변수가 같음
	void print() {
		System.out.println("부모 클래스의 print() 메서드");
	}
}
class Child extends Parent{
	void print() {
		System.out.println("자식 클래스의 print() 메서드");
	}
}

public class OverridingTest1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.print(); // 오버라이딩 (상속에서만 사용)
		
		Child1 child1 = new Child1();
		child1.show(); // 오버로딩 (상속, 메서드, 생성자 사용)
		child1.show("인자 1개");
	}

}

class Parent1{ //오버로딩 매개변수가 다름
	void show() {
		System.out.println("부모 show()메서드");
	}
}
class Child1 extends Parent1{
	void show(String name) {
		System.out.println("자식 show() 메서드" + name);
	}
}