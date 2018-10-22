package chizhenko;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] myArray;
		int length;
		int count;
		int temp = 0;

		System.out.println("”кажите длину массива:");

		length = sc.nextInt();
		sc.close();
		myArray = new int[length];
		count = length / 2;

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(myArray));
		for (int i = 0; i < count; i++) {
			temp = myArray[i];
			myArray[i] = myArray[length - i - 1];
			myArray[length - i - 1] = temp;
		}

		System.out.println(Arrays.toString(myArray));

	}

}
