public class Disciplina {
    private ICalcMedia TipoMedia;
    public double Media;
    private String Nome;
    private double P1;
    private double P2;
    public String Situacao;

    public Disciplina(ICalcMedia tipoMedia) {
        this.TipoMedia = tipoMedia;
    }

    public ICalcMedia getTipoMedia() {
        return TipoMedia;
    }

    public void setTipoMedia(ICalcMedia tipoMedia) {
        this.TipoMedia = tipoMedia;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double media) {
        this.Media = media;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double p1) {
        this.P1 = p1;
    }

    public double getP2() {
        return P2;
    }

    public void setP2(double p2) {
        this.P2 = p2;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String situacao) {
        this.Situacao = situacao;
    }

    public void CalcularMedia() {
        this.Media = TipoMedia.CalculaMedia(this.P1, this.P2);
        this.Situacao = TipoMedia.Situacao(this.Media);
    }
}
