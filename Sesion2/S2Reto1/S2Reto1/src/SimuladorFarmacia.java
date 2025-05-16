import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Nombre del medicamento: ");
        var medicamento = sc.nextLine(); // Uso de var para inferencia de tipo

        System.out.print("Precio unitario: $");
        double precio = sc.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = sc.nextInt();

        // Cálculo del total sin descuento
        double totalSinDescuento = precio * cantidad;

        // Verificar si aplica descuento (15% si el total > $500)
        boolean aplicaDescuento = totalSinDescuento > 500;

        // Calcular descuento usando operador ternario
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        // Calcular total final
        double totalFinal = totalSinDescuento - descuento;

        // Mostrar el resumen
        System.out.println("\nResumen de la compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

        sc.close();
    }
}
