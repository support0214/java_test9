package super07;

class Parent{
	int x = 10;
}
class Child extends Parent{
	int x = 100;
	void method() {
		int x = 1000;
		System.out.println("x=" + x); //1000 지역변수 x가 있기때문
		System.out.println("this.x=" + this.x); //this . 100 객체변수 먼저 봄 
		System.out.println("super.x=" + super.x); //부모의 들어있는 값 super. 10
	}
}
public class SuperTest {

	public static void main(String[] args) {
		Child child = new Child();
		child.method();
	}

}
