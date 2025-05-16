public class Principal {
        public static void main(String[] args) {
            // Crear un objeto utilizando el constructor
            Entrada en = new Entrada("Concierto",  5000);

            // método para mostrar la información
            en.mostrarInformacion();

            //record
            Entrada_record en2 = new Entrada_record("Peliculas",  50);
            en2.mostrarInformacion();
        }
    }


