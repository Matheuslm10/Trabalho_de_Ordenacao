public class BubbleSortOtimizado {

	public static void main(String[] args) {
		Swap swap = new Swap();
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
	    int r,aux;
	    boolean troca = false;
	    
	    long t1 = System.nanoTime();
	    
	    for(int i = vetor.length-1; i >= 1; i--){  
	        for(int j=0; j < i ; j++){
	            if(vetor[j]> vetor[j+1]){
	            	swap.swap(vetor, j, j+1);
	            	troca = true;
	            }
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
