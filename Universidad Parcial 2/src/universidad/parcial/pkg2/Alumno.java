package universidad.parcial.pkg2;

public class Alumno {
    private String Alumno;
    private String Matricula;
    private String [] Materias = new String [7];

    public Alumno(String Alumno, String Matricula, String [] Materias) {
        this.Alumno = Alumno;
        this.Matricula = Matricula;
        this.Materias = Materias;
    }
    
    public Alumno() {
        this.Alumno = "CARLOS DUARTE";
        this.Matricula = "123456";
        this.Materias[0] = "CALCULO";
        this.Materias[1] = "FISICA";
        this.Materias[2] = "PROGRAMACION";
        this.Materias[3] = "COMUNICACION";
        this.Materias[4] = "SISTEMAS";
        this.Materias[5] = "TERMODINAMICA";
        this.Materias[6] = "ARTES";
    }

    public String getAlumno() {
        return Alumno;
    }

    public void setAlumno(String Alumno) {
        this.Alumno = Alumno;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String[] getMaterias() {
        return Materias;
    }

    public void setMaterias(String[] Materias) {
        this.Materias = Materias;
    }
    
    public String InfoAllAlumno(){
        String Cadena = "";
        String Materias = "";
        
        for (int i = 0; i < getMaterias().length-1; i++) {
            Materias = Materias + i + ".- [ " + getMaterias()[i] + " ]\n";
        }
        
        Cadena = "Alumno = " + getAlumno() +
                "\nMatricula = " + getMatricula() +
                "\nMaterias = " + Materias;
        
        return Cadena;
    }
    
}
