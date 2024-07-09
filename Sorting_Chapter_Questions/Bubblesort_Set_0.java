package Sorting_Chapter_Questions;

public class Bubblesort_Set_0 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr= {1,2,3,4,5};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++) {
        	
        System.out.print(arr[i]+" ");
	}
	}
	public static void bubblesort(int[]arr) {
		for(int turn=1;turn<arr.length;turn++) {
		for(int i=0;i<arr.length-turn;i++) {
			if(arr[i]>arr[i+1]) {
				//Swap
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		}
	}

}
