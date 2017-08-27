package tree;

import java.util.Arrays;

public class BinarySearchTree {

	public static int findFirstIndexUsingDivideAndConquer(int numToFind, int[] inputList) {
		return findFirstIndexUsingDivideAndConquer(numToFind, inputList, 0, inputList.length-1);
	}
	
	private static int findFirstIndexUsingDivideAndConquer(int numToFind, int[] inputList, int firstIndex, int lastIndex) {
		
		if (firstIndex==lastIndex) {
			if (numToFind == inputList[firstIndex]) 
				return firstIndex;
			else
				return -1;
		}
		
		int mid = (firstIndex + lastIndex) / 2;
		
		if (numToFind <= inputList[mid]) {
			return findFirstIndexUsingDivideAndConquer(numToFind, inputList, firstIndex, mid);
		}
		else {
			return findFirstIndexUsingDivideAndConquer(numToFind, inputList, mid+1, lastIndex);
		}
	
	}
	
	public static int findLastIndexUsingDivideAndConquer(int numToFind, int[] inputList) {
		return findLastIndexUsingDivideAndConquer(numToFind, inputList, 0, inputList.length-1);
	}
	
	private static int findLastIndexUsingDivideAndConquer(int numToFind, int[] inputList, int firstIndex, int lastIndex) {
		
		if (firstIndex==lastIndex) {
			if (numToFind == inputList[firstIndex]) 
				return firstIndex;
			else
				return -1;
		}
		
		int mid = (firstIndex + lastIndex) / 2;
		
		if (numToFind >= inputList[mid+1]) {
			return findLastIndexUsingDivideAndConquer(numToFind, inputList, mid+1, lastIndex);
		}
		else {
			return findLastIndexUsingDivideAndConquer(numToFind, inputList, firstIndex, mid);
		}
	
	}
	
	public static int countOccurence(int numToFind, int[] inputList) {
		
		int indexFirst = findFirstIndexUsingDivideAndConquer(numToFind, inputList);
		if (indexFirst < 0) {
			return -1;
		}
		int indexLast = findLastIndexUsingDivideAndConquer(numToFind, inputList);
		
		return (indexLast - indexFirst + 1);
		
	}

	public static void main(String[] args) {
		
		int[] inputList = new int[] {5,8,9,10,13,13,13,13,13,13,13,14,15};
		int numToFind = 11;
		
		System.out.println("inputList=" + Arrays.toString(inputList));
		System.out.println("inputList.length=" + inputList.length);
		
		System.out.println("numToFind=" + numToFind);
		
		int indexFirst = findFirstIndexUsingDivideAndConquer(numToFind, inputList);
		System.out.println("findFirstIndexUsingDivideAndConquer index=" + indexFirst);
		
		int indexLast = findLastIndexUsingDivideAndConquer(numToFind, inputList);
		System.out.println("findLastIndexUsingDivideAndConquer index=" + indexLast);
		
		int countOccurence = countOccurence(numToFind, inputList);
		System.out.println("countOccurence=" + countOccurence);
		
	}

}
