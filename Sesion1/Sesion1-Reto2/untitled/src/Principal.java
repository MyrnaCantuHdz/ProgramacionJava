package Sesion1_Reto2;

public class Principal {
    public static void main(String[] args) {
        // Crear dos objetos de tipo Entrada (con el record)
        Entrada entrada1 = new Entrada("Obra Musical", 550.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 700.0);

        // Llamar al metodo mostrarInformacion() para cada entrada
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        // Reto: Generar un registro extra con el record
        Entrada entradaExtra = new Entrada("Obra de Teatro", 300.0);
        entradaExtra.mostrarInformacion();
    }
}
