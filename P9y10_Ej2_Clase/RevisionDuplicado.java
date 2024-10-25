package mx.unam.fi.poo.g1.p9y10_Ej2_Clase;
import mx.unam.fi.poo.g1.p9y10_Ej2_Clase.*;
import java.util.*;

public class RevisionDuplicado {
    public static void checarDuplicado(List <Integer> numeros) throws NumeroDuplicadoException {
        Set<Integer> numerosUnicos = new HashSet<>();

        for (int num : numeros) {
            if(numerosUnicos.contains(num)) {
                throw new NumeroDuplicadoException("Numero duplicado encontrado: " + num);   
            }
            numerosUnicos.add(num);
        }

    }
}

