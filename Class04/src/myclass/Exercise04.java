package myclass;

import javax.swing.JOptionPane;


public class Exercise04 {

	public static void main(String[] args) {
	String output="";
	String aNum;
	int num;
	int maxNum = 10;
	int tempNum;
	
	//declare any array
	final int ARRAY_SIZE = 5;
	int [] myArray = new int[ARRAY_SIZE];
	
	//read in 5 numbers
	for(int loop = 0; loop < myArray.length; loop++) {
		aNum = JOptionPane.showInputDialog("Please input a number ");
		num = Integer.parseInt(aNum);
		
		
		//put the number in the array
		myArray[loop] = num;
	}//end of loop
	output = "The number in the array are \n" ;	
	for(int loop = 0; loop < myArray.length; loop++) {
		tempNum = myArray[loop];
		if(tempNum < maxNum) {
			output = output + tempNum + " ";
		}
	
		
	}

		
	JOptionPane.showMessageDialog(null, output);	
	}

}
