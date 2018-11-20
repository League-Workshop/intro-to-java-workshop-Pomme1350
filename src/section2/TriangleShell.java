package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot k3c3=new Robot();
	
	void go() {
		// 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		k3c3.setSpeed(200);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int length=50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for(int i=0; i<60; i++) {
			// 9. Change the color of the pen to a random color
		k3c3.setRandomPenColor();
			// 8. Increase the length variable by 10
		length=length+10;
			// 5. call your drawTriangle() method using your length variable
		drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right
		k3c3.turn(9);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
