public class Viaje {

    //MARTA JUMILLA ANTÓN

    private int codViaje;
    private String lugarViaje;
    private int codCole;

    public Viaje(int codViaje, String lugarViaje, int codCole) {
        this.codViaje = codViaje;
        this.lugarViaje = lugarViaje;
        this.codCole = codCole;
    }

    public int getCodViaje() {
        return codViaje;
    }

    public void setCodViaje(int codViaje) {
        this.codViaje = codViaje;
    }

    public String getLugarViaje() {
        return lugarViaje;
    }

    public void setLugarViaje(String lugarViaje) {
        this.lugarViaje = lugarViaje;
    }

    public int getCodCole() {
        return codCole;
    }

    public void setCodCole(int codCole) {
        this.codCole = codCole;
    }

    public boolean validarCodViaje() {
        if (codViaje > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarLugarViaje() {
        if (lugarViaje.length() <= 30) {
            return true;
        }
        return false;
    }

    public boolean validarCodCole() {
        if (codCole > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "codViaje=" + codViaje +
                ", lugarViaje='" + lugarViaje + '\'' +
                ", codCole=" + codCole +
                '}';
    }
}