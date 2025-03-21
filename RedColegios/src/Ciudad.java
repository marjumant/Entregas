public class Ciudad {

    //MARTA JUMILLA ANTÓN

    private int codciudad;
    private String nomciudad;

    public Ciudad(int codciudad, String nomciudad) {
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
        return codciudad > 0;
    }

    public boolean validarNomciudad() {
        return nomciudad != null &&
                nomciudad.matches("^[a-zA-Z]{1,30}$");
    }

    @Override
    public String toString() {
        return "Ciudades{" +
                "codciudad=" + codciudad +
                ", nomciudad='" + nomciudad + '\'' +
                '}';
    }

    public String XML() {
        return "<Ciudades>" +
                "    <codciudad>" + codciudad + "</codciudad>" +
                "    <nomciudad>" + nomciudad + "</nomciudad>" +
               "</Ciudades>";
    }
}
