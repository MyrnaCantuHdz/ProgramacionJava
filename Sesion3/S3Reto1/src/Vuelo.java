package S3Reto1;
public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Método para reservar asiento con objeto Pasajero
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            System.out.println("✅ Reserva realizada con éxito.");
            return true;
        } else {
            System.out.println("⚠️ El asiento ya está reservado.");
            return false;
        }
    }

    // Sobrecarga: método para reservar asiento con datos individuales
    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevo = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevo);
    }

    // Método para cancelar la reserva
    public void cancelarReserva() {
        if (asientoReservado != null) {
            System.out.println("❌ Cancelando reserva...");
            asientoReservado = null;
        } else {
            System.out.println("⚠️ No hay reserva para cancelar.");
        }
    }

    // Método para mostrar el itinerario
    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        info += "Pasajero: ";
        if (asientoReservado != null) {
            info += asientoReservado.getNombre();
        } else {
            info += "[Sin reserva]";
        }
        return info;
    }
}
