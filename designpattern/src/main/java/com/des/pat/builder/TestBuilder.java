package com.des.pat.builder;

public class TestBuilder {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		InhouseHttpClient ic=new InhouseHttpClient.HttpBuilder().proxy("proxy.cognizant.com").port(6050).host("cts").build();
		System.out.println(ic.toString());
	}

}
