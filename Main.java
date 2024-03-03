import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();
        String materia = " ";
        Double nota;
        String nombre = "";
        String apellidos = "";
        
        System.out.print("Introduce el numero de alumnos: ");
        int numAlumn=scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numAlumn ; i++){
        
            System.out.print("Introduce el nombre del alumno: ");
            nombre = scanner.nextLine();
            System.out.print("Introduce los apellidos del alumno: ");
            apellidos = scanner.nextLine();
            Alumno alumno = new Alumno(nombre, apellidos); 

            String salida2="";
            while (!salida2.equals("e")){
                System.out.print("Añade una asignatura o pulsa -e- para salir: ");
                materia = scanner.nextLine();
                if (materia.equals("e")){
                    break;
                }
                System.out.print("Añade una nota: ");
                nota = scanner.nextDouble();
                scanner.nextLine();

                alumno.añadirAsignaturaYNota(materia, nota);
            }

            listaAlumnos.add(alumno);
        }
        //AÑADIR ASIGN Y NOTA A ALUMNO
        for (Alumno alumno : listaAlumnos) {
            System.out.print("Alumno: " + alumno.getInfo());
            System.out.print(alumno.mostrarBoletin(alumno.notaMedia()));
        }
    }
}