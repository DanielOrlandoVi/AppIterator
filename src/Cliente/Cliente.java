
package Cliente;

import javax.swing.JOptionPane;
import Iterator.Iterator;
import ConcreteCollection.*;

public class Cliente {

    public static void main(String[] args) {

        //El patron iterator nos permiete acceder a elementos de una coleccion
        //basada en cierta estructura de datos, sin conocer el comportamiento de la estructura
        
        
        Lista listaNombres = new Lista();
        Hashmap hashMapPaises = new Hashmap();
        Iterator iterator;
         // Opciones de roles disponibles
        String opciones[] = {"Anadir nombres a Lista", "Iterar lista", "Anadir paises a HashMap", "Iterar HashMap","Salir"};
        // Bucle infinito hasta que se seleccione la opción "Salir"
        
        //contador auxiliar
        int index = 0;        
        while (true) {

            // Solicita al usuario que seleccione un rol
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion:", "Seleccion de opciones",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            // Si el usuario cierra el cuadro de diálogo o selecciona "Salir", se termina el programa
            if (opcion == null || opcion.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }

            // Dependiendo de la opcion seleccionada, se realizan diferentes acciones
            switch (opcion) {
                case "Anadir nombres a Lista":                    
                    String nombre = JOptionPane.showInputDialog("Introduzca un nombre: ");
                    listaNombres.agregarElemento(nombre);
                    
                    break;
                case "Iterar lista":
                    iterator = listaNombres.crearIterator();
                    StringBuilder salida = new StringBuilder();
                    salida.append("La lista de nombres es: \n");
                    
                    while(iterator.hasMore()){
                        salida.append(iterator.getNext() + "\n");
                    }
                    
                    JOptionPane.showMessageDialog(null, salida);
                    
                    break;
                case "Anadir paises a HashMap":
                    String pais = JOptionPane.showInputDialog("Introduzca un pais: ");
                    hashMapPaises.agregarElemento(index, pais);
                    index++;
                    
                    break;
                case "Iterar HashMap":
                    iterator = hashMapPaises.crearIterator();
                    StringBuilder salida2 = new StringBuilder();
                    salida2.append("La lista de paises es: \n");

                    while(iterator.hasMore()){
                        salida2.append(iterator.getNext() + "\n");
                    }                   
                    JOptionPane.showMessageDialog(null, salida2);
                    
                    break;
                case "Salir":
                    // Termina el programa
                    System.exit(0);
                    break;

                default:
                    // Si se selecciona una opción no válida, se muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Tipo de opcion no valida.");
                    return;
            }
        }
    }
    
}
