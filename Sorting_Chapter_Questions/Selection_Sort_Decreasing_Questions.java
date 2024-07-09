package Sorting_Chapter_Questions;

public class Selection_Sort_Decreasing_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 13, -4, 5, 7 };
		// Sort Function Call
		sort(arr);
		// Output Print Loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		// Array Value Element Selection Loop
		for (int i = 0; i < arr.length; i++) {
			int mini = i; // Index
			// Array Min val element loop
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] >arr[mini]) {
					mini = j;

				}
			}
			// Swaping
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;

		}
	}
}
