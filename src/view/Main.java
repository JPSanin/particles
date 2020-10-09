package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	private Controller controller;
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(800,600);
	
	}
	public void setup() {
		Controller controller=new Controller();
	}
	

	
	public void draw() {
		background(0);
		
		
	}
	
	public void mousePressed() {}

}
