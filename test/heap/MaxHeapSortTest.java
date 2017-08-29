package heap;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MaxHeapSortTest {

	@Test
	public void testEmptyList() {
		int[] inputList = new int[] {};
		int[] sortedList = new int[] {};
		assertEquals(sortedList.length, inputList.length);
		assertEquals(Arrays.toString(sortedList), Arrays.toString(MaxHeapSort.maxHeapSort(inputList)));
		assertEquals(sortedList.length, inputList.length);
	}
	
	@Test
	public void testSortOnEvenList() {
		int[] inputList = new int[] {10,4,3,9,7,1,14,4,2,11,6,8,16,8};
		int[] sortedList = new int[] {1, 2, 3, 4, 4, 6, 7, 8, 8, 9, 10, 11, 14, 16};
		assertEquals(sortedList.length, inputList.length);
		assertEquals(Arrays.toString(sortedList), Arrays.toString(MaxHeapSort.maxHeapSort(inputList)));
		assertEquals(sortedList.length, inputList.length);
	}
	
	@Test
	public void testSortOnOddist() {
		int[] inputList = new int[] {10,4,3,9,7,1,14,4,2,11,6,8,16,};
		int[] sortedList = new int[] {1, 2, 3, 4, 4, 6, 7, 8, 9, 10, 11, 14, 16};
		assertEquals(sortedList.length, inputList.length);
		assertEquals(Arrays.toString(sortedList), Arrays.toString(MaxHeapSort.maxHeapSort(inputList)));
		assertEquals(sortedList.length, inputList.length);
	}
}
