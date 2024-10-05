package Ex02_ConstrucaoVeiculo.Builders;

import Ex02_ConstrucaoVeiculo.Entidade.VeiculoRefatorado;

public class VeiculoBuilder {
    private VeiculoRefatorado veiculo = new VeiculoRefatorado();

    public VeiculoBuilder setTipo(String tipo){
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor(String cor){
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setRodas(String rodas) {
        this.veiculo.setRodas(rodas);
        return this;
    }

    public VeiculoRefatorado build(){
        return this.veiculo;
    }
}