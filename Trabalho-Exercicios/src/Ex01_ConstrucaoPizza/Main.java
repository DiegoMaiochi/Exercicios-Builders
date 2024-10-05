package Ex01_ConstrucaoPizza;

import Ex01_ConstrucaoPizza.builders.PizzaBuilder;
import Ex01_ConstrucaoPizza.entidade.PizzaRefatorado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executa Refatorado");
        executarRefatorado();
    }

    private static void executarRefatorado(){
        PizzaRefatorado pizzaCalabresa = new PizzaBuilder()
                .setMassa("Siciliana")
                .setaddIngrediente("Calabresa")
                .setTamanho("Média")
                .build();

        PizzaRefatorado pizzaFrango = new PizzaBuilder()
                .setMassa("Napolitana")
                .setaddIngrediente("Frango")
                .setTamanho("Grande")
                .build();

        PizzaRefatorado pizzaMussarela = new PizzaBuilder()
                .setMassa("Chicagoana")
                .setaddIngrediente("Mussarela")
                .setTamanho("Pequena")
                .build();

        System.out.println(pizzaCalabresa.toString());
        System.out.println(pizzaFrango.toString());
        System.out.println(pizzaMussarela.toString());
    }
}