// Un record es una forma concisa de definir una clase inmutable
public record Entrada_record(String evento, double precio) {
    public void  mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }

}
