public class SelectionSort {
     
    static Swap swap = new Swap();
     
    public static int[] selection(int v[]){
        int min;
        int iMenor;
        for (int i = 0; i < v.length - 1; i++) {
            min = v[i];
            iMenor = i;
             
            for (int j = i + 1; j < v.length; j++){
                if (v[j] < min){
                    min = v[j];
                    iMenor = j;
                }
            }
            swap.swap(v, iMenor, i);
        }
         
        return v;
    }
     
}