package staticVari02;

public class Product {
	static int count;
	int proNo = 20230000;
	
//	{
//		++count;
//		proNo = count;
//	}
	
	Product(){
		++count;
		proNo += count;
	}
}
