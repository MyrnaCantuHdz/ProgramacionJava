package Sesion1_Reto2;
public class Entrada {
    // Atributos
    String nombreEvento;
    double precioEntrada;

    // Constructor que inicializa los atributos
    public Entrada(String nombreEvento, double precioEntrada) {
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precioEntrada);
    }
}
