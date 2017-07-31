package com.des.pat.decorator;

public abstract class PosterDecorator implements Poster {
	private Poster pd;
	public PosterDecorator(Poster p){
		this.pd = p;
	}

	public void draw() {
		pd.draw();

	}
	

}
