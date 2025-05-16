import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // Ruta del archivo dentro de la carpeta config/
        Path rutaArchivo = Paths.get("config", "parametros.txt");

        // Contenido del archivo
        String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        // Guardar y leer los parámetros
        guardarParametros(rutaArchivo, parametros);
        leerParametros(rutaArchivo);
    }

    // Método para guardar parámetros en un archivo
    private static void guardarParametros(Path ruta, String contenido) {
        try {
            // Crear carpeta si no existe
            Path carpeta = ruta.getParent();
            if (!Files.exists(carpeta)) {
                Files.createDirectories(carpeta);
                System.out.println("📂 Carpeta creada: " + carpeta.toAbsolutePath());
            }

            // Escribir el contenido en el archivo
            Files.write(ruta, contenido.getBytes());
            System.out.println("✅ Archivo creado correctamente en: " + ruta.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("❌ Error al guardar parámetros: " + e.getMessage());
        }
    }

    // Método para leer parámetros desde un archivo
    private static void leerParametros(Path ruta) {
        if (Files.exists(ruta)) {
            try {
                String datos = Files.readString(ruta);
                System.out.println("📄 Contenido del archivo:");
                System.out.println(datos);
            } catch (IOException e) {
                System.out.println("❌ Error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("⚠️ El archivo no existe. No se puede leer.");
        }
    }
}
