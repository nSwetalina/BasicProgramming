/******************************************************************************
 *  
 *  Purpose: Determines whether year is leap year or not. 
 *
 *  @author  Swetalina
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	 /*
	  * The main function is written to test LeapYear class
	  */
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a year");
		// Method 1 - using static function of Utility
		int year=utility.readInteger();
	    // print out whether year is leap year
		utility.leapYear(year);

	}

}
