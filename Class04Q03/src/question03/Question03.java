package question03;

import javax.swing.JOptionPane;

public class Question03 {

	public static void main(String[] args) {
		String output="";
		String salaryAsAString;
		float salary;
		float tempSalary;
		float tempTax;
		final float TAX_RATE = 0.25f;
		
		final int ARRAY_SIZE = 5;
		float [] myArray = new float[ARRAY_SIZE];
		
		//read in 5 salaries
		for(int loop = 0; loop < myArray.length; loop++) {
			salaryAsAString = JOptionPane.showInputDialog("Please input a salary ");
			salary = Float.parseFloat(salaryAsAString);
			
			//put the salary in the array
			myArray[loop] = salary;
			
		}//end of loop
		output = "The salaries in the array are \n" ;
		for(int loop = 0; loop < myArray.length; loop++) {
			tempSalary = myArray[loop];
			tempTax = tempSalary *TAX_RATE;
			output = output + "for salary "+tempSalary + " tax = " + tempTax + "\n" ;
			
		}
		
		JOptionPane.showMessageDialog(null, output);

	}

}
