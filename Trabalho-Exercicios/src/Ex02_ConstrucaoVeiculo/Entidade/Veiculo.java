package Ex02_ConstrucaoVeiculo.Entidade;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private String rodas = "";

    public Veiculo(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public Veiculo(String tipo, String cor, String rodas) {
        this.tipo = tipo;
        this.cor = cor;
        this.rodas = rodas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }
}
