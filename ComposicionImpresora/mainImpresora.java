public class mainImpresora {
    public static void main(String[] args) {
        Toner toner = new Toner(50);
        Impresora impresoraDobleCara = new Impresora(0,true);
        Impresora impresoraUnaCara = new Impresora(0, false);

        toner.getNivelTinta();
        toner.añadirTinta();
        impresoraUnaCara.impresionPaginas();

        toner.getNivelTinta();
        toner.añadirTinta();
        impresoraDobleCara.impresionPaginas();
    }
}
