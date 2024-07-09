package Sorting_Chapter_Questions;

public class Insertion_Sort_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 13, -4, 5, 7 };
		// Function Call
		sort(arr);
		// Output Print Loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		// Single Element Always sort hoga due to this reason loop1 se start hoga
		// ArrayElement Check Loop
		for (int i = 1; i < arr.length; i++) {
			int picked = arr[i]; // Hand Picked Element
			int j =i-1;
			while (j >= 0 && arr[j] > picked) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j + 1] = picked;
		}
	}

}
