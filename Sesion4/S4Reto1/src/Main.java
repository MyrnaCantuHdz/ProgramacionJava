public class Main {
    public static void main(String[] args) {

        // Crear dos facturas con el mismo folio, pero diferentes cliente o total
        Factura f1 = new Factura("FAC001", "Juan Pérez", 1450.0);
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.0);

        // Mostrar ambas facturas
        System.out.println(f1);
        System.out.println(f2);

        // Comparar si son iguales
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
