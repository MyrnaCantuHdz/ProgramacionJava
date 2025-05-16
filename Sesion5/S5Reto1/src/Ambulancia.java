public class Ambulancia extends UnidadEmergencia {
    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    public Ambulancia(String nombre, String operadorNombre) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operadorNombre);
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
    }
}

