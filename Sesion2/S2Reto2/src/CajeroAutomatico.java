import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        int opcion;

        do {
            System.out.println("\n💳 Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            // Validar entrada como número entero
            while (!scanner.hasNextInt()) {
                System.out.print("❗ Opción inválida. Ingresa un número del 1 al 4: ");
                scanner.next(); // descartar entrada no válida
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("✅ Tu saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("💰 Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("❌ Monto inválido. No se realizó el depósito.");
                    }
                    break;
                case 3:
                    System.out.print("💸 Ingresa el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("❌ Saldo insuficiente. Intenta con un monto menor.");
                        continue;
                    } else if (retiro <= 0) {
                        System.out.println("❌ Monto inválido. No se realizó el retiro.");
                        continue;
                    }
                    saldo -= retiro;
                    System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
                    break;
                case 4:
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("❗ Opción no válida. Intenta nuevamente.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
