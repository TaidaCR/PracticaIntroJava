import java.util.Scanner;
import java.util.ArrayList;

public class Asignaturas {
    private String materia;
    private Double nota;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Asignaturas>listadoAsignaturasYNota=new ArrayList<>();
   
    //CONSTRUCTOR
    public Asignaturas(String materia, Double nota) {
        this.materia = materia;
        this.nota = nota;
    }
    //AÑADE EN UNA LISTA TODAS LAS ASIGNATURAS Y SUS NOTAS
    public void addAsignaturaYNotaAArray(String materia, Double nota){
        listadoAsignaturasYNota.add(new Asignaturas(materia, nota));
    }

    public String getMateria() {
        return materia;
    }

    public double getNota() {
        return nota;
    }
    
    public String setNota(Double nota) {
        String nota1;
        this.nota = nota;
        nota1= Double.toString(nota);
        return nota1;
    }
}


