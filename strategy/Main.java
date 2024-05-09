public class Main {
    public static void main(String[] args) {
        Disciplina PadroesDev = new Disciplina(new Aritmetica());
        PadroesDev.setNome("Padroes de Desenvolvimento");
        PadroesDev.setP1(10); PadroesDev.setP2(5);PadroesDev.CalcularMedia();
        PadroesDev.CalcularMedia();
        System.out.println(
                String.format("Disciplina: %s - P1:%.2f P2:%.2f Media:%.2f  Situacao: %s",
                        PadroesDev.getNome(), PadroesDev.getP1(), PadroesDev.getP2(), PadroesDev.getMedia(), PadroesDev.getSituacao())
        );

        Disciplina EngSoft3 = new Disciplina(new Geometrica());
        EngSoft3.setNome("Engenharia de Software 3");
        EngSoft3.setP1(10); EngSoft3.setP2(5);EngSoft3.CalcularMedia();
        EngSoft3.CalcularMedia();
        System.out.println(
                String.format("Disciplina: %s  - P1:%.2f P2:%.2f Media:%.2f  Situacao: %s",
                        EngSoft3.getNome(), EngSoft3.getP1(), EngSoft3.getP2(), EngSoft3.getMedia(), EngSoft3.getSituacao())
        );
    }
}
