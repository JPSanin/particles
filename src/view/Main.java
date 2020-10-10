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
		controller=new Controller(input,this);
		controller.createInitialShapes();
		
	}
	

	
	public void draw() {
		background(0);
		controller.drawShapes();
		controller.moveShapes();
		
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
			   
			    //crear nueva figura aleatoria
		}
	}

}
