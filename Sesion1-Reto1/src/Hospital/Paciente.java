package Hospital;

public class Paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    // Metodo publico
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}
