package Hospital;
// Ubicacion paquete
import java.util.Scanner;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Paciente paciente1 = new Paciente(); // Objeto Constructor

        // Nombre
        System.out.print("Ingrese el nombre del paciente: ");
        paciente1.nombre = input.nextLine();
        // edad
        System.out.print("Ingrese la edad del paciente: ");
        paciente1.edad = input.nextInt();
        input.nextLine();
        // Num Paciente
        System.out.print("Ingrese el número de expediente: ");
        paciente1.numeroExpediente = input.nextLine();

        // Impresion de informacion
        System.out.println("\n--- Información del Paciente ---");
        paciente1.mostrarInformacion();
        input.close();
    }
}

