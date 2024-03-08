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

    public String setMateria(String valor){
        materia=valor;
        return materia;
    }

    public String getMateria() {
        return materia;
    }

    public double getNota() {
        return nota;
    }
    
    public Double setNota(Double valor) {
        nota=valor;
        return nota;
    }
}


