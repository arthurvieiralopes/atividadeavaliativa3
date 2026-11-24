package pm_prova2_m;

public class Van extends Veiculo implements Avaliavel, Inspecionavel {

    private int quantidadeMaximaPassageiros;
    private int nota;
    private boolean inspecionada;

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status, int quantidadeMaximaPassageiros) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
        this.nota = 0;
        this.inspecionada = false;
    }

    public int getQuantidadeMaximaPassageiros() {
        return quantidadeMaximaPassageiros;
    }

    public void setQuantidadeMaximaPassageiros(int quantidadeMaximaPassageiros) {
        this.quantidadeMaximaPassageiros = quantidadeMaximaPassageiros;
    }

    public int getNota() {
        return nota;
    }

    public boolean isInspecionada() {
        return inspecionada;
    }

    @Override
    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Van " + getModelo() + " nota: " + nota + ".");
        } else {
            System.out.println("Nota inválida! Digite novamente");
        }
    }

    @Override
    public void realizarInspecao() {
        inspecionada = true;
        System.out.println("\nInspeção realizada na van " + getModelo() + " (" + getPlaca() + ").");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nPlaca: " + getPlaca());
        System.out.println("\nModelo: " + getModelo());
        System.out.println("\nAno de fabricação: " + getAnoFabricacao());
        System.out.println("\nValor da diária: R$ " + getValorDiaria());
        System.out.println("\nQuilometragem: " + getQuilometragem() + " km");
        System.out.println("\nStatus: " + getStatus());
        System.out.println("\nMáximo de passageiros: " + quantidadeMaximaPassageiros);
        System.out.println("\nNota: " + nota);
        System.out.println("\nInspecionada: " + (inspecionada ? "Sim" : "Não"));
        System.out.println("\nSeguro especial: " + (possuiSeguroEspecial() ? "Sim" : "Não"));
    }

    @Override
    public boolean possuiSeguroEspecial() {
        return true;
    }

}
