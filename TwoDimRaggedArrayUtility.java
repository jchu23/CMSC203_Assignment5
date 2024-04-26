/*
 * Class: CMSC203 CRN 30340
 * Instructor: Khandan Monshi
 * Description: Defines the TwoDimRaggedArrayUtility class and the readFile, 
 * writeToFile, getTotal, getAverage, getRowTotal, getColumnTotal, getHighestInRow, 
 * getHighestInRowIndex, getLowestInRow, getLowestInRowIndex, getHighestInColumn, 
 * getHighestInColumnIndex, getLowestInColumn, getLowestInColumnIndex, 
 * getHighestInArray, and getLowestInArray methods.
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

public class TwoDimRaggedArrayUtility {
	
	public TwoDimRaggedArrayUtility() {
		
	}
	
	/**
	 * Reads from a file and returns a ragged array of doubles The maximum rows is 10 and the maximum columns for each row is 10 Each row in the file is separated by a new line Each element in the row is separated by a space Suggestion: You need to know how many rows and how many columns there are for each row to create a ragged array.
	 * @param file
	 * @return a two dimensional ragged (depending on data) array of doubles if the file is not empty, returns a null if file is empty
	 * @throws FileNotFoundException
	 */
//	@SuppressWarnings("all")
	public static double[][] readFile(File file) throws FileNotFoundException {
		file.getParentFile().mkdirs();
		PrintWriter pw = new PrintWriter(file.getName());
		Scanner scan = new Scanner(file);
		
		String[][] data = new String[10][10];
		int rows = 0;
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				while (scan.hasNextLine()) {
					data[row][col] = scan.nextLine();
				}
			}
			
			rows++;
		}
		
		double[][]array = new double[rows][];
		
		pw.close();
		scan.close();
		
		return array;
	}
	
	/**
	 * Writes the ragged array of doubles into the file. Each row is on a separate line within the file and each double is separated by a space.
	 * @param data
	 * @param file
	 * @throws FileNotFoundException
	 */
	public static void writeToFile(double[][] data, File file) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(file.getName());
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				pw.print(data[row][col]);
				
				if (col + 1 < data[row].length) {
					pw.print(" ");
				}
			}
			
			pw.println();
		}
	}
	
	/**
	 * Returns the total of all the elements of the two dimensional array
	 * @param data
	 * @return the sum of all the elements in the two dimensional array
	 */
	public static double getTotal(double[][] data) {
		double total = 0.0;
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
			}
		}
		
		return total;
	}
	
	/**
	 * Returns the average of the elements in the two dimensional array
	 * @param data
	 * @return the average of the elements in the two dimensional array (total of elements/number of elements)
	 */
	public static double getAverage(double[][] data) {
		double total = 0.0;
		int elements = 0;
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				total += data[row][col];
				elements++;
			}
		}
		
		double average = total / elements;
		
		return average;
	}
	
	/**
	 * Returns the total of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data
	 * @param row
	 * @return the total of the row
	 */
	public static double getRowTotal(double[][] data, int row) {
		double rowTotal = 0.0;
		
		for (int col = 0; col < data[row].length; col++) {
			rowTotal += data[row][col];
		}
		
		return rowTotal;
	}
	
	/**
	 * Returns the total of the selected column in the two dimensional array index 0 refers to the first column. If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data
	 * @param col
	 * @return the total of the column
	 */
	public static double getColumnTotal(double[][] data, int col) {
		double colTotal = 0.0;
		
		for (int row = 0; row < data.length; row++) {
			colTotal += data[row][col];
		}
		
		return colTotal;
	}
	
	/**
	 * Returns the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data
	 * @param row
	 * @return the largest element of the row
	 */
	public static double getHighestInRow(double[][] data, int row) {
		double highestInRow = data[0][0];
		
		for (int col = 0; col < data[row].length; col++) {
			if(data[row][col] > highestInRow) {
				highestInRow = data[row][col];
			}
		}
		
		return highestInRow;
	}
	
	/**
	 * Returns the index of the largest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data
	 * @param row
	 * @return the largest element of the row
	 */
	public static int getHighestInRowIndex(double[][] data, int row) {
		double highestInRow = data[0][0];
		int highestInRowIndex = 0;
		
		for (int col = 0; col < data[row].length; col++) {
			if(data[row][col] > highestInRow) {
				highestInRow = data[row][col];
				highestInRowIndex = col;
			}
		}
		
		return highestInRowIndex;
	}
	
	/**
	 * Returns the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data
	 * @param row
	 * @return the smallest element of the row
	 */
	public static double getLowestInRow(double[][] data, int row) {
		double lowestInRow = data[0][0];
		
		for (int col = 0; col < data[row].length; col++) {
			if(data[row][col] < lowestInRow) {
				lowestInRow = data[row][col];
			}
		}
		
		return lowestInRow;
	}
	
	/**
	 * Returns the index of the smallest element of the selected row in the two dimensional array index 0 refers to the first row.
	 * @param data
	 * @param row
	 * @return the index of the smallest element of the row
	 */
	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowestInRow = data[0][0];
		int lowestInRowIndex = 0;
		
		for (int col = 0; col < data[row].length; col++) {
			if(data[row][col] < lowestInRow) {
				lowestInRow = data[row][col];
				lowestInRowIndex = col;
			}
		}
		
		return lowestInRowIndex;
	}
	
	/**
	 * Returns the largest element of the selected column in the two dimensional array index 0 refers to the first column. If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data
	 * @param col
	 * @return the largest element of the column
	 */
	public static double getHighestInColumn(double[][] data, int col) {
		double highestInCol = data[0][0];
		
		for (int row = 0; row < data.length; row++) {
			if(data[row][col] > highestInCol) {
				highestInCol = data[row][col];
			}
		}
		
		return highestInCol;
	}
	
	/**
	 * Returns index of the largest element of the selected column in the two dimensional array index 0 refers to the first column. If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data
	 * @param col
	 * @return the index of the largest element of the column
	 */
	public static int getHighestInColumnIndex(double[][] data, int col) {
		double highestInCol = data[0][0];
		int highestInColIndex = 0;
		
		for (int row = 0; row < data.length; row++) {
			if(data[row][col] > highestInCol) {
				highestInCol = data[row][col];
				highestInColIndex = row;
			}
		}
		
		return highestInColIndex;
	}
	
	/**
	 * Returns the smallest element of the selected column in the two dimensional array index 0 refers to the first column. If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data
	 * @param col
	 * @return the smallest element of the column
	 */
	public static double getLowestInColumn(double[][] data, int col) {
		double lowestInCol = data[0][0];
		
		for (int row = 0; row < data.length; row++) {
			if(data[row][col] < lowestInCol) {
				lowestInCol = data[row][col];
			}
		}
		
		return lowestInCol;
	}
	
	/**
	 * Returns the index of the smallest element of the selected column in the two dimensional array index 0 refers to the first column. If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * @param data
	 * @param col
	 * @return the index of the smallest element of the column
	 */
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowestInCol = data[0][0];
		int lowestInColIndex = 0;
		
		for (int row = 0; row < data.length; row++) {
			if(data[row][col] < lowestInCol) {
				lowestInCol = data[row][col];
				lowestInColIndex = row;
			}
		}
		
		return lowestInColIndex;
	}
	
	/**
	 * Returns the largest element in the two dimensional array
	 * @param data
	 * @return the largest element in the two dimensional array
	 */
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if(data[row][col] > highest) {
					highest = data[row][col];
				}
			}
		}
		
		return highest;
	}
	
	/**
	 * Returns the smallest element in the two dimensional array
	 * @param data
	 * @return the smallest element in the two dimensional array
	 */
	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if(data[row][col] < lowest) {
					lowest = data[row][col];
				}
			}
		}
		
		return lowest;
	}
	
}