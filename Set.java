import java.util.HashSet;
 
 
public class Set extends HashSet{
     
    int v[];
    int size;
     
    public Set(){
         
    }
     
    public Set(int quant){
        v = new int[quant]; 
    }
     
    public void addf(int value){
        if(isEmpty()){
            v[size++] = value;
        }else{
            add(value);
            size++;
        }
    }
     
    public int removef(int pos){
        int value = v[pos];
        remove(pos);
        size--;
        return value;
         
    }
     
    public boolean isEmpty(){
        return size == 0;
    }
     
    public void print(Set set){
        for (int i = 0; i < set.v.length; i++) {
            System.out.println(set.v[i]);
        }
    }
 
}