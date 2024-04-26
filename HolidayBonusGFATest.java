/*
 * Class: CMSC203 CRN 30340
 * Instructor: Khandan Monshi
 * Description: Defines the HolidayBonusGFATest.
 * Due: 04/23/2024
 * Platform/compiler: Java Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: Jeffrey Chu
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a HolidayBonus object.
 * 
 * @author Farnaz Eivazi
 * @version 7/13/2022
 * 
 */
public class HolidayBonusGFATest {
	
	private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			
			assertEquals(3000.0, result[0], 0.001);
			assertEquals(4000.0, result[1], 0.001);
			assertEquals(15000.0, result[2], 0.001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
	}
	
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), 0.001);
	}
	
}