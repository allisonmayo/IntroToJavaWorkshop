package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a pirana-infested river, here's how to do it...

		// Get the user to enter an adjective
String adj = JOptionPane.showInputDialog("Enter an adjative.");
		// Get the user to enter a type of liquid
String liq = JOptionPane.showInputDialog("Enter a luquid");
		// Get the user to enter a body part
String bp = JOptionPane.showInputDialog ("Enter a body part " );
		// Get the user to enter a verb
String vrb = JOptionPane.showInputDialog ("Enter a verb ");
		// Get the user to enter a place
String plc = JOptionPane.showInputDialog ("Enter a place ");
		// Fit the user's words into this sentence, and save it in a String:
String story =  " Piranhas are more " +adj +"during the day, so cross the river at\n"+
		 "night. Piranhas are attracted to fresh " +liq +"and will most\n"+
		"likely take a bite out of your  [body part] if you" +bp +". Whatever'\n"+
		 "you do, if you have an open wound, try to find another way to get\n"+
		 "back to the " +plc +".Good luck!\n";
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
	JOptionPane.showMessageDialog(null, story);	

	}
}

