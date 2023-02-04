package sort;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] x = { 9, 2, 0,3,4, 5};
		//System.out.println(Arrays.toString(x));
		int low = 0;
		int high = x.length - 1;
		quickSort(x, low, high);
		//System.out.println(Arrays.toString(x));
	}

	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
		if (low >= high)
			return;
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		System.out.println("Pivot " + pivot);
		// make left < pivot and right > pivot
		int i = low;
		int j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		// This is for sorting right side of the initial pivot. 
		if (low < j)
			quickSort(arr, low, j);
		// This is for sorting left side of the pivot. Since left side of the initial pivot is already
		// sorted, we increment the low position by i value i.e if the first element is sorted, then we
		// need to sort from second element onwards.
		if (high > i)
			quickSort(arr, i, high);
	}

}
