
public class QuickSort {
	
	public static Swap s = new Swap();
	
	public static void quicksort(int v[], int init, int end){
		if(init < end){
			int pivot = partition(v, init, end);
			if(init < pivot-1){
				quicksort(v, init, pivot-1);
			}
			if(pivot < end){
				quicksort(v, pivot, end);
			}
		}
	}
	
	public static int partition(int v[], int init, int end){
		int i = init;
		int j = end;
		
		int pivot = v[end/2];
		
		while(i <= j){
			while(v[i] < pivot){
				i++;
			}
			while(v[j] > pivot){
				j--;
			}
			if(i <= j){
				s.swap(v, v[i++], v[j--]);
			}
		}
		return i;
	}

}
