package super07;
class Parent02{
	int x;
	Parent02(int x){
		this.x = x;
		System.out.println("부모 생성자");
	}
}
class Child02 extends Parent02{
	int x = 10;
	Child02(){
		// super는 부모의 생성자를 의미
		super(99);
		System.out.println("자식 생성자");
	}
	void superX() {
		System.out.println(super.x);
	}
}
public class SuperTest3 {

	public static void main(String[] args) {
		Child02 ch02 = new Child02();
		
		ch02.superX();

	}

}
