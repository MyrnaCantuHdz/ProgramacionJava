import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué quieres hacer? (explorar / esperar):");
        return scanner.nextLine();
    }
}
