package com.des.pat.decorator;

public class FlexPoster extends SimplePoster {
	Poster pd;

	public FlexPoster(Poster p) {
		this.pd = p;
	}

	public void draw() {
		System.out.println("drawing FlexPoster ....");
	}

}
