import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        // 🧬 Paso 1: ArrayList para registrar el orden de llegada de las especies
        ArrayList<String> especiesRecibidas = new ArrayList<>();
        especiesRecibidas.add("Homo sapiens");
        especiesRecibidas.add("Mus musculus");
        especiesRecibidas.add("Arabidopsis thaliana");
        especiesRecibidas.add("Homo sapiens"); // Repetido por replicación

        System.out.println("📥 Orden de llegada de muestras:");
        for (int i = 0; i < especiesRecibidas.size(); i++) {
            System.out.println((i + 1) + ". " + especiesRecibidas.get(i));
        }

        // 🌱 Paso 2: HashSet para obtener especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(especiesRecibidas);

        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        // 🧑‍🔬 Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();
        muestrasInvestigador.put("M-001", "Dra. López");
        muestrasInvestigador.put("M-002", "Dr. Hernández");
        muestrasInvestigador.put("M-003", "Mtra. Rivera");

        System.out.println("\n🗂️ Muestras registradas (ID → Investigador):");
        for (Map.Entry<String, String> entrada : muestrasInvestigador.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        // 🔍 Paso 4: Buscar responsable por ID de muestra
        String idBuscado = "M-002";
        System.out.println("\n🔍 Investigador responsable de la muestra " + idBuscado + ": "
                + muestrasInvestigador.get(idBuscado));
    }
}
