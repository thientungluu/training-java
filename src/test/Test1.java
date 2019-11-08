package test;
/*Write a Java program to separate even and odd numbers of an given array of integers.
 Put all even numbers first, and then odd numbers.*/
public class Test1 {
	public static void main(String[] args) {
		int[] arr = { 8, 9, 6, 3, 5, 2 };

		System.out.println("Mang ban dau:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] test = separate(arr);

		System.out.println("Mang sau khi da tach:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] separate(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}
			while (arr[right] % 2 == 1 && left < right) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return arr;
	}
}
