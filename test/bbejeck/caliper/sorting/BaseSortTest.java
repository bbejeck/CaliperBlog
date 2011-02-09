package bbejeck.caliper.sorting;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Random;

public class BaseSortTest {

	protected int[] numbers;
	int[] control;
	int SIZE = 1000;
	int MAX = 5000;

	protected void assertSortedArraysEqual() {
		assertThat(Arrays.equals(numbers, control), is(true));
	}

	protected void generateArraysForTest() {
		numbers = new int[SIZE];
		control = new int[SIZE];
		Random generator = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = generator.nextInt(MAX);
			control[i] = numbers[i];
		}
	}

	protected void sortControlNumbers() {
		Arrays.sort(control);
	}

}