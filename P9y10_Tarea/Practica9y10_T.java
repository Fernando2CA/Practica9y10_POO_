package mx.unam.fi.poo.g1.p9y10_T;
import mx.unam.fi.poo.g1.p9y10_T.*;

/**
 * Clase principal de la practica9y10_T
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class Practica9y10_T {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación.
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        IngresarCadena cadena = new IngresarCadena();

        try {
            cadena.cadenaVocal();
        } catch (CadenaException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}