package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	private Controller controller;
	private String[] input;
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(800,600);
	
	}
	public void setup() {
		input=loadStrings("data/input.txt");
		Controller controller=new Controller(input,this);
		controller.createInitialShapes();
	}
	

	
	public void draw() {
		background(0);
		
		
	}
	
	public void mousePressed() {
		
	}

}
