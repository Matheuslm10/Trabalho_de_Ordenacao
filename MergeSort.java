public class MergeSort{
	
	static void merge(int v[], int com, int fim){
		if(com < fim){
			int metade = (com + fim)/2;
			merge(v, com, metade);
			merge(v, metade+1, fim);
			juntar(v, com, metade, fim);
		}
	}

	static void juntar(int v[], int com, int metade, int fim){
		int tamanho = fim - com + 1; 
		int vTemp[] = new int[tamanho]; // A copia do trecho que sera ordenado ficara aqui
	
		System.arraycopy(v, com, vTemp, 0, tamanho);

		int i = 0;
		int j = metade - com + 1;

		for (int pos = 0; pos < tamanho; pos++){
			if(j <= tamanho - 1){
				if(i <= metade - com){
					if(vTemp[i] < vTemp[j]){
						v[com+pos] = vTemp[i++];
					}else{
						v[com+pos] = vTemp[j++];	
					}	
				}else{
					v[com+pos] = vTemp[j++];
				}
			}else{
				v[com+pos] = vTemp[i++];
			}
		}	
	}
}
	
	
