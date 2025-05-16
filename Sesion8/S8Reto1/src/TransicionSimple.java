
public class TransicionSimple implements TransicionHistoria {
    @Override
    public void ejecutarTransicion(String decision) {
        switch (decision.toLowerCase()) {
            case "explorar":
                System.out.println("🌲 Transición: Te adentras en el bosque oscuro...");
                break;
            case "esperar":
                System.out.println("⏳ Transición: Decides esperar a que algo ocurra...");
                break;
            default:
                System.out.println("❓ Transición: No se reconoce la decisión...");
        }
    }
}
