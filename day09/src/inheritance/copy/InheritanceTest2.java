package inheritance.copy;
class A1{
	int i, j;
}

class B1 extends A1 {
	String i;
}


public class InheritanceTest2 {

	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.i = "KH정보교육원";
		System.out.println(b1.i); // 기본값(null -> KH정보교육원)
		// 우선순위는 자손의 변수가 있으면 먼저 실행됨
		//b1.i = 100; // 자료형이 맞지않아 오류발생
		
		A1 a1 = new A1();
		a1.i = 100;
		System.out.println(a1.i);
	}

}
