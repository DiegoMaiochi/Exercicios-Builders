package Ex01_ConstrucaoPizza.builders;

import Ex01_ConstrucaoPizza.entidade.PizzaRefatorado;

public class PizzaBuilder {
    private PizzaRefatorado pizza = new PizzaRefatorado();

    public PizzaBuilder setMassa(String massa){
        this.pizza.setMassa(massa);
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho){
        this.pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder setaddIngrediente(String addIngrediente) {
        this.pizza.setAddIngrediente(addIngrediente);
        return this;
    }

    public PizzaRefatorado build(){
        return this.pizza;
    }
}