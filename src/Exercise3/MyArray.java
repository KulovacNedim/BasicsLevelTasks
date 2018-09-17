package Exercise3;

public class MyArray {

	private int[] array;
	
	public MyArray() {
		
	}
	
	
	public MyArray(int[] array) {
		super();
		this.array = array;
	}



	public int[] getArray() {
		return array;
	}



	public void setArray(int[] array) {
		this.array = array;
	}



	public int getSmallestElement() {
		
		int [] array = getArray();
		int smallestElement = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallestElement) {
				smallestElement = array[i];
			}
		}

		return smallestElement;
	}
	
	public int getLargestElement() {
		
		int [] array = getArray();
		int largestElement = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largestElement) {
				largestElement = array[i];
			}
		}
		
		return largestElement;
	}
	
	public int sumAllElements() {
		
		int [] array = getArray();
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		return sum;
	}
	
	public void printAllElements() {
		
		int [] array = getArray();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
