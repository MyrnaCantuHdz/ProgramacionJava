package Sesion1_Reto2;

public record Entrada_Record(String nombreEvento, double precioEntrada) {

    // El constructor y el metodo toString() son generados automáticamente por el record
    // No es necesario escribirlos manualmente

    // Metodo para mostrar la información, podemos sobrescribir toString si es necesario
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento() + " | Precio: $" + precioEntrada());
    }
}
