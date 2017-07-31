package com.des.pat.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
		Poster p = new SimplePoster();
		PosterDecorator pd = new ColoredFlexPosterDecorator(p);
		p.draw();
		pd.draw();
		
	}
	
	

}
