package universidad.parcial.pkg2;

public class CFecha {
    private int Dia;
    private int Mes;
    private int Year;

    public CFecha(int Dia, int Mes, int Year) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Year = Year;
    }

    public CFecha() {
        this.Dia = 13;
        this.Mes = 04;
        this.Year = 2024;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public boolean esBisiesto() {
        return (getYear() % 4 == 0 && getYear() % 100 != 0) || (getYear() % 400 == 0);
    }

    public boolean fechaCorrecta() {
        if (getMes() < 1 || getMes() > 12 || getMes() < 1)
            return false;
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (getMes() == 2 && esBisiesto())
            return getDia() <= 29;
        return getDia() <= diasPorMes[getMes()];
    }
    
    public String InfoAllCFecha(){
        String Cadena = "";
        
        Cadena = "Dia = " + getDia() +
                "\nMes = " + getMes() +
                "\nYear = " + getYear();
        
        return Cadena;
    }
    
}
