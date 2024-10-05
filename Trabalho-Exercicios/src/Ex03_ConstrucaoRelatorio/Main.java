package Ex03_ConstrucaoRelatorio;


import Ex03_ConstrucaoRelatorio.Builders.RelatorioBuilder;
import Ex03_ConstrucaoRelatorio.Entidade.RelatorioRefatorado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executa Refatorado");
        executarRefatorado();
    }

    private static void executarRefatorado() {
        RelatorioRefatorado relatorioPadrao = new RelatorioBuilder()
                .setTitulo("Este é o titulo do email padrão")
                .setCorpo("Este é o corpo do email padrão")
                .build();

        RelatorioRefatorado relatorioCompleto = new RelatorioBuilder()
                .setTitulo("Este é o titulo do email completo")
                .setCorpo("Este é o corpo do email completo")
                .setRodape("Este é o rodape do email completo")
                .build();

        System.out.println(relatorioPadrao.toString());
        System.out.println(relatorioCompleto.toString());
    }
}
