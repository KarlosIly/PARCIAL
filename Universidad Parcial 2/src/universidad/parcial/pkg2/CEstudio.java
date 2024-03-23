package universidad.parcial.pkg2;
import java.util.*;

public class CEstudio {
    private String ID;
    private String Nombre;
    private List<CAlumno> Alumnos;                          //El List Lo empezare a usar ya que es lo que hemos estado haciendo por ejemplo con
                                                            //private String [] Materias = new String [7]; ya que siento que esta forma es mas eficiente

    public CEstudio(String ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Alumnos = new ArrayList<>();
        
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<CAlumno> getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(List<CAlumno> Alumnos) {
        this.Alumnos = Alumnos;
    } 
    
    
}
