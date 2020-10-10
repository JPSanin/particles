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
	
	public void createInitialShapes() {
		
		for (int i = 0; i < info.length; i++) {
			int[] colors= new int[3];
			colors[0]=(int)app.random(0, 255);
			colors[1]=(int)app.random(0, 255);
			colors[2]=(int)app.random(0, 255);
			String[] buildInfo=info[i].split(" ");
			if(buildInfo[0].equals("Cuadrado")) {
				int size=Integer.parseInt(buildInfo[1]);
				int posX=Integer.parseInt(buildInfo[2]);
				int posY=Integer.parseInt(buildInfo[3]);
				int dir=Integer.parseInt(buildInfo[4]);
				Square s= new Square(size, posX,posY , dir, colors, app);
				shapes.add(s);
			}else if(buildInfo[0].equals("Circulo")){
				int size=Integer.parseInt(buildInfo[1]);
				int posX=Integer.parseInt(buildInfo[2]);
				int posY=Integer.parseInt(buildInfo[3]);
				int dir=Integer.parseInt(buildInfo[4]);
				Circle c= new Circle(size, posX,posY , dir, colors, app);
				shapes.add(c);
			}
		}
	}
	
	public void drawShapes() {
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).draw();
			}
		
	}
	public void moveShapes() {
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).move();
			}
	}
	
	public void createShape() {
		
	}
	
	public void switchDir() {
		
	}
	
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	
	
	
	
	
	

}
