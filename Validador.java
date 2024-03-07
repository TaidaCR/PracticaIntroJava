import java.util.InputMismatchException;
import java.util.Scanner;
public class Validador {
    static Scanner input = new Scanner(System.in);
    
    public Validador(){
    }
    
    //IMPLEMENTADO EN NOM, APP Y ASIGN
    public String validadorString(String mensaje){
        System.out.print(mensaje);
        String nombre = input.nextLine();
        boolean pideMas = true;
        while (pideMas){
            if (nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ -]+")){
                pideMas = false;
            }else{
                System.out.print("Valor erróneo, por favor, introduce letras:  ");
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

//SEGUIR CON ESTO