package phone05;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone();
		sp1.bell();
		sp1.sendVoice("여보세요");
		sp1.reciVoice("네");
		sp1.hangUp();
		sp1.kakao("카카오");
		sp1.msg("문자");
		sp1.play("동영상");
		sp1.search("검색");
		
		CellPhone cp1 = new CellPhone();
		cp1.bell();
	}

}
