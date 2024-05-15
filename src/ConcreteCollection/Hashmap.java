
package ConcreteCollection;
import ConcreteIterator.IteratorHashMap;
import IterableCollection.IterableCollection;
import Iterator.Iterator;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmap implements IterableCollection{
    
    //Un  linkedHashMap es un hashmap que mantiene el orden de insercion de sus elementos
    private LinkedHashMap<Integer, String> paises = new LinkedHashMap<>();
    
    public Hashmap(){
    
    }
    
    public void agregarElemento(int numPais, String pais){
        paises.put(numPais, pais);
    }

    @Override
    public Iterator crearIterator() {
        return new IteratorHashMap(paises);

    }
}
