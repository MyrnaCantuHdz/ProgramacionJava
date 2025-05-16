public class UnidadBomberos extends UnidadEmergencia {
    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    public UnidadBomberos(String nombre, String operadorNombre) {
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
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
    }
}
