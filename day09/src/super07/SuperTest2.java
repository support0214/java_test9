package super07;
class Parent01{
	int x = 10;
	void show() {
		System.out.println("부모클래스 show() 메서드");
	}
}
class Child01 extends Parent01{
	int x = 100;
	void show() {
		System.out.println("자식클래스 show() 메서드");
	}
	void write() {
		int x = 500;
		show();
		super.show();
		System.out.println("지역변수 x변수 : " + x);
		System.out.println("Child01의 x변수 : " + this.x);
		System.out.println("Parent01의 x변수 : " + super.x);
	}
}
public class SuperTest2 {

	public static void main(String[] args) {
		Child01 ch01 = new Child01();
		ch01.write();

	}

}
