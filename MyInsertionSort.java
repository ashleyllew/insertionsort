
public class MyInsertionSort {
	
	public static void main(String[] args) {
		int [] array = new int [10];
		for (int i = 0, j = array.length-1; i < array.length && j>=0; i++, j--) {
			array[i] = j;
		}
		MyOwnInsertionSort(array);
	}
		
	public static <AnyType extends Comparable <AnyType>> void MyOwnInsertionSort (int [] array) {
		System.out.println("Unsorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("element: " + array[i]);
		}
		for (int i = 1; i < array.length; i++) {
			int j;
			Comparable<Integer> tmp = array[i];
			
			for (j = i; j > 0; j--) {
				if (tmp.compareTo(array[j-1]) < 0) {
					array[j] = array[j-1];
				}
			}
			array[j] = (int) tmp;
		}
		System.out.println("Sorted array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("element: " + array[i]);
		}
	}
	
	
}
