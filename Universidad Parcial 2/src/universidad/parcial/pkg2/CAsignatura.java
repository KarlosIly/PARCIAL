package universidad.parcial.pkg2;
import java.util.*;

public class CAsignatura {
    private String ID;
    private String Nombre;
    private CFecha Fecha;       //Llamamos clase CFecha
    private List<CConvocatoria> Convocatorias;

    public CAsignatura(String ID, String Nombre, CFecha Fecha) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Convocatorias = new ArrayList<>();
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

    public CFecha getFecha() {
        return Fecha;
    }

    public void setFecha(CFecha Fecha) {
        this.Fecha = Fecha;
    }

    public List<CConvocatoria> getConvocatorias() {
        return Convocatorias;
    }

    public void setConvocatorias(List<CConvocatoria> Convocatorias) {
        this.Convocatorias = Convocatorias;
    }
    
    public boolean asignarFecha(CFecha Fecha) {     //Llamando desde CFecha
        if (Fecha.fechaCorrecta()) {
            this.Fecha = Fecha;
            return true;
        }
        return false;
    }
    
    public String InfoAllCAsignatura(){
        String Cadena = "";
        
        Cadena = "ID = " + getID() +
                "\nNombre = " + getNombre() +
                "\nFecha = ";
                
                    if (getFecha() != null) {
                        Cadena += getFecha().InfoAllCFecha();
                    } else { 
                        Cadena += "No hay Fecha Aun piolin";
                    }
                    
                        Cadena += "\nConvocatorias:";
                        for (CConvocatoria convocatoria : getConvocatorias()) {
                            Cadena += "\n" + convocatoria.InfoAllCConvocatoria();
                        }
        
        return Cadena;
    }
    
}
