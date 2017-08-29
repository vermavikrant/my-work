package heap;

import java.util.Arrays;

public class MaxHeapSort {

	private static void heapify(int numIndex, int[] inputList, int inputListLastIndex) {
		
		boolean rightChildExist = true;
		
		if (2*numIndex+2 > inputListLastIndex)
			 rightChildExist = false;
			 
		if (rightChildExist==false && 2*numIndex+1 > inputListLastIndex) {
			//System.out.println("No need to heapify " + inputList[numIndex] + " at index " + numIndex);
			return;
		}
		
		int maxChildIndex;
		
		if (rightChildExist) {
			if (inputList[2*numIndex+1] > inputList[2*numIndex+2]) 
				maxChildIndex = 2*numIndex+1;
			else 
				maxChildIndex = 2*numIndex+2;
		}
		else
			maxChildIndex = 2*numIndex+1;
		
		if (inputList[numIndex] < inputList[maxChildIndex]) {
			int tmp = inputList[numIndex];
			inputList[numIndex] = inputList[maxChildIndex];
			inputList[maxChildIndex] = tmp;
			heapify(maxChildIndex, inputList, inputListLastIndex);
		}
	
	}

	private static int[] buildMaxHeap(int[] inputList) {
	
		for (int i=inputList.length-1; i>=0; i--) {
			heapify(i, inputList, inputList.length-1);
		}
		return inputList;
	}
	
	public static int[] maxHeapSort(int[] inputList) {
		
		int[] unsortedMaxHeap = buildMaxHeap(inputList);
		//System.out.println("unsortedMaxHeap=" + Arrays.toString(unsortedMaxHeap));
		
		for (int i=unsortedMaxHeap.length-1;i>0; i--) { //last loop (i==0) is only 1 element, hence no need to heapify
			int tmp = unsortedMaxHeap[0];
			unsortedMaxHeap[0] = unsortedMaxHeap[i];
			unsortedMaxHeap[i] = tmp;
			heapify(0, unsortedMaxHeap, i-1);
		}
		return unsortedMaxHeap; //this is sorted
	} 
	
	public static void main(String[] args) {
		int[] inputList = new int[] {10,4,3,9,7,1,14,4,2,11,6,8,16,8};
		System.out.println("inputList=" + Arrays.toString(inputList));
		System.out.println("inputList.length=" + inputList.length);

		int[] sortedList = maxHeapSort(inputList);
		System.out.println("sortedList=" + Arrays.toString(sortedList));
		
	}

}
