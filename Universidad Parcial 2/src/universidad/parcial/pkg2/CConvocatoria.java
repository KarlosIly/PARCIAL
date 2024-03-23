package universidad.parcial.pkg2;

public class CConvocatoria {
    private int Convocatoria;
    private String Fecha;
    private int Nota;

    public CConvocatoria(int Convocatoria, String Fecha, int Nota) {
        this.Convocatoria = Convocatoria;
        this.Fecha = Fecha;
        this.Nota = Nota;
    }

    public CConvocatoria() {
        this.Convocatoria = 1;
        this.Fecha = "22/03/24";
        this.Nota = 7;
    }
    
    public int getConvocatoria() {
        return Convocatoria;
    }

    public void setConvocatoria(int Convocatoria) {
        this.Convocatoria = Convocatoria;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }
    
    public String InfoAllCConvocatoria(){
        String Cadena = "";
        
        Cadena = "Convocatoria = " + getConvocatoria() +
                "\nFecha = " + getFecha() +
                "\nNota = " + getNota();
        
        return Cadena;
    }
    
}
