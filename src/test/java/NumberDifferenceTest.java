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


}
