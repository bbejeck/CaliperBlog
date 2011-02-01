package bbejeck.caliper.sorting;

public class QuickSort extends BaseSort{
	
	public static void sort(int[] numbers) {
           quicksort(numbers,0,numbers.length-1);
	}

	private static void quicksort(int[] numbers,int start,int end) {
		int partition = numbers[(end + start) / 2];
		int localStart = start;
		int localEnd = end;
		
		while(localStart <= localEnd) {
			while(numbers[localStart] < partition) { localStart++; };
			while(numbers[localEnd] > partition) { localEnd--; };
			if(localStart <= localEnd){
				swap(numbers,localStart,localEnd);
				localStart++;
				localEnd--;
			}
		}
		
		if(start < localEnd) {
			quicksort(numbers, start, localEnd);
		}
		
		if(localStart < end) {
			quicksort(numbers, localStart, end);
		}
	}
}
