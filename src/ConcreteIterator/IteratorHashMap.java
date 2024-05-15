
package ConcreteIterator;
import Iterator.Iterator;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class IteratorHashMap implements Iterator{
    
    private LinkedHashMap<Integer, String> paises = new LinkedHashMap<>();
    private int index;    
    
    public IteratorHashMap(LinkedHashMap<Integer, String> paises){
        this.paises = paises;
        this.index = 0;
    }
    
    //Devuelve el numero de la posicion en la que se encuentra actualmente
    @Override
    public Object getNext() {
        return paises.get(index++);
    }

    //Comprueba si hay mas elementos en la lista
    @Override
    public boolean hasMore() {
        if( index < paises.size()){
            return true;
        }
        else{
            return false;
        }
    }
}
