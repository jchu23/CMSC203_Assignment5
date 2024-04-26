/*
 * Class: CMSC203 CRN 30340
 * Instructor: Khandan Monshi
 * Description: The JUnit test file for TwoDimRaggedArrayUtility.
 * Due: 04/25/2024
 * Platform/compiler: Java Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: Jeffrey Chu
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilityTestStudent {
	
	private double[][] data;
	
	@Before
	public void setUp() {
		data = new double[][]{
			{1.0, 2.0, 3.0},
			{2.0, 3.0},
			{3.0}
		};
	}
	
	@Test
	public void testGetTotal() {
		double expectedTotal = 14.0;
		double actualTotal = TwoDimRaggedArrayUtility.getTotal(data);
		
		assertEquals(expectedTotal, actualTotal, 0.01);
	}
	
	@Test
	public void testgetAverage() {
		double expectedAverage = (double) (14.0 / 6.0);
		double actualAverage = TwoDimRaggedArrayUtility.getAverage(data);
		
		assertEquals(expectedAverage, actualAverage, 0.01);
	}
	
	@Test
	public void testGetRowTotal() {
		double expectedRowTotal = 6.0;
		double actualRowTotal = TwoDimRaggedArrayUtility.getRowTotal(data, 0);
		
		assertEquals(expectedRowTotal, actualRowTotal, 0.01);
	}
	
	@Test
	public void testGetColumnTotal() {
		double expectedColumnTotal = 6.0; 
		double actualColumnTotal = TwoDimRaggedArrayUtility.getColumnTotal(data, 0);
		
		assertEquals(expectedColumnTotal, actualColumnTotal, 0.01);
	}
	
	@Test
	public void testGetHighestInRow() {
		double expectedHighestInRow = 3.0; 
		double actualHighestInRow = TwoDimRaggedArrayUtility.getHighestInRow(data, 0);
		
		assertEquals(expectedHighestInRow, actualHighestInRow, 0.01);
	}
	
	@Test
	public void testGetHighestInRowIndex() {
		int expectedHighestInRowIndex = 2; 
		int actualHighestInRowIndex = TwoDimRaggedArrayUtility.getHighestInRowIndex(data, 0);
		
		assertEquals(expectedHighestInRowIndex, actualHighestInRowIndex, 0.01);
	}
	
	@Test
	public void testGetLowestInRow() {
		double expectedLowestInRow = 1.0; 
		double actualLowestInRow = TwoDimRaggedArrayUtility.getLowestInRow(data, 0);
		
		assertEquals(expectedLowestInRow, actualLowestInRow, 0.01);
	}
	
	@Test
	public void testGetLowestInRowIndex() {
		int expectedLowestInRowIndex = 0; 
		int actualLowestInRowIndex = TwoDimRaggedArrayUtility.getLowestInRowIndex(data, 0);
		
		assertEquals(expectedLowestInRowIndex, actualLowestInRowIndex, 0.01);
	}
	
	@Test
	public void testGetHighestInColumn() {
		double expectedHighestInColumn = 3.0; 
		double actualHighestInColumn = TwoDimRaggedArrayUtility.getHighestInColumn(data, 0);
		
		assertEquals(expectedHighestInColumn, actualHighestInColumn, 0.01);
	}
	
	@Test
	public void testGetHighestInColumnIndex() {
		int expectedHighestInColumnIndex = 2; 
		int actualHighestInColumnIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, 0);
		
		assertEquals(expectedHighestInColumnIndex, actualHighestInColumnIndex, 0.01);
	}
	
	@Test
	public void testGetLowestInColumn() {
		double expectedLowestInColumn = 1.0; 
		double actualLowestInColumn = TwoDimRaggedArrayUtility.getLowestInColumn(data, 0);
		
		assertEquals(expectedLowestInColumn, actualLowestInColumn, 0.01);
	}
	
	@Test
	public void testGetLowestInColumnIndex() {
		int expectedLowestInColumnIndex = 0; 
		int actualLowestInColumnIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, 0);
		
		assertEquals(expectedLowestInColumnIndex, actualLowestInColumnIndex, 0.01);
	}
	
	@Test
	public void testGetHighestInArray() {
		double expectedHighestInArray = 3.0; 
		double actualHighestInArray = TwoDimRaggedArrayUtility.getHighestInArray(data);
		
		assertEquals(expectedHighestInArray, actualHighestInArray, 0.01);
	}
	
	@Test
	public void testGetLowestInArray() {
		double expectedLowestInArray = 1.0; 
		double actualLowestInArray = TwoDimRaggedArrayUtility.getLowestInArray(data);
		
		assertEquals(expectedLowestInArray, actualLowestInArray, 0.01);
	}
	
}