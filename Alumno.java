import java.util.Map;
import java.util.HashMap;
import java.text.DecimalFormat;

public class Alumno {
    private String nombre;
    private String apellidos;
    String asignatura;
    HashMap<String, Double> asignaturaYNota = new HashMap<>();
   
    //Constructor
    public Alumno (String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    //DEVUELVE NOMBRE Y APELLIDOS CONCATENADOS
    public String getInfo(){
        return nombre + " " + apellidos;
    }
    
    //AÑADE ASIGN Y NOTA A HASHMAP ASIGNATURAYNOTA
    public void añadirAsignaturaYNota(String materia, Double nota){
        asignaturaYNota.put(materia, nota);
    }

    //HACE EL PROMEDIO DE NOTAS
    public String notaMedia(){
        double sumaDeNotas=0;
        double longitud=asignaturaYNota.size();
        for (Double nota:asignaturaYNota.values()){
            sumaDeNotas+=nota;
        }
        double promedio = sumaDeNotas/longitud;
        DecimalFormat df = new DecimalFormat("#.##");
        String promedioString= df.format(promedio);
        return promedioString;
    }

    //DEVUELVE EL BOELTIN
    public String mostrarBoletin(String promedio ){

        StringBuilder sb = new StringBuilder();
        
        sb.append("\n");
        sb.append("Asignatura             Nota\n");
        sb.append("----------------------------\n");
        
        for (Map.Entry<String, Double> entry : asignaturaYNota.entrySet()){
            String asignatura = entry.getKey();
            String nota = Double.toString(entry.getValue());
            sb.append(String.format(asignatura+"          "+nota+"\n"));
        }

        sb.append("----------------------------\n");
        sb.append("Nota media:         " + promedio);
        sb.append("    \n");
        sb.append("    \n");

        return sb.toString();
    }
}
    
