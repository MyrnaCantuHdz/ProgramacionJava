package S3Reto1;
public class Principal {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "P1234567");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        vuelo.reservarAsiento(pasajero1);
        System.out.println();
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println();
        vuelo.cancelarReserva();
        System.out.println();
        System.out.println(vuelo.obtenerItinerario());

        // Reservar asiento nuevamente con datos individuales
        System.out.println();
        vuelo.reservarAsiento("Mario Gonzalez", "P7654321");
        System.out.println();
        System.out.println(vuelo.obtenerItinerario());
    }
}
