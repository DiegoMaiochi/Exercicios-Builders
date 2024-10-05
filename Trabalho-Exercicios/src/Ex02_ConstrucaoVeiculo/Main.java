package Ex02_ConstrucaoVeiculo;

import Ex02_ConstrucaoVeiculo.Builders.VeiculoBuilder;
import Ex02_ConstrucaoVeiculo.Entidade.VeiculoRefatorado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executa Refatorado");
        executarRefatorado();
    }

    private static void executarRefatorado() {
        VeiculoRefatorado celtaVermelho = new VeiculoBuilder()
                .setTipo("Celta")
                .setCor("Vermelho")
                .setRodas("4 Rodas")
                .build();

        VeiculoRefatorado fuscaPreto = new VeiculoBuilder()
                .setTipo("Moto")
                .setCor("Azul")
                .setRodas("2 Rodas")
                .build();

        System.out.println(celtaVermelho.toString());
        System.out.println(fuscaPreto.toString());
    }
}
