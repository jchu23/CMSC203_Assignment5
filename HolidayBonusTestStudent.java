/*
 * Class: CMSC203 CRN 30340
 * Instructor: Khandan Monshi
 * Description: The JUnit test file for HolidayBonus.
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

public class HolidayBonusTestStudent {
	
	private double[][] salesData;
	
	@Before
	public void setUp() {
		salesData = new double[][] {
			{1000.0, 2000.0},
			{3000.0, 1000.0},
			{2000.0, 3000.0}
		};
	}
	
	@Test
	public void testCalculateHolidayBonusLength() {
		double[] holidayBonuses = HolidayBonus.calculateHolidayBonus(salesData);
		assertEquals(salesData.length, holidayBonuses.length);
	}
	
	@Test
	public void testCalculateTotalHolidayBonus() {
		double actualTotal = HolidayBonus.calculateTotalHolidayBonus(salesData);
		assertTrue(actualTotal > 0);
	}

}