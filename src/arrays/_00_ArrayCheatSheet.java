package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] numbers = new String[5];
		// 2. print the third element in the array
		System.out.println(numbers[2]);
		// 3. set the third element to a different value
		numbers[2] = "hello";
		// 4. print the third element again
		System.out.println(numbers[2]);

		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers);
		}

		// 6. make an array of 50 integers
		Integer[] name = new Integer[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 50; i++) {
			int rand = (int) (Math.random() * 50);
			name[i] = rand;
			System.out.println(rand);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int lowest = 0;
		System.out.println(lowest);
		// 9 print the entire array to see if step 8 was correct
		System.out.println(name);
		// 10. print the largest number in the array.
		int highest = 50;
		System.out.println(highest);
	}
}
