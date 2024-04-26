/*
 * Class: CMSC203 CRN 30340
 * Instructor: Khandan Monshi
 * Description: Defines the HolidayBonus class and the calculateHolidayBonus and calculateTotalHolidayBonus classes.
 * Due: 04/25/2024
 * Platform/compiler: Java Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: Jeffrey Chu
 */

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HolidayBonus {
	
	private static final int HIGHESTSALESBONUS = 5000;
	private static final int LOWESTSALESBONUS = 1000;
	private static final int OTHERSALESBONUS = 2000;
	
	public HolidayBonus() {
		
	}
	
	/**
	 * Calculates the holiday bonus for each store
	 * @param data
	 * @return an array of the bonus for each store
	 */
	public static double[] calculateHolidayBonus(double[][] data) {
		double[] holidayBonuses = new double[data.length];
		
		int maxCols = 0;
		
		for (double[] row : data) {
			if (row.length > maxCols) {
				maxCols = row.length;
			}
		}
		
		for (int col = 0; col < maxCols; col++) {
			double highest = Double.NEGATIVE_INFINITY;
			double lowest = Double.POSITIVE_INFINITY;
			int highestStoreIndex = -1;
			int lowestStoreIndex = -1;
			int positiveSalesCount = 0;
			
			for (int row = 0; row < data.length; row++) {
				if (col < data[row].length) {
					if (data[row][col] > 0) {
						positiveSalesCount++;
						
						if (data[row][col] > highest) {
							highest = data[row][col];
							highestStoreIndex = row;
						}
						
						if (data[row][col] < lowest) {
							lowest = data[row][col];
							lowestStoreIndex = row;
						}
					}
				}
			}
			
			for (int row = 0; row < data.length; row++) {
				if (col < data[row].length && data[row][col] > 0) {
					if (row == highestStoreIndex) {
						holidayBonuses[row] += HIGHESTSALESBONUS;
					} else if (row == lowestStoreIndex && positiveSalesCount > 1) {
						holidayBonuses[row] += LOWESTSALESBONUS;
					} else {
						holidayBonuses[row] += OTHERSALESBONUS;
					}
				}
			}
		}
		
		return holidayBonuses;
	}
	
	/**
	 * Calculates the total holiday bonuses
	 * @param data
	 * @return the total of all holiday bonuses
	 */
	public static double calculateTotalHolidayBonus(double[][] data) {
		double[] holidayBonuses = calculateHolidayBonus(data);
		double total = 0.0;
		
		for (int i = 0; i < holidayBonuses.length; i++) {
			total += holidayBonuses[i];
		}
		
		return total;
	}
	
}