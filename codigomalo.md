 System.out.print("Quieres modificar alguna nota? Y/N");
    String salida3 = scanner.nextLine();
    if (salida3.equals("Y")){
        for (Alumno alumno : listaAlumnos){
            System.out.print("Alumno: " + alumno.getInfo());
            

        }
    }



    import java.util.InputMismatchException;
import java.util.Scanner;
public class Validador {
    static Scanner input = new Scanner(System.in);
    
    public Validador(){
    }
    
    //IMPLEMENTADO EN NOM, APP Y ASIGN
    public String validadorString(String mensaje){
        String nombre = "";
        boolean pideMas = true;
        while (pideMas){
            try {
                //input.nextLine();
                System.out.print(mensaje);

                nombre = input.nextLine();
                pideMas = false;
            }catch (InputMismatchException e){
                System.out.print("Valor erróneo.  ");
                nombre = input.nextLine();
            }
        }
        return nombre;
    }

    //SIN IMPLEMENTAR AUN, NO FUNCIONABA BIEN
    public Double validadorDouble(String mensaje){
        System.out.print(mensaje);
        Double numero = input.nextDouble();
        boolean pideMas = true;
        while (pideMas){
            if (numero >=0 && numero <=10) {
                pideMas = false;
            }else{
                System.out.print("Valor erróneo, por favor, introduce un valor numérico:  ");
                numero = input.nextDouble();
            }
        }
        return numero;
    }

    public int validadorNumAlumn(){
        int numAlumn = 0;
        boolean siguePidiendo = true;
        while (siguePidiendo)
            try{
                System.out.print("Introduce el numero de alumnos: ");
                numAlumn=input.nextInt();
                input.nextLine();
                siguePidiendo = false;

            }catch (InputMismatchException e){
                System.out.print("Número erróneo. ");
                input.nextLine();
            }

        return numAlumn;
    }
}


//AÑADE EN UNA LISTA TODAS LAS ASIGNATURAS Y SUS NOTAS
    public void addAsignaturaYNotaAArray(String materia, Double nota){
        listadoAsignaturasYNota.add(new Asignaturas(materia, nota));
    }


//SEGUIR CON ESTO