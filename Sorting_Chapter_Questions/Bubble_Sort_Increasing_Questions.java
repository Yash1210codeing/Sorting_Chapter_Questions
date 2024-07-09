package Sorting_Chapter_Questions;

public class Bubble_Sort_Increasing_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 5, 3, 2 };
		// Sort Function Call
		sort(arr);
		// output Print Loop
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	public static void sort(int[] arr) {
		// Round Loop
		for (int round = 1; round < arr.length; round++) {
			// Array Element Loop
			for (int i = 0; i < arr.length - round; i++) {
				if (arr[i] > arr[i + 1]) {
					// Swaping
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

}
