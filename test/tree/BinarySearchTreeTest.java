package tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void testWithArraySizeOne() {
		int[] inputList = new int[] {1};
		assertEquals(-1, BinarySearchTree.findFirstIndexUsingDivideAndConquer(0, inputList));
		assertEquals(-1, BinarySearchTree.findLastIndexUsingDivideAndConquer(0, inputList));
		assertEquals(-1, BinarySearchTree.countOccurence(0, inputList));
		
		assertEquals(0, BinarySearchTree.findFirstIndexUsingDivideAndConquer(1, inputList));
		assertEquals(0, BinarySearchTree.findLastIndexUsingDivideAndConquer(1, inputList));
		assertEquals(1, BinarySearchTree.countOccurence(1, inputList));
		
	}
	
	@Test
	public void testWithArraySizeEven() {
		int[] inputList = new int[] {1,2,3,4};
		assertEquals(-1, BinarySearchTree.findFirstIndexUsingDivideAndConquer(0, inputList));
		assertEquals(-1, BinarySearchTree.findLastIndexUsingDivideAndConquer(0, inputList));
		assertEquals(-1, BinarySearchTree.countOccurence(0, inputList));
		
		assertEquals(1, BinarySearchTree.findFirstIndexUsingDivideAndConquer(2, inputList));
		assertEquals(1, BinarySearchTree.findLastIndexUsingDivideAndConquer(2, inputList));
		assertEquals(1, BinarySearchTree.countOccurence(2, inputList));
		
		assertEquals(2, BinarySearchTree.findFirstIndexUsingDivideAndConquer(3, inputList));
		assertEquals(2, BinarySearchTree.findLastIndexUsingDivideAndConquer(3, inputList));
		assertEquals(1, BinarySearchTree.countOccurence(3, inputList));
		
	}
	
	@Test
	public void testWithArraySizeOdd() {
		int[] inputList = new int[] {1,2,3,4,5};
		assertEquals(-1, BinarySearchTree.findFirstIndexUsingDivideAndConquer(0, inputList));
		assertEquals(-1, BinarySearchTree.findLastIndexUsingDivideAndConquer(0, inputList));
		assertEquals(-1, BinarySearchTree.countOccurence(0, inputList));
		
		assertEquals(1, BinarySearchTree.findFirstIndexUsingDivideAndConquer(2, inputList));
		assertEquals(1, BinarySearchTree.findLastIndexUsingDivideAndConquer(2, inputList));
		assertEquals(1, BinarySearchTree.countOccurence(2, inputList));
		
		assertEquals(2, BinarySearchTree.findFirstIndexUsingDivideAndConquer(3, inputList));
		assertEquals(2, BinarySearchTree.findLastIndexUsingDivideAndConquer(3, inputList));
		assertEquals(1, BinarySearchTree.countOccurence(3, inputList));
		
		assertEquals(3, BinarySearchTree.findFirstIndexUsingDivideAndConquer(4, inputList));
		assertEquals(3, BinarySearchTree.findLastIndexUsingDivideAndConquer(4, inputList));
		assertEquals(1, BinarySearchTree.countOccurence(4, inputList));
		
	}
	
	@Test
	public void testCountOccurences() {
		int[] inputList = new int[] {1,2,3,4,4,4,4,5,6};
		assertEquals(-1, BinarySearchTree.countOccurence(0, inputList));
		
		assertEquals(1, BinarySearchTree.countOccurence(1, inputList));
		assertEquals(4, BinarySearchTree.countOccurence(4, inputList));
		assertEquals(1, BinarySearchTree.countOccurence(6, inputList));
		
	}
	
}
