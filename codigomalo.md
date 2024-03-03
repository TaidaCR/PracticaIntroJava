 System.out.print("Quieres modificar alguna nota? Y/N");
    String salida3 = scanner.nextLine();
    if (salida3.equals("Y")){
        for (Alumno alumno : listaAlumnos){
            System.out.print("Alumno: " + alumno.getInfo());
            

        }
    }