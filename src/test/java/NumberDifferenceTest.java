package program.NumberDifference;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class NumberDifferenceTest {
	private CalcNUmberDifference sut;
	
	/**
	 * Setup = inisiasi sebelum test dijalankan, preparation object
	 * --> pay attention to keep components and test cases small, 
	 * --> the trade-off seems acceptable. 
	 * --> implicit setup can be used to deine the fixture common for all tests. 
	 * --> Small in-line and delegate setup statements may supplement .. 
	 *     the speciic preconditions on per-test basis. 
	 * */
	@Before
	public void setUp() throws Exception {
		sut = new CalcNUmberDifference();
	}
        
//        //Test Case 8 Path 3 
//        //Inputkan 2 angka membentuk group 3
//        //PIC : Giusty Fadh Wiranapoera
//        /*Test Data
//            N = 2
//            Number = 1 55
//        */
//        @Test
//	public void testGroup3_1loop() {
//		// (1) setup (arrange, build)
//                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 55));
//		
//                // Expected Result
//                String expectedMessage = "Difference : 54\nGroup 3, Large Difference";
//                Integer expectedDifference = 54;
//                
//                // Exercise
//                Integer actualDifference = sut.numberDiffirenceProcess(testData);
//                String actualMessage = sut.groupingDifference(actualDifference);
//                		
//		// Verify Test
//                assertEquals(expectedDifference, actualDifference);
//                assertEquals(expectedMessage, actualMessage);
//	}
//        
        //Test Case 9 Path 3 
        //Inputkan 2 angka membentuk group 3 dibatas bawah range group 3 (51)
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 2
            Number = 1 52
        */
//        @Test
//	public void testGroup3MinRange() {
//		// (1) setup (arrange, build)
//                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 52));
//		
//                // Expected Result
//                String expectedMessage = "Difference : 51\nGroup 3, Large Difference";
//                Integer expectedDifference = 51;
//                
//                // Exercise
//                Integer actualDifference = sut.numberDiffirenceProcess(testData);
//                String actualMessage = sut.groupingDifference(actualDifference);
//                		
//		// Verify Test
//                assertEquals(expectedDifference, actualDifference);
//                assertEquals(expectedMessage, actualMessage);
//	}   
        
        //Test Case 10 Path 3-1
        //Inputkan 3 angka membentuk group 3
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 3
            Number = 1 1 55
        */
//        @Test
//	public void testGroup3_2loop() {
//		// (1) setup (arrange, build)
//                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 1, 55));
//		
//                // Expected Result
//                String expectedMessage = "Difference : 54\nGroup 3, Large Difference";
//                Integer expectedDifference = 54;
//                
//                // Exercise
//                Integer actualDifference = sut.numberDiffirenceProcess(testData);
//                String actualMessage = sut.groupingDifference(actualDifference);
//                		
//		// Verify Test
//                assertEquals(expectedDifference, actualDifference);
//                assertEquals(expectedMessage, actualMessage);
//	}
        
        //Test Case 11 Path 3-2
        //Inputkan 6 angka membentuk group 3
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 6
            Number = 1 1 1 1 1 55
        */
//        @Test
//	public void testGroup3_5loop() {
//		// (1) setup (arrange, build)
//                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 55));
//		
//                // Expected Result
//                String expectedMessage = "Difference : 54\nGroup 3, Large Difference";
//                Integer expectedDifference = 54;
//                
//                // Exercise
//                Integer actualDifference = sut.numberDiffirenceProcess(testData);
//                String actualMessage = sut.groupingDifference(actualDifference);
//                		
//		// Verify Test
//                assertEquals(expectedDifference, actualDifference);
//                assertEquals(expectedMessage, actualMessage);
//	}
        
        //Test Case 12 Path 4
        //Inputkan 2 angka membentuk group 2
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 2
            Number = 1 25
        */
//        @Test
//	public void testGroup2_1loop() {
//		// (1) setup (arrange, build)
//                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 25));
//		
//                // Expected Result
//                String expectedMessage = "Difference : 24\nGroup 2, Medium Difference";
//                Integer expectedDifference = 24;
//                
//                // Exercise
//                Integer actualDifference = sut.numberDiffirenceProcess(testData);
//                String actualMessage = sut.groupingDifference(actualDifference);
//                		
//		// Verify Test
//                assertEquals(expectedDifference, actualDifference);
//                assertEquals(expectedMessage, actualMessage);
//	}
        
        //Test Case 13 Path 4
        //Inputkan 2 angka membentuk group 2 dibatas atas range group 2 (50)
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 2
            Number = 1 51
        */
//        @Test
//	public void testGroup2MaxRange() {
//		// (1) setup (arrange, build)
//                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 51));
//		
//                // Expected Result
//                String expectedMessage = "Difference : 50\nGroup 2, Medium Difference";
//                Integer expectedDifference = 50;
//                
//                // Exercise
//                Integer actualDifference = sut.numberDiffirenceProcess(testData);
//                String actualMessage = sut.groupingDifference(actualDifference);
//                		
//		// Verify Test
//                assertEquals(expectedDifference, actualDifference);
//                assertEquals(expectedMessage, actualMessage);
//	}      
        
        //Test Case 14 Path 4
        //Inputkan 2 angka membentuk group 2 dibatas bawah range group 2 (11)
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 2
            Number = 1 12
        */
        @Test
	public void testGroup2MinRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 12));
		
                // Expected Result
                String expectedMessage = "Difference : 11\nGroup 2, Medium Difference";
                Integer expectedDifference = 11;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}   
        
}
