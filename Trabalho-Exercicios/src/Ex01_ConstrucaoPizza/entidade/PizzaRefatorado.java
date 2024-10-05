package Ex01_ConstrucaoPizza.entidade;

public class PizzaRefatorado {
    private String massa = "";
    private String tamanho = "";
    private String addIngrediente = "";

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setAddIngrediente(String addIngrediente) {
        this.addIngrediente = addIngrediente;
    }

    @Override
    public String toString() {
        return "Massa: " + this.massa + " " +
                "Tamanho: " + this.tamanho + " " +
                "Ingredientes: " + this.addIngrediente + " ";
    }
}