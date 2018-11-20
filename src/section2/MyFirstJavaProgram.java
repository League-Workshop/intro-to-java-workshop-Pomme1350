package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot r2d2=new Robot();
	r2d2.setSpeed(1000);
	r2d2.setPenColor(Color.magenta);
	r2d2.penDown();
	
	
	for(int i=0; i<20; i++) {
	
		r2d2.move(100);
		r2d2.turn(100);
		
	}
	r2d2.setPenColor(Color.CYAN);
	
	r2d2.move(200);
	
	
	
	for(int i=0; i<20; i++) {
		
		r2d2.move(100);
		r2d2.turn(100);
		
	}
		
	r2d2.turn(300);
	r2d2.setPenColor(Color.BLACK);
	r2d2.move(150);
	
	
	for(int i=0; i<20; i++) {
		
		r2d2.move(100);
		r2d2.turn(100);
		
	}

	r2d2.turn(270);
	r2d2.setPenColor(Color.MAGENTA);
	r2d2.move(50);
	}
}

