package universidad.parcial.pkg2;
import java.util.*;

public class CAlumno {
    private String DNI;
    private String Nombre;
    private String Direccion;
    private List<CAsignatura> Asignaturas;

    public CAlumno(String DNI, String Nombre, String Direccion) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Asignaturas = new ArrayList<>();
    }
    
    public CAlumno() {
        this.DNI = "101";
        this.Nombre = "LOZANO";
        this.Direccion = "AV FUNDADORES";
        this.Asignaturas = new ArrayList<>();
        
        Asignaturas.add(new CAsignatura("ID_Artes", "Artes", new CFecha(1, 1, 2022)));
        Asignaturas.add(new CAsignatura("ID_Ciencias", "Ciencias", new CFecha(1, 1, 2022)));
        Asignaturas.add(new CAsignatura("ID_Calculo", "Calculo", new CFecha(1, 1, 2022)));
        Asignaturas.add(new CAsignatura("ID_Comunicacion", "Comunicacion", new CFecha(1, 1, 2022)));
        Asignaturas.add(new CAsignatura("ID_Algebra", "Algebra", new CFecha(1, 1, 2022)));
        Asignaturas.add(new CAsignatura("ID_Sistemas", "Sistemas", new CFecha(1, 1, 2022)));
    }
    
    public CAlumno(String DNI) {
        this.DNI = "DNI";
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public List<CAsignatura> getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(List<CAsignatura> Asignaturas) {
        this.Asignaturas = Asignaturas;
    }
    
        public String InfoAllCAlumno(){
            String Cadena = "";
            
            Cadena = "DNI = " + getDNI() + 
                    "\nNombre = " + getNombre() +
                    "\nDireccion = " + getDireccion() +
                    "\nMaterias = ";
                    
                        for (CAsignatura asignatura : getAsignaturas()) {
                            Cadena += "\n" + asignatura.InfoAllCAsignatura();
                        }
            
            return Cadena;
        }
    
    
    
}
