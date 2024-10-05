package Ex01_ConstrucaoPizza.entidade;

public class Pizza {
    private String massa = "";
    private String tamanho = "";
    private String addIngrediente = "";

    public Pizza(String massa, String tamanho) {
        this.massa = massa;
        this.tamanho = tamanho;
    }

    public Pizza(String massa, String tamanho, String addingrediente) {
        this.massa = massa;
        this.tamanho = tamanho;
        this.addIngrediente = addingrediente;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setAddIngrediente(String addIngrediente) {
        this.addIngrediente = addIngrediente;
    }
}