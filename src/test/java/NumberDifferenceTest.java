package program.NumberDifference;

import java.util.ArrayList;
import java.util.Arrays;

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
        /* TC 1 - 7 */
        
        // TC 1 : Nilai N berada di luar range melebihi batas atas 
        // PIC : Andika Yudha Riyanto
        /* Data Uji
           N = 11 
        */ 
        
	@Test
	public void testInputNBilLuarRange_Upper() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		boolean actual, expected;
		jumlahDeretBil = 11; // bukan berada pada range 1-10
		expected = false;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
        
	// TC 2 : Nilai N berada di luar range  batas bawah 
        // PIC : Andika Yudha Riyanto
        /* Data Uji
           N = 0 
        */ 
	@Test
	public void testInputNBilLuarRange_Lower() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		boolean actual, expected;
		jumlahDeretBil = 0; // bukan berada pada range 1-10
		expected = false;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
           
        // TC 3 : Nilai N berada di luar range bernilai negatif 
        // PIC : Andika Yudha Riyanto
        /* Data Uji
           N = -1
        
        */
	@Test
	public void testInputNBilLuarRange_Negatif() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		boolean actual, expected;
		jumlahDeretBil = -1; // bukan berada pada range 1-10
		expected = false;
		
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
        
        // TC 4 : Non Group, No Difference, 1x loop 
        // PIC : Andika Yudha Riyanto
        /* Data Uji
           N = 2
           Deret = 5 5 
        */
	@Test
	public void testInputNonGroup1Loop() {
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(5, 5));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 5 : Non Group, No Difference, No loop 
        // PIC : Andika Yudha Riyanto
        /* Data Uji
           N = 1
           Deret = 5  
        */
	@Test
	public void testInputNonGroupNoLoop() {
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(5));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 6 : Non Group, No Difference, 2x loop 
        // PIC : Andika Yudha Riyanto
        /* Data Uji
           N = 3
           Deret = 5 5 5  
        */
	@Test
	public void testInputNonGroup2Loop() {
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(5, 5, 5));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 7 : Non Group, No Difference, 5x loop 
        // PIC : Andika Yudha Riyanto
        /* Data Uji
           N = 6
           Deret = 5 5 5 5 5 5 
        */
	@Test
	public void testInputNonGroup5Loop() {
            ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5, 5));
            
            // Expected Result
            String expectedMessage = "Difference : 0\nNon Group, There's no difference";
            Integer expectedDifference = 0;
            
            // Exercise Test
            Integer actualDifference = sut.numberDiffirenceProcess(testData);
            String actualMessage = sut.groupingDifference(actualDifference);
            
            // Verify Test
            assertEquals(expectedDifference, actualDifference);
            assertEquals(expectedMessage, actualMessage);
	}

