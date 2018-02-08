
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot sam = new Robot();
		// 3. ask the user what color they would like the robot to d
for (int i = 5; i < 10; i++) {
	

		String color = JOptionPane.showInputDialog("What color would you like the robot to draw in ?");
		// 4. use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("blue")) {
			sam.setPenColor(0, 20, 120);

		} else if (color.equalsIgnoreCase("red")) {
			sam.setPenColor(199, 0, 20);
		}else if (color.equalsIgnoreCase("green")) {
			sam.setPenColor(0, 108, 20);
		}else { JOptionPane.showMessageDialog(null, "Sorry I do have that color"); sam.setRandomPenColor();
			
		}


		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 2. set the pen width to 10
		sam.setPenWidth(10);
		// 1. make the robot draw a shape (this will take more than one line of code)

		sam.penDown();
		sam.hide();
		sam.setSpeed(10);
		sam.move(200);
		sam.turn(90);
		sam.move(200);
		sam.turn(90);
		sam.move(200);
		sam.turn(90);
		sam.move(200);
}
	}
}
