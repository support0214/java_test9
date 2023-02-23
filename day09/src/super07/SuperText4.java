package super07;
class Parent4{
	int x;
	Parent4(int x){
		this.x = x*x;
		System.out.println(this.x);
	}
}
class Child4 extends Parent4{
	int y;
	Child4(int x, int y){
		super(x); // 부모 x의 값 대입
		this.y = y*y;
		System.out.println(this.y);
	}
}
public class SuperText4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child4 child4 = new Child4(3,9);
		
	}

}

