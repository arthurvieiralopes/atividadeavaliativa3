package pm_prova2_m;

public class Moto extends Veiculo implements Inspecionavel {

    private int cilindrada;
    private boolean inspecionada;

    public Moto(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status, int cilindrada) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.cilindrada = cilindrada;
        this.inspecionada = false;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isInspecionada() {
        return inspecionada;
    }

    @Override
    public void realizarInspecao() {
        inspecionada = true;
        System.out.println("\nInspeção realizada na moto " + getModelo() + " (" + getPlaca() + ").");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nPlaca: " + getPlaca());
        System.out.println("\nModelo: " + getModelo());
        System.out.println("\nAno de fabricação: " + getAnoFabricacao());
        System.out.println("\nValor da diária: R$ " + getValorDiaria());
        System.out.println("\nQuilometragem: " + getQuilometragem() + " km");
        System.out.println("\nStatus: " + getStatus());
        System.out.println("\nCilindrada: " + cilindrada + " cc");
        System.out.println("\nInspecionada: " + (inspecionada ? "Sim" : "Não"));
        System.out.println("\nSeguro especial: " + (possuiSeguroEspecial() ? "Sim" : "Não"));
    }

    @Override
    public boolean possuiSeguroEspecial() {
        return false;
    }

}
