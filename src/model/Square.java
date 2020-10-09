package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Square extends Shape{

	public Square(int size, int posX, int posY, int dir, int[] colors, PApplet app) {
		super(size, posX, posY, dir, colors, app);

	}

	@Override
	public void draw() {
		getApp().fill(getColors()[0],getColors()[1],getColors()[2]);
		getApp().noStroke();
		getApp().rectMode(PConstants.CENTER);
		getApp().rect(getPosX(), getPosY(), getSize(), getSize());

		
	}

}
