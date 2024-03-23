package universidad.parcial.pkg2;
import java.util.*;

public class UniversidadParcial2 {

    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        
        String DNI, Nombre, Direccion;
        boolean AggAsignatura;
        String IDAsignatura, NombreAsignatura, Continuar;
        int Dia, Mes, Year;
        
        String IDAlumno;
        
        int op;
        do {
            System.out.println("\nMatricular.");
            System.out.println("Poner notas");
            System.out.println("Mostrar expedientes");
            System.out.println("Salir");
            System.out.print("Opción: ");
            op = text.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el DNI del Alumno = ");
                    DNI = text.next();
                    System.out.println("Ingrese el Nombre del Alumno = ");
                    Nombre = text.next();
                    System.out.println("Ingrese la Direccion del Alumno = ");
                    Direccion = text.next();
                    
                    CAlumno alumno = new CAlumno(DNI, Nombre, Direccion);
                    List<CAsignatura> Asignaturas = new ArrayList<>(); 
                    
                        do {
                            
                            System.out.println("Ingrese el ID de la asignatura:");
                            IDAsignatura = text.next();
                            System.out.println("Ingrese el nombre de la asignatura:");
                            NombreAsignatura = text.next();
                            
                            System.out.println("Ingrese el día de matriculación de la asignatura:");
                            Dia = text.nextInt();
                            System.out.println("Ingrese el mes de matriculación de la asignatura:");
                            Mes = text.nextInt();
                            System.out.println("Ingrese el año de matriculación de la asignatura:");
                            Year = text.nextInt();
                            
                            CFecha fechaMatriculacion = new CFecha(Dia, Mes, Year);
                            Asignaturas.add(new CAsignatura(IDAsignatura, NombreAsignatura, fechaMatriculacion));

                        System.out.println("¿Desea agregar otra asignatura? (s/n)");
                        Continuar = text.next();
                        AggAsignatura = Continuar.equalsIgnoreCase("s");
                        
                        } while (AggAsignatura);
                    
                    alumno.setAsignaturas(Asignaturas);
                        
                    break;
                case 2:
                    System.out.println("Ingrese el ID del Alumno = ");
                    IDAlumno = text.next();
                    break;
                case 3:
                    mostrarExpedientes();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (op != 4);
    }
}

