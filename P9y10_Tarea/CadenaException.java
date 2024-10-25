package mx.unam.fi.poo.g1.p9y10_T;

/**
 * Clase CadenaException que extiende(hereda) la clase Exception.
 * @author Carrillo Alemán Luis Fernando
 * @version Octubre - 2024
*/

public class CadenaException extends Exception{
    /**
     * Constructor para crear una cadena de excepción.
     * @param mensaje -> Atributo para el mensaje de error de la excepción.
     */
    public CadenaException(String mensaje){
        super(mensaje);
    }
}

