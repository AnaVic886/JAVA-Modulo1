package Hospital;

 import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // se crea un objeto
        Scanner input = new Scanner(System.in);
        Paciente pa= new Paciente();

        // Solicitar y asignar los datos
        System.out.print("📝 Indique el nombre del paciente: ");
        pa.nombre = input.nextLine();// habilita el tecladoytodo lo que se capture se guarda y limpia

        System.out.print("🧮 Indique la edad: ");
        pa.edad = input.nextInt();//limpia el buffer solo lo guarda
        input.nextLine();//limpia el buffer

        System.out.print("📁 Indique el numero del expediente: ");
        pa.numerodeexpediente = input.nextLine();

        //siempre cerrar el scanner
        input.close();

        //imprimir los datos
        pa.mostrarInformacion();

    }
}
