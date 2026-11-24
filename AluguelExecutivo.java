package pm_prova2_m;

public class AluguelExecutivo extends Aluguel implements Avaliavel {

    private String nomeMotorista;
    private int nota;

    public AluguelExecutivo(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status, String nomeMotorista) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
        this.nomeMotorista = nomeMotorista;
        this.nota = 0;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Aluguel executivo de " + getNomeCliente() + "nota: " + nota );
        } else {
            System.out.println("Nota inválida! Digite novamente");
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nCliente: " + getNomeCliente());
        System.out.println("\nQuantidade de dias: " + getQuantidadeDias());
        System.out.println("\nValor total: R$ " + getValorTotal());
        System.out.println("\nStatus: " + getStatus());
        System.out.println("Quilometragem: ilimitada");
        System.out.println("\nMotorista particular: " + nomeMotorista);
        System.out.println("\nNota: " + nota);
        System.out.println("\nSeguro incluso: " + (possuiSeguroIncluso() ? "Sim" : "Não"));
        exibirVeiculos();
    }

    @Override
    public boolean possuiSeguroIncluso() {
        return false;
    }

}
