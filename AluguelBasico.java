package pm_prova2_m;

public class AluguelBasico extends Aluguel {

    private int limiteKmPorDia;

    public AluguelBasico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
        this.limiteKmPorDia = 100;
    }

    public int getLimiteKmPorDia() {
        return limiteKmPorDia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nCliente: " + getNomeCliente());
        System.out.println("\nQuantidade de dias: " + getQuantidadeDias());
        System.out.println("\nValor total: R$ " + getValorTotal());
        System.out.println("\nStatus: " + getStatus());
        System.out.println("\nQuilometragem: até " + limiteKmPorDia + " km por dia");
        System.out.println("\nSeguro incluso: " + (possuiSeguroIncluso() ? "Sim" : "Não"));
        exibirVeiculos();
    }

    @Override
    public boolean possuiSeguroIncluso() {
        return false;
    }

}
