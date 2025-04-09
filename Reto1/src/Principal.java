import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        // Crear objeto Scanner para entrada por consola
        Scanner scanner = new Scanner(System.in);

        //  Paciente
        Paciente paciente1 = new Paciente();

        // Solicitar y asignar los valores al objeto
        System.out.print("Ingrese el nombre del paciente: ");
        paciente1.nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        paciente1.edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el número de expediente: ");
        paciente1.numeroExpediente = scanner.nextLine();

        // Mostrar la información del paciente
        System.out.println("\n--- Información del Paciente ---");
        paciente1.mostrarInformacion();

        // Cerrar el Scanner
        scanner.close();
    }
}
