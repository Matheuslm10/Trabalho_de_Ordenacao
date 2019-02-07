
public class InsertionSortOtimizado {

	public static void main(String[] args) {
		Swap swap = new Swap();
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		int j=0;
		boolean troca = false;
		
		long t1 = System.nanoTime();
		
		for(int i = 1; i < vetor.length; i++){
			j = i;
			
			while( j > 0 && vetor[j-1] > vetor[j]){
				swap.swap(vetor, j, j-1);
				j--;	
				troca = true;
			}
			
			if(!troca){
	        	break;
	        }
		}
		
		long t2 = System.nanoTime();
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println(t2-t1);

	}

}
