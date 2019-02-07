import java.util.Random;
 
 
public class Gerador {
     
    Random gerador = new Random();
     
    public int[] gerador(int v[], int quant){

        boolean tem = true;
        int x = 0 ;
         
        for (int i = 0; i < v.length; i++) {
            tem = true;
            while(tem){
                x = gerador.nextInt((quant*100)-1);
                tem = false;
                for (int j = 0; j <= i && !tem; j++) {
                    if(v[j] == x){
                        tem = true;
                    }
                }
            }                       
            v[i] = x;
        }
        return v;
    }
    
    public  int[] colhedor(int vet[]){ 
    	
    	int vetCem[] = new int[100];
    	int vetIndice[] = new int[100];
    
    	vetIndice = gerador(vet, vet.length/100);
    	
    	
    	for (int i = 0; i < vetIndice.length-1; i++) {
			vetCem[i] = vet[vetIndice[i]];
		}
    	
    	return vetCem;
    }
    
    public int[] colhedor2(int vet[]){
    	int v[] = new int[100];
    	int p = vet.length/100;
    	for (int i = 0; i < v.length; i++) {
    		if (p == vet.length) {
				p--;
				v[i] = vet[p];
			}else{
				v[i] = vet[p];
				p = p + p;
			}
		}
    	return v;
    }
}