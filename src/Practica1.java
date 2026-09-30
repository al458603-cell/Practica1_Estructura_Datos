import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practica1 {

    static public void separa(Set<String> unicos, Set<String> repetidos) {
        Set<String> interseccion =  new HashSet<>(unicos);
        interseccion.retainAll(repetidos);

        unicos.addAll(repetidos);
        unicos.removeAll(interseccion);

        repetidos.clear();
        repetidos.addAll(interseccion);

    }


    static public Set <Integer> filtra(Iterator<Integer> iter) {
        Set<Integer> vistos = new HashSet<>();
        Set<Integer> resultado = new HashSet<>();

        while (iter.hasNext()) {

            Integer numero = iter.next();
            if (numero != null && numero > 0) {
                vistos.add(numero);
            }
        }

            for (Integer a : vistos) {
                boolean esMultiplo = false;

                for (Integer b : vistos) {
                    if (!a.equals(b) && a % b == 0) {
                        esMultiplo = true;
                        break;
                    }
                }

                if (!esMultiplo) {
                    resultado.add(a);
                }
            }

            return resultado;

    }


    static public Set<String> repetidos (Collection<Set<String>> col) {

        return null;
    }


    public static Set<Integer> interseccionImpares (Collection<Set<Integer>> col) {
       return null;
    }


}
