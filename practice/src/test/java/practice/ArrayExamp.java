package practice;

public class ArrayExamp {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 4, 2, 1, 3, 2, 5, 4, 8 };
		int n = 0;
		for (int i = 0; i < arr.length ; i++) {
			boolean dup = false;
			for (int j = 1; j < i; j++) {
				if (arr[i] == arr[j]) {
					dup = true;
					
					break;

				}
			}
			

			if (!dup) {

				System.out.print(arr[i] + " ");

			}
		}

	}
}