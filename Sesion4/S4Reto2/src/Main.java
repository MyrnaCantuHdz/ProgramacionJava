public class Main {
    public static void main(String[] args) {

        // Crear declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());

        // Crear cuenta fiscal con RFC y saldo
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);
        cuenta.mostrarInfo();

        // Validar si el RFC coincide
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
