import java.util.*;

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
        Set<String> repetidos = new HashSet<>();
        Set<String> vistos = new HashSet<>();
        Iterator<Set<String>> iter = col.iterator();

        while (iter.hasNext()) {
             Set<String> actual = iter.next();
             for (String a : actual) {
                 if (!vistos.add(a)) {
                     repetidos.add(a);
                    }
             }
        }
            return repetidos;
    }




    public static Set<Integer> interseccionImpares (Collection<Set<Integer>> col) {
        if (col.isEmpty()) {
            return new HashSet<>();
        }

        Iterator<Set<Integer>> iter = col.iterator();
        Set<Integer> interseccion = new HashSet<>(iter.next());

        while (iter.hasNext()) {
            interseccion.retainAll(iter.next());
        }


        Iterator<Integer> it = interseccion.iterator();

        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();
            }
        }
        return interseccion;
    }

}



