package mx.unam.fi.poo.g1.p9y10_T;
import mx.unam.fi.poo.g1.p9y10_T.*;
import java.util.Scanner;

/**
 * Clase IngresarCadena.
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class IngresarCadena {

    /**
     * Método que pide una cadena y verifica si tiene vocales o no, 
     * lanzando una excepción si no tiene.
     * @throws CadenaException -> si la cadena no tiene vocales.
     */
    public void cadenaVocal() throws CadenaException{
        Scanner en = new Scanner(System.in);

        System.out.print("Ingrese la cadena deseada: ");
        String cad = en.next();

        boolean vocal = false;
        for (int i = 0; i < cad.length(); i++) {
            char letra = cad.charAt(i);
            if(letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' 
            || letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O' 
            || letra == 'u' || letra == 'U'){
                vocal = true;
            }
        }

        if(!vocal){
            throw new CadenaException("No se encontraron vocales");
        } else {
            System.err.println("La cadena si contiene vocales");
        }

        en.close();
    }
}
