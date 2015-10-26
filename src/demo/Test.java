package demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {

	public static void test() {
		List<String> list = new ArrayList<String>();
		list.add(".02");
		list.add(".02");
		list.add(".02");
		list.add(".01");

		BigDecimal bd1 = new BigDecimal("0");
		for (int i = 0; i < list.size(); i++) {
			BigDecimal b = new BigDecimal(list.get(i));
			bd1 = bd1.add(b);
			System.out.println(bd1.doubleValue());
		}

		System.out.println("bigdecimal: " + bd1.doubleValue());
		System.out.println(bd1.multiply(new BigDecimal("100")).intValue());
	}

	public static void main(String[] args) {
//		test();
		System.out.println(99996/6);
		
		Object o = new Date();
	}
}
