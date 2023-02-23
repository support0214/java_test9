package phone05;

public class CellPhone extends Phone {
	void msg(String msg) {
		System.out.println("문자 " + msg + "을 보냅니다");
	}
	void play(String name) {
		System.out.println("동영상 " + name + "을 재생합니다");
	}
}
