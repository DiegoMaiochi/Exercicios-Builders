package Ex03_ConstrucaoRelatorio.Entidade;

public class RelatorioRefatorado {
    private String titulo = "";
    private String corpo = "";
    private String rodape = "";

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    @Override
    public String toString() {
        return this.titulo + "\n" + this.corpo + "\n" + this.rodape + "\n";
    }
}
