import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        // Paso 1: utilizacion de ArrayList para registrar el orden de llegada
        ArrayList<String> muestra = new ArrayList<>();

        muestra.add(" Antocianinas");
        muestra.add(" Betacarotenos");
        muestra.add(" Fenoles");
        muestra.add(" Polifenoles");

        System.out.println(" Muestras recibidas en orden:");
        for (int i = 0; i < muestra.size(); i++) {
            System.out.println((i + 1) + ". " + muestra.get(i));
        }

        // Paso 2: HashSet para obtener las muestras únicas
        HashSet<String> muestraUnica = new HashSet<>(muestra);

        System.out.println("\n Muestras únicas procesadas:");
        for (String especie : muestraUnica) {
            System.out.println("- " + muestra);
        }

        // Paso 3: HashMap para asociar el ID de muestra con el nombre del investigador
        HashMap<String, String> muestraInvestigador = new HashMap<>();

        // TODO: Agrega aquí las asociaciones ID → Investigador
        muestraInvestigador.put("M-001", "Dra. Lopez");
        muestraInvestigador.put("M-002", "Dra. Gomez");
        muestraInvestigador.put("M-003", "Dra. Velazquez");

        System.out.println("\n Asignación de muestra a investigador:");
        for (Map.Entry<String, String> entry : muestraInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Paso 4: Búsqueda de investigador por ID de muestra
        String idBuscar = "M-002"; // Puedes cambiar este valor si lo deseas
        System.out.println("\n Investigador responsable de la muestra " + idBuscar + ": " + muestraInvestigador.get(idBuscar));
    }
}
