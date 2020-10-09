package controller;

import java.util.ArrayList;
import model.*;
import processing.core.PApplet;

public class Controller {
	private ArrayList<Shape> shapes;
	private String[] info;
	private PApplet app;

	public Controller(String[] info, PApplet app) {
		shapes= new ArrayList<Shape>();
		this.info=info;
		this.app=app;
	}
	
	//run in setup
	public void createInitialShapes() {
		
	}
	
	public void moveShapes() {
		
	}
	
	public void createShape() {
		
	}
	
	public void switchDir() {
		
	}
	
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
	
	
	
	
	

}
