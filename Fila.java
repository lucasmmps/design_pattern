public class Fila {

    private static Fila instancia;

    private Fila() {

    }

    //método para instância única da classe (singleton)
    public static Fila getInstancia() {
        if(instancia == null) {
            instancia = new Fila();
        }

        return instancia;
    }

    public void imprimeDocumento() {

    }

    public void removeDocumento() {

    }

    public void removeDocumentos() {

    }
}