//        //Test Case 8 Path 3 
//        //Inputkan 2 angka membentuk group 3
//        //PIC : Giusty Fadh Wiranapoera
//        /*Test Data
//            N = 2
//            Number = 1 55
//        */
        @Test
	public void testGroup3_1loop() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 55));
		
                // Expected Result
                String expectedMessage = "Difference : 54\nGroup 3, Large Difference";
                Integer expectedDifference = 54;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 9 Path 3 
        //Inputkan 2 angka membentuk group 3 dibatas bawah range group 3 (51)
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 2
            Number = 1 52
        */
        @Test
	public void testGroup3MinRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 52));
		
                // Expected Result
                String expectedMessage = "Difference : 51\nGroup 3, Large Difference";
                Integer expectedDifference = 51;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}   
        
        //Test Case 10 Path 3-1
        //Inputkan 3 angka membentuk group 3
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 3
            Number = 1 1 55
        */
        @Test
	public void testGroup3_2loop() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 1, 55));
		
                // Expected Result
                String expectedMessage = "Difference : 54\nGroup 3, Large Difference";
                Integer expectedDifference = 54;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 11 Path 3-2
        //Inputkan 6 angka membentuk group 3
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 6
            Number = 1 1 1 1 1 55
        */
        @Test
	public void testGroup3_5loop() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 55));
		
                // Expected Result
                String expectedMessage = "Difference : 54\nGroup 3, Large Difference";
                Integer expectedDifference = 54;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 12 Path 4
        //Inputkan 2 angka membentuk group 2
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 2
            Number = 1 25
        */
        @Test
	public void testGroup2_1loop() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 25));
		
                // Expected Result
                String expectedMessage = "Difference : 24\nGroup 2, Medium Difference";
                Integer expectedDifference = 24;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        //Test Case 13 Path 4
        //Inputkan 2 angka membentuk group 2 dibatas atas range group 2 (50)
        //PIC : Giusty Fadh Wiranapoera
        /*Test Data
            N = 2
            Number = 1 51
        */
        @Test
	public void testGroup2MaxRange() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1, 51));
		
                // Expected Result
                String expectedMessage = "Difference : 50\nGroup 2, Medium Difference";
                Integer expectedDifference = 50;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}      
        
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
        
        /* TC 15 - TC21 */
        
        // TC 15     : Group 2, Medium DIfference, 2x loop
        // PIC       : Mohammad Rizky Maulidhan
        /* Test Data :
            N = 3
            Number Series = 1 1 25
        */
        @Test
	public void testDifferenceGroup2_2xloop() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1,1,25));
		
                // Expected Result
                String expectedMessage = "Difference : 24\nGroup 2, Medium Difference";
                Integer expectedDifference = 24;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 16     : Group 2, Medium DIfference, 5x loop
        // PIC       : Mohammad Rizky Maulidhan
        /* Test Data :
            N = 6
            Number Series = 1 1 1 1 1 25
        */
        @Test
	public void testDifferenceGroup2_5xloop() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1,1,1,1,1,25));
		
                // Expected Result
                String expectedMessage = "Difference : 24\nGroup 2, Medium Difference";
                Integer expectedDifference = 24;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 17     : Group 1, Small DIfference, 1x loop
        // PIC       : Mohammad Rizky Maulidhan
        /* Test Data :
            N = 2
            Number Series = 1 5
        */
        @Test
	public void testDifferenceGroup1_1xloop() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1,5));
		
                // Expected Result
                String expectedMessage = "Difference : 4\nGroup 1, Small Difference";
                Integer expectedDifference = 4;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 18     : Group 1, Small DIfference, 1x loop, Batas atas (10)
        // PIC       : Mohammad Rizky Maulidhan
        /* Test Data :
            N = 2
            Number Series = 1 11
        */
        @Test
	public void testDifferenceGroup1_1xloop_Upper() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1,11));
		
                // Expected Result
                String expectedMessage = "Difference : 10\nGroup 1, Small Difference";
                Integer expectedDifference = 10;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 19     : Group 1, Small DIfference, 1x loop, Batas bawah (1)
        // PIC       : Mohammad Rizky Maulidhan
        /* Test Data :
            N = 2
            Number Series = 1 2
        */
        @Test
	public void testDifferenceGroup1_1xloop_Lower() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1,2));
		
                // Expected Result
                String expectedMessage = "Difference : 1\nGroup 1, Small Difference";
                Integer expectedDifference = 1;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 20     : Group 1, Small DIfference, 2x loop
        // PIC       : Mohammad Rizky Maulidhan
        /* Test Data :
            N = 3
            Number Series = 1 1 5
        */
        @Test
	public void testDifferenceGroup1_2xloop() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1,1,5));
		
                // Expected Result
                String expectedMessage = "Difference : 4\nGroup 1, Small Difference";
                Integer expectedDifference = 4;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
        
        // TC 21     : Group 1, Small DIfference, 5x loop
        // PIC       : Mohammad Rizky Maulidhan
        /* Test Data :
            N = 6
            Number Series = 1 1 1 1 1 5
        */
        @Test
	public void testDifferenceGroup1_5xloop() {
		// (1) setup (arrange, build)
                ArrayList<Integer> testData = new ArrayList<>(Arrays.asList(1,1,1,1,1,5));
		
                // Expected Result
                String expectedMessage = "Difference : 4\nGroup 1, Small Difference";
                Integer expectedDifference = 4;
                
                // Exercise
                Integer actualDifference = sut.numberDiffirenceProcess(testData);
                String actualMessage = sut.groupingDifference(actualDifference);
                		
		// Verify Test
                assertEquals(expectedDifference, actualDifference);
                assertEquals(expectedMessage, actualMessage);
	}
}
