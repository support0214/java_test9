package tv04;

public class TvTest {

	public static void main(String[] args) {
		SmartTv st1 = new SmartTv();
		st1.power();
		st1.channelUp();
		st1.search("JAVA");
		st1.netflix("피지컬100");
		st1.power();
	}

}
