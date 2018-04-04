package modulo;

import org.jointheleague.graphical.robot.Robot;

public class Obedient {
	Robot art = new Robot();

	public static void main(String[] args) {
		Obedient cat =new Obedient();
//cat.drawStar();
cat.drawShape(360);
	}

	void drawStar() {
		for (int i = 1; i < 100; i++) {

			art.penDown();
			art.hide();
			art.setSpeed(100);
			art.move(100);
			art.turn(90);
			art.move(100);
			art.turn(144);

		}

	}
	void drawShape(int sides) {
		
		art.penDown();	
		art.hide();
		art.setSpeed(100);
		for (int i = 0; i < sides; i++) {
			art.move(500/sides);
			art.turn(360/sides);
			art.setSpeed(100);
			art.move(100);
			art.turn(90);
			art.move(100);
			art.turn(144);


		}
	}
	}

