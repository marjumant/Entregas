public class Ciudades {
    //Marta Jumilla Antón

    private int codciudad;
    private String nomciudad;

    public Ciudades(int codciudad, String nomciudad) {
        this.codciudad = codciudad;
        this.nomciudad = nomciudad;
    }

    public int getCodciudad() {
        return codciudad;
    }

    public void setCodciudad(int codciudad) {
        this.codciudad = codciudad;
    }

    public String getNomciudad() {
        return nomciudad;
    }

    public void setNomciudad(String nomciudad) {
        this.nomciudad = nomciudad;
    }

    public boolean validarCodciudad() {
        if (codciudad > 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean validarNomciudad() {
        if (nomciudad.matches("^[a-zA-Z\\s]+$")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ciudades{" +
                "codciudad=" + codciudad +
                ", nomciudad='" + nomciudad + '\'' +
                '}';
    }
}