package pm_prova2_m;

public class AluguelPremium extends Aluguel {

    public AluguelPremium(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nCliente: " + getNomeCliente());
        System.out.println("\nQuantidade de dias: " + getQuantidadeDias());
        System.out.println("\nValor total:  " + getValorTotal());
        System.out.println("\nStatus: " + getStatus());
        System.out.println("Quilometragem: ilimitada");
        System.out.println("\nSeguro incluso: " + (possuiSeguroIncluso() ? "Sim" : "Não"));
        exibirVeiculos();
    }

    @Override
    public boolean possuiSeguroIncluso() {
        return true;
    }

}
