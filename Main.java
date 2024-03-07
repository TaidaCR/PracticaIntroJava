import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();
        Double nota;
        String nombre = "";
        String apellidos = "";
        Validador validador = new Validador();

        //System.out.print("Introduce el numero de alumnos: ");
        int numAlumn=validador.validadorNumAlumn();
        //scanner.nextLine();

        

        for (int i = 1; i <= numAlumn ; i++){
        
            nombre = validador.validadorString("Introduce el nombre: ");
            apellidos = validador.validadorString("Introduce los apellidos: ");
            Alumno alumno = new Alumno(nombre, apellidos); 
            listaAlumnos.add(alumno);
            
            String materia=" ";
            while (!materia.equals("e")){
                materia = validador.validadorString("Introduce la asignatura o pulsa -e- para terminar: ");
                if (materia.equals("e")){
                    break;
                }
                System.out.print("Añade una nota: ");
                nota = scanner.nextDouble();
                //scanner.nextLine();

                alumno.añadirAsignaturaYNota(materia, nota);
                scanner.nextLine();
                
            }
        }
        //AÑADIR ASIGN Y NOTA A ALUMNO
        for (Alumno alumno : listaAlumnos) {
            System.out.print("ALUMNA/O: " + alumno.getInfo());
            System.out.print(alumno.mostrarBoletin(alumno.notaMedia()));
        }

        //MODIFICAR NOTA
        
        boolean siguePidiendo = true;
        while (siguePidiendo){
            System.out.print("Desea modificar alguna asingatura?: --Y/N--");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("y")){
                for (Alumno alumno: listaAlumnos){
                    alumno.modificarAsignaturas();
                }
            }else if (respuesta.equalsIgnoreCase("n")){
                System.out.print("Evaluación terminada.");
                siguePidiendo = false;
                break;
            }else{
                System.out.print("Valor erróneo. Por favor, introduzca Y/N.");
                respuesta = scanner.nextLine();
                siguePidiendo = true;
            }
        }

        for (Alumno alumno : listaAlumnos) {
            System.out.print("     BOLETIN MODIFICADO");
            System.out.print("ALUMNA/O: " + alumno.getInfo());
            System.out.print(alumno.mostrarBoletin(alumno.notaMedia()));
        }
    }

}