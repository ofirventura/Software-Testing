package tau.ex1;

import static org.junit.Assert.*;
import org.junit.Test;
import tau.ex1.Count;

public class AllTests {
	
	@Test
	public void countTest_NodeCoverage(){
		// Arrange
		int[] numbers = new int[4];
		numbers[0] = numbers[2] = numbers[3] = -1;
		numbers[1] = 0;
		
		// Act
		int result = Count.count(numbers);
		
		// Assert
		assertEquals(1, result);
	}

	@Test
	public void countTest_EdgeCoverage(){
		// Arrange
		int[] numbers = new int[2];
		numbers[0] = numbers[1] = 0;
		
		// Act
		int result = Count.count(numbers);
		
		// Assert
		assertEquals(2, result);
	}
	
	@Test
	public void countTest_AllUses(){
		// Arrange
		int[] numbers = new int[0];
		
		// Act
		int result = Count.count(numbers);
		
		// Assert
		assertEquals(0, result);
	}
	
	@Test
	public void countTest_PrimePath(){
		// Arrange
		int[] numbers = new int[1];
		numbers[0] = -1;
		
		// Act
		int result = Count.count(numbers);
		
		// Assert
		assertEquals(0, result);
	}
	
}
