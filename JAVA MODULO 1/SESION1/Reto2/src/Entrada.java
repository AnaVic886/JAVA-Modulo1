public class Entrada {
    String evento;
    double precio;

    public Entrada(String evento, double precio){
        this.evento = evento;
        this.precio = precio;
    }
    // cuando utilizamos un record ya no es necesario utilizar el constructor porque se define automaticamente

    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}
