
package ConcreteIterator;

import Iterator.Iterator;
import java.util.ArrayList;


public class IteratorLista implements Iterator{

    private ArrayList listaNombres = new ArrayList<>();
    private int index;    
    
    public IteratorLista(ArrayList listaNombres){
        this.listaNombres = listaNombres;
        this.index = 0;
    }
    
    //Devuelve el numero de la posicion en la que se encuentra actualmente
    @Override
    public Object getNext() {
        return listaNombres.get(index++);
    }

    //Comprueba si hay mas elementos en la lista
    @Override
    public boolean hasMore() {
        if( index < listaNombres.size()){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
