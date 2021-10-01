package javatutorials;

import javax.swing.JOptionPane;
public class Javatutorials {

	public static void main(String[] args) {
	
		String output = "";
		String markAsString;
		int mark;
		int numberPasses, numberFails;
		int counter = 0;
		int passMark = 50;
		int numberOfMarksToReadIn = 5;

		//initialise
		numberPasses = 0;
		numberFails = 0;
		
		while(counter < numberOfMarksToReadIn) {
			markAsString = JOptionPane.showInputDialog("Please input a number ");
			mark = Integer.parseInt(markAsString);
			
			if(mark >= passMark) {
				numberPasses = numberPasses + 1;
			}
			else {
				numberFails = numberFails + 1;
			}
			counter = counter + 1;
		}; 
		
		output = "Number of passes = " + numberPasses + "\n";
		output = output + "Number of fails = " + numberFails + "\n";
		//display output
		
		JOptionPane.showMessageDialog(null, output);
	}

}
