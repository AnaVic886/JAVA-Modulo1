package Hospital;

public class Paciente {
    // Atributos
    String nombre;
    int edad;
    String numerodeexpediente;

    public void mostrarInformacion() {
        System.out.printf("Informacion del(la) paciente: " );
        System.out.printf(" Paciente:" + nombre );
        System.out.printf(" Edad:" + edad );
        System.out.printf(" Expediente:" + numerodeexpediente );
    }
}
//solo los metodos main se pueden ejecutar