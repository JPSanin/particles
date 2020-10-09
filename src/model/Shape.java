package model;

import processing.core.PApplet;

public abstract class Shape {

	private int size;
	private int posX;
	private int posY;
	private int dir;
	private int[] colors;
	private PApplet app;
	private boolean stop;
	

	
	public Shape(int size, int posX, int posY, int dir, int[] colors, PApplet app) {
		this.size = size;
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;
		this.colors = colors;
		this.app = app;
		stop=false;
	}
	public void move() {}
	public abstract void draw();


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public int getDir() {
		return dir;
	}


	public void setDir(int dir) {
		this.dir = dir;
	}

	public int[] getColors() {
		return colors;
	}
	public void setColors(int[] colors) {
		this.colors = colors;
	}
	public PApplet getApp() {
		return app;
	}
	public void setApp(PApplet app) {
		this.app = app;
	}
	public boolean isStop() {
		return stop;
	}


	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
}
