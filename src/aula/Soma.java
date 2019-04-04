package aula;

import java.math.BigDecimal;

public class Soma {

	public static void main(String[] args) {
		problemDouble();
		
		problemString();

	}

	public static void problemString() {
		int MAX = 10000;
		long t0sb = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<MAX; i++) {
			sb.append(i);
		}
		
		long t1sb = System.currentTimeMillis();
		long tStringBuilder = (t1sb-t0sb);
		System.out.println("Tempo concat StringBuilder (ms): " + tStringBuilder);
		
		long t0 = System.currentTimeMillis();
		String s = "";
		for (int i = 0;i <MAX; i++) {
			s += i;
		}
		
		long t1 = System.currentTimeMillis();
		long tString = (t1-t0);
		System.out.println("Tempo concat String (ms): " + tString);
	}

	public static void problemDouble() {
		double x;
		x = 0.1 + 0.2;
		System.out.println(x);
		
		BigDecimal v1 = new BigDecimal(0.1);
		BigDecimal v2 = new BigDecimal(0.2);
		BigDecimal v3 = v1.add(v2);
		System.out.println(v3);
		
		BigDecimal v1a = new BigDecimal("0.1");
		BigDecimal v2b = new BigDecimal("0.2");
		BigDecimal v3b = v1a.add(v2b);
		System.out.println(v3b);
	}

}
