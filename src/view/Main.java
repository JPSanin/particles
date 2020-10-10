package view;

import controller.Controller;
import model.Shape;
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
		controller=new Controller(input,this);
		controller.createInitialShapes();
		
	}
	

	
	public void draw() {
		background(0);
		controller.drawShapes();
		controller.moveShapes();
		for(int i =0; i<controller.getShapes().size();i++) {
			for(int j =0; j<controller.getShapes().size();j++) {
				if(i!=j) {
					checkHit(controller.getShapes().get(i),controller.getShapes().get(j));
				}
				
			}
		}
		
		
	}
	
	public void mousePressed() {
		 if (mouseButton == LEFT) {
			 for (int i = 0; i <controller.getShapes().size() ; i++) {
				 if(mouseX>controller.getShapes().get(i).getPosX()-(controller.getShapes().get(i).getSize()/2)
					&&	mouseX<controller.getShapes().get(i).getPosX()+(controller.getShapes().get(i).getSize()/2) 
					&&	mouseY>controller.getShapes().get(i).getPosY()-(controller.getShapes().get(i).getSize()/2)
					&&	mouseY<controller.getShapes().get(i).getPosY()+(controller.getShapes().get(i).getSize()/2)) {
					 controller.getShapes().get(i).setStop(true);
					  }
			}
			
		} else if (mouseButton == RIGHT) {
			    controller.createShape();
		}
	}
	
	public void checkHit(Shape s1, Shape s2) {
		int realSize=s1.getSize()/2;
		int realSize2=s2.getSize()/2;
		
		if(dist(s1.getPosX(), s1.getPosY(), s2.getPosX(),s2.getPosY())<=realSize+realSize2) {
			
			controller.switchDir(s1);

		
		}
	}
}
