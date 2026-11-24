package pm_prova2_m;

public class Carro extends Veiculo implements Avaliavel {

    private int quantidadePortas;
    private int nota;

    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status, int quantidadePortas) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.quantidadePortas = quantidadePortas;
        this.nota = 0;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Carro " + getModelo() + "nota: " + nota);
        } else {
            System.out.println("Nota inválida! Digite novamente");
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nPlaca: " + getPlaca());
        System.out.println("\nModelo: " + getModelo());
        System.out.println("\nAno de fabricação: " + getAnoFabricacao());
        System.out.println("\nValor da diária: R$ " + getValorDiaria());
        System.out.println("\nQuilometragem: " + getQuilometragem() + " km");
        System.out.println("\nStatus: " + getStatus());
        System.out.println("\nQuantidade de portas: " + quantidadePortas);
        System.out.println("\nNota: " + nota);
        System.out.println("\nSeguro especial: " + (possuiSeguroEspecial() ? "Sim" : "Não"));
    }

    @Override
    public boolean possuiSeguroEspecial() {
        return false;
    }

}
