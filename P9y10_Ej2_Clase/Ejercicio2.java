package mx.unam.fi.poo.g1.p9y10_Ej2_Clase;
import mx.unam.fi.poo.g1.p9y10_Ej2_Clase.*;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            List<Integer> numeros = IngresaUsuario.leerNumerosUsuario();
            RevisionDuplicado.checarDuplicado(numeros);
            System.out.println("¡No hay numeros duplicados!");
        } catch (NumeroDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
