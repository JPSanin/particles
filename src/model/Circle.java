package model;

import processing.core.PApplet;

public class Circle extends Shape{

	
	public Circle(int size, int posX, int posY, int dir, int[] colors, PApplet app) {
		super(size, posX, posY, dir, colors, app);
		
	}

	@Override
	public void draw() {
		getApp().fill(getColors()[0],getColors()[1],getColors()[2]);
		getApp().noStroke();
		getApp().ellipse(getPosX(), getPosY(), getSize(), getSize());	
	}
	
	
	

}
