import java.io.File;
 
public class Main {
     
    public static void print(int v[]){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
     
    public static void main(String[] args){
         
        Gerador random = new Gerador();
         
        File arqMil = new File("arqMil.txt");
        File arqCinco = new File("arqCinco.txt");
        File arqDez = new File("arqMil.txt");
        File arqVinte = new File("arqVinte.txt");
        File arqCinquenta = new File("arqCinquenta.txt");
        File arqCemMil = new File("arqCemMil.txt");
        
        int vMil[] = new int[1000];
        int vCinco[] = new int[5000];
        int vDez[] = new int[10000];
        int vVinte[] = new int[20000];
        int vCinquenta[] = new int[50000];
        int vCemMil[] = new int[100000];
        
        //Vetores com os 100 valores colhidos.
        int milAl[] = new int[100];
        int cincoAl[] = new int[100];
        int dezAl[] = new int[100];
        int vinteAl[] = new int[100];
        int cinquentaAl[] = new int[100];
        int cemAl[] = new int[100];
         
        int CINCO[] = new int[5];
        int DEZ[] = new int[10];
        
        DEZ = random.gerador(DEZ, 10);
        CINCO = random.colhedor2(DEZ);
        print(CINCO);
         
        //vMil = random.gerador(vMil, 1000);
        //vCinco = random.gerador(vCinco, 5000);
        //vDez = random.gerador(vDez, 10000);
        //vVinte = random.gerador(vVinte, 20000);
        //vCinquenta = random.gerador(vCinquenta, 50000);
        //vCemMil = random.gerador(vCemMil, 100000);
         
        //SelectionSort.selection(vMil);
        //SelectionSort.selection(vCinco);
        //SelectionSort.selection(vDez);
        //SelectionSort.selection(vVinte);
        //SelectionSort.selection(vCinquenta);
        //SelectionSort.selection(vCemMil);
         
        //MergeSort.merge(vMil, 0, vMil.length-1);
        //MergeSort.merge(vCinco, 0, vCinco.length-1);
        //MergeSort.merge(vDez, 0, vDez.length-1);
        //MergeSort.merge(vVinte, 0, vVinte.length-1);
        //MergeSort.merge(vCinquenta, 0, vCinquenta.length-1);
        //MergeSort.merge(vCemMil, 0, vCemMil.length-1);
        
        //SelectionSort.selection(vMil);
        //SelectionSort.selection(vCinco);
        //SelectionSort.selection(vDez);
        //SelectionSort.selection(vVinte);
        //SelectionSort.selection(vCinquenta);
        //SelectionSort.selection(vCemMil);
        
        //milAl = random.colhedor2(vMil);
        
        //print(milAl);
         
         
        //print(vMil);
 
    }
 
}