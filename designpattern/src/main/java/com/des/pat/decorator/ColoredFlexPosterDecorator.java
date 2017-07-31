package com.des.pat.decorator;

public class ColoredFlexPosterDecorator extends PosterDecorator {
	Poster pd;
	public ColoredFlexPosterDecorator(Poster p){
		super(p);
		this.pd=p;
	}
	
	public void draw(){
		pd.draw();
		setColor(pd);
	}
	
	private void setColor(Poster pf){
		System.out.println("setting red color...");
	}

}
