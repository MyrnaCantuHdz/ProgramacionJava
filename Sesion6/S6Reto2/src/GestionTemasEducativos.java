import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

// Clase que representa un tema educativo
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Orden natural: alfabético por título
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "📘 Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class GestionTemasEducativos {
    public static void main(String[] args) {
        // Lista concurrente de temas activos
        List<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Repositorio concurrente de recursos asociados
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        // Ordenar alfabéticamente (orden natural)
        Collections.sort(temas);
        System.out.println("🔤 Temas ordenados por título:");
        for (Tema t : temas) {
            System.out.println(t + " | Recurso: " + recursos.get(t.titulo));
        }

        // Ordenar por prioridad ascendente usando Comparator
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema t1, Tema t2) {
                return Integer.compare(t1.prioridad, t2.prioridad);
            }
        });

        System.out.println("\n🚦 Temas ordenados por prioridad (1 = urgente):");
        for (Tema t : temas) {
            System.out.println(t + " | Recurso: " + recursos.get(t.titulo));
        }

        //Mostrar el repositorio de recursos por tema
        System.out.println("\n📦 Repositorio de recursos por tema:");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " : " + recursos.get(tema));
        }
    }
}
