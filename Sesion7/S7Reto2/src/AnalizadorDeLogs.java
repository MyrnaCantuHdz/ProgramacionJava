import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        // Ahora usamos una carpeta "logs/" en la raíz del proyecto
        Path rutaLogs     = Paths.get("logs", "errores.log");
        Path rutaRegistro = Paths.get("logs", "registro_fallos.txt");

        // Asegurarnos de que exista la carpeta "logs/"
        try {
            Path carpeta = rutaLogs.getParent();
            if (!Files.exists(carpeta)) {
                Files.createDirectories(carpeta);
            }
        } catch (IOException e) {
            System.err.println("❌ No se pudo crear la carpeta de logs: " + e.getMessage());
            return;
        }

        int totalLineas   = 0;
        int errores       = 0;
        int advertencias  = 0;

        try (BufferedReader lector = Files.newBufferedReader(rutaLogs)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR"))   errores++;
                if (linea.contains("WARNING")) advertencias++;
            }

            // Mostrar resumen
            System.out.println("📊 Resumen del análisis de logs:");
            System.out.println("🔢 Total de líneas leídas: "    + totalLineas);
            System.out.println("❌ Errores (ERROR): "           + errores);
            System.out.println("⚠️ Advertencias (WARNING): "    + advertencias);
            System.out.printf("📈 %% ERROR: %.2f%%\n", errores * 100.0 / totalLineas);
            System.out.printf("📉 %% WARNING: %.2f%%\n", advertencias * 100.0 / totalLineas);

        } catch (IOException e) {
            System.out.println("❌ No se pudo procesar el archivo: " + e.getMessage());

            // Guardar registro de fallo
            try (PrintWriter escritor = new PrintWriter(Files.newBufferedWriter(rutaRegistro))) {
                escritor.println("⛔ Error al procesar errores.log:");
                escritor.println(e.getMessage());
                System.out.println("📝 Se guardó el detalle en " + rutaRegistro);
            } catch (IOException ex) {
                System.out.println("⚠️ Falló al guardar registro de fallos: " + ex.getMessage());
            }
        }
    }
}
