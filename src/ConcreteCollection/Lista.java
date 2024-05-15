
package ConcreteCollection;

import ConcreteIterator.IteratorLista;
import IterableCollection.IterableCollection;
import Iterator.Iterator;
import java.util.ArrayList;


public class Lista implements IterableCollection{
    
    //La primera estructura de datos consiste en un ArrayList que guardara nombres de personas
    private ArrayList listaNombres = new ArrayList<>(); 
    
    public Lista(){       
    }
    
    public void agregarElemento(String elemento){
        listaNombres.add(elemento);
    }

    @Override
    public Iterator crearIterator() {
        return new IteratorLista(listaNombres);
    }
    
}
