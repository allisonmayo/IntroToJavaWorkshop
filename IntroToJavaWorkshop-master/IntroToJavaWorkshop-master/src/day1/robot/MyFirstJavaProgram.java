package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot Pixel = new Robot();
		
		Pixel.setPenColor(Color.BLUE);
		Pixel.penDown();
	Pixel.sparkle();	
	Pixel.move(100);
	Pixel.turn(90);
Pixel.move(100);
Pixel.turn(90);
Pixel.move(100);
Pixel.turn(90);
Pixel.move(100);
Pixel.penUp();
Pixel.move(140);
Pixel.penDown();
for (int i = 0; i < 4; i++) {
	
	
	Pixel.move(100);
	Pixel.turn(90);
	}
	
for(int i = 0; i < 3; i++){	
	
Pixel.move(100);
Pixel.move(75);







}
	}
		
		
	}

