
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 3th";
		String dadsBirthday = "May 6th";
		String isabellesBirthday = "July 18th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog(null, "Who's birthday do you want?");
		// 3. Print out what the user typed
	if (birthday.equals("isabelle")) {System.out.println(isabellesBirthday);
		
	}if (birthday.equals("mom")) {System.out.println(momsBirthday);
		
	} else if (birthday.equals("dad")){ System.out.println(dadsBirthday);

	}else { JOptionPane.showMessageDialog(null, "Sorry can't remember that person's birthday!");
		
	}
		// 4. if user asked for "mom"
			//print mom's birthday
		
		// 5. if user asked for "dad"
			// print dad's birthday

		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
