package Exercise3;

public class TestClass {

	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		intArray[0] = 7;
		intArray[1] = 66;
		intArray[2] = 3;
		intArray[3] = 54;
		intArray[4] = 77;
		intArray[5] = 123;
		intArray[6] = 86;
		intArray[7] = 9;
		intArray[8] = 10;
		intArray[9] = 17;
		
		MyArray array = new MyArray(intArray);
		
		System.out.println("The smallest element in array is: " + array.getSmallestElement());
		System.out.println("The largest element in array is: " + array.getLargestElement());
		System.out.println("The sum of all elements in array is: " + array.sumAllElements());
		System.out.print("Elements of array are: ");
		array.printAllElements();
	}

}
