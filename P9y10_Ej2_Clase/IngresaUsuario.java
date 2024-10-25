package mx.unam.fi.poo.g1.p9y10_Ej2_Clase;
import mx.unam.fi.poo.g1.p9y10_Ej2_Clase.*;
import java.util.*;

public class IngresaUsuario {
    public static List <Integer> leerNumerosUsuario(){
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantos numeros deseas ingresar?");
        int cont = scanner.nextInt();

        System.out.println("Ingresa los enteros");
        for (int i = 0; i < cont; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }

        scanner.close();
        return numeros;
    }
}
