// CLASE PRINCIPAL
public class MainNarrativa {
    public static void main(String[] args) {
        // Inyección de dependencias usando interfaces
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();
        TransicionHistoria transicion = new TransicionSimple();

        // Flujo de la narrativa
        dialogo.mostrarDialogo("Estás frente a una cabaña abandonada en el bosque.");

        String eleccion = decision.tomarDecision();

        dialogo.mostrarDialogo("Has decidido: " + eleccion);
        transicion.ejecutarTransicion(eleccion);

        dialogo.mostrarDialogo("La historia continuará...");
    }
}
