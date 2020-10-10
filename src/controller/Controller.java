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
		boolean failed=false;
		int size;
		int posX;
		int posY;
		int[] colors= new int[3];
		colors[0]=(int)app.random(0, 255);
		colors[1]=(int)app.random(0, 255);
		colors[2]=(int)app.random(0, 255);
		
		do {
			
			int ranSize=(int)app.random(30, 80);
			int ranPosX=(int)app.random(80, 720);
			int ranPosY=(int)app.random(80, 520);
			failed=false;
			for(int i=0; i<shapes.size() && failed==false;i++) {
				if(PApplet.dist(shapes.get(i).getPosX(),shapes.get(i).getPosY(), ranPosX,ranPosY)<=shapes.get(i).getSize()/2+ranSize/2) {
				failed=true;	
				}
			}
			size=ranSize;
			posX=ranPosX;
			posY=ranPosY;
		}while(failed==true);
		
		
		
		int dir=(int)app.random(2);
		if(dir==0) {
			dir=-1;
		}
		int shape=(int)app.random(2);
		
		if(shape==0) {
			Circle c= new Circle(size, posX,posY , dir, colors, app);
			shapes.add(c);
		}
		if(shape==1) {
			Square s= new Square(size, posX,posY , dir, colors, app);
			shapes.add(s);
		}
		
	}
	
	public void switchDir(Shape s1) {
		int newDir1=s1.getDir()*-1;
		s1.setDir(newDir1);
	}
	
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	
	
	
	
	
	

}
