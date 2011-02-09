package bbejeck.caliper.sorting;

import org.junit.Before;
import org.junit.Test;

public class SortingTest extends BaseSortTest {
	
	@Before
	public void setUp() {
		generateArraysForTest();
		sortControlNumbers();
	}
	
	@Test
	public void testMergeSort(){
		MergeSort.sort(numbers);
		assertSortedArraysEqual();
	}
	
	@Test
	public void testHeapSort() {
		HeapSort.sort(numbers);
		assertSortedArraysEqual();
	}
	
	@Test
	public void testQuickSort() {
		QuickSort.sort(numbers);
		assertSortedArraysEqual();
	}

}
