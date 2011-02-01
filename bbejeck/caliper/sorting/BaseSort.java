package bbejeck.caliper.sorting;

public abstract class BaseSort {

	protected static void swap(int[] v, int from, int to) {
		int temp = v[from];
		v[from] = v[to];
		v[to] = temp;
	}

}
