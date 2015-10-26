package demo;

public class ForTest {
	public static void main(String[] args) {
		byte b = '1';
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 800000; i++) {
			System.out.println("start"+ System.currentTimeMillis());
			String hs = "";
			String stmp = "";
			stmp = (java.lang.Integer.toHexString(b & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
			System.out.println("end i="+i+", "+ System.currentTimeMillis());
		}
		System.out.println(System.currentTimeMillis());
	}
	
	public static void test(){
		
	}
}
