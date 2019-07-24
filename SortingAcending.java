package Bubblesort;


public class SortingAcending {

	public static void main(String[] args) {
		int arr[] = { 23, 18, 5, 45, 25 };
		System.out.println("before sorting");
		for (int i : arr) {
			System.out.println(i);
		}
		sortingacending(arr);
		System.out.println("after sorting");
		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static void sortingacending(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

}