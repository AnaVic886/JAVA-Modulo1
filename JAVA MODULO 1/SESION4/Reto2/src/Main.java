public class Main {
    public static void main(String[] args) {

        Declaracionimpuestos declaracion = new Declaracionimpuestos("XAXX010101000", 8700.0);

        Cuentafiscal cuenta = new Cuentafiscal("XAXX010101000", 9500.0);

        System.out.println(" Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println(" ¿RFC válido para esta cuenta?: " + rfcValido);
    }
}