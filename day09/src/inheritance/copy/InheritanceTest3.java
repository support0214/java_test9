package inheritance.copy;
class D{
	static int i;
	static int j;
}

class E extends D {
	static String i;
}


public class InheritanceTest3 {

	public static void main(String[] args) {
		D.i = 100;
		E.i = "kh정보교육원";
		D.j = 500;
		System.out.println(D.i);
		System.out.println(E.i);
		System.out.println(D.j);
		
	}

}
