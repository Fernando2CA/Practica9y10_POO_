package mx.unam.fi.poo.g1.p9y10_Ej1_Clase;
import mx.unam.fi.poo.g1.p9y10_Ej1_Clase.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        OperacionMatematica operacion = new OperacionMatematica();

        try {
            double resultado = operacion.raizCuadrada(-9);
            System.out.println("Resultado: " + resultado);
        } catch (RaizNegativaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}