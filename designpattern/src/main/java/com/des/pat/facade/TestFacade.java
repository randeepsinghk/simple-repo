package com.des.pat.facade;

public class TestFacade {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		AppDeploy a = new AppDeployimpl();
		a.deploy();
		
	}

}
