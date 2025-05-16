import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = null;
        HashSet<Integer> consumos = new HashSet<>();

        try {
            scanner = new Scanner(System.in);
            System.out.println("Ingresa consumos de CPU en porcentaje (enteros). Escribe -1 para terminar.");

            while (true) {
                System.out.print("Consumo (%): ");
                String entrada = scanner.nextLine();

                int valor;
                try {
                    valor = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Error: Debes ingresar un número entero.");
                    continue;
                }

                if (valor == -1) {
                    System.out.println("✔️ Ingreso finalizado.");
                    break;
                }

                if (valor < 0 || valor > 100) {
                    System.out.println("❌ Error: El valor debe estar entre 0 y 100.");
                    continue;
                }

                if (consumos.contains(valor)) {
                    System.out.println("⚠️ Valor duplicado. No se registrará.");
                    continue;
                }

                if (valor > 95) {
                    throw new ConsumoCriticoException("🔥 ¡Alerta! Consumo crítico detectado: " + valor + "%");
                }

                consumos.add(valor);
                System.out.println("✅ Registro exitoso.");
            }

            // Muestra los valores válidos
            System.out.println("\nConsumos registrados:");
            for (int c : consumos) {
                System.out.println(" - " + c + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println("🚨 EXCEPCIÓN: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("📦 Recurso cerrado correctamente.");
            }
        }
    }
}
