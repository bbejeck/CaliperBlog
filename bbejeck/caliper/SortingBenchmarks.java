package bbejeck.caliper;

import java.util.Arrays;
import java.util.Random;

import bbejeck.caliper.sorting.HeapSort;
import bbejeck.caliper.sorting.MergeSort;
import bbejeck.caliper.sorting.QuickSort;

import com.google.caliper.SimpleBenchmark;

public class SortingBenchmarks extends SimpleBenchmark {
	
	private static final int SIZE = 100000;
	private static final int MAX_VALUE = 80000;
	private int[] values;

	@Override
	protected void setUp() throws Exception {
		values = new int[SIZE];
		Random generator = new Random();
		for (int i = 0; i < values.length; i++) {
			values[i] = generator.nextInt(MAX_VALUE);
		}
	}

	public void timeHeapSort(int reps) {
		for (int i = 0; i < reps; i++) {
			HeapSort.sort(values);
		}
	}

	public void timeMergeSort(int reps) {
		for (int i = 0; i < reps; i++) {
			MergeSort.sort(values);
		}
	}
	
	public void timeQuickSort(int reps) {
		for (int i = 0; i < reps; i++) {
			QuickSort.sort(values);
		}
	}

	public void timeArraysSort(int reps) {
		for (int i = 0; i < reps; i++) {
			Arrays.sort(values);
		}
	}
}
