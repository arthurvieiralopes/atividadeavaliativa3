import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

import pm_prova2_m.Aluguel;
import pm_prova2_m.StatusVeiculo;
import pm_prova2_m.Veiculo;

public class App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Aluguel> alugueis = new ArrayList<>();

        veiculos.add(new Carro("UGID41", "Hb 20", 2016, 100.0, 35000, StatusVeiculo.DISPONIVEL, 2));
        veiculos.add(new Moto("BH2764", "Honda sivic", 2016, 150.0, 18000, StatusVeiculo.MANUTENCAO, 100));
        veiculos.add(new Van("RJ38920", "Celta", 2020, 90.0, 60000, StatusVeiculo.DISPONIVEL, 5));

        alugueis.add(new AluguelBasico("Arthur Vieira", 4, 0, StatusAluguel.ATIVO));
        alugueis.add(new AluguelExecutivo("Vera Lopes", 5, 0, StatusAluguel.ATIVO, "Adalberto"));

        int opcao = 1;
        boolean encontrado;

        while(continuar != 1) {

            System.out.println("\n1 - Associar veículo a um aluguel");
            System.out.println("\n2 - Exibir todos os veículos");
            System.out.println("\n3 - Exibir todos os aluguéis");
            System.out.println("\n4 - Exibir veículos disponíveis");
            System.out.println("\n5 - Avaliar");
            System.out.println("\n6 - Realizar inspeção");
            System.out.println("\n7 - Remover veículos em manutenção");
            System.out.println("\n0 - Sair");


            System.out.print("\nDigite a opção que deseja: ");
            opcao = sc.nextInt();


        switch (opcao) {

            case 1:

                    break;
            case 2:
                if (veiculos.isEmpty()) {
                    System.out.println("\nNão existem veículos cadastrados");
                    
                 } else {
                    for (Veiculo veiculo : veiculos) {
                        veiculo.exibirDetalhes();
                    }
                 }

                 break;
            case 3:

                 if (alugueis.isEmpty()) {
                    System.out.println("\nNão existem alugueis cadastrados");
                    
                 } else {
                    for (Aluguel aluguel : alugueis) {
                        aluguel.exibirDetalhes();
                    }
                 }


                 break;

            case 4:

                 encontrado = false;

                 for (Veiculo veiculo : veiculos) {
                    if(veiculo.getStatus() == StatusVeiculo.DISPONIVEL) {
                        encontrado = true;
                        veiculo.exibirDetalhes();
                    }
                 }

                 if(!encontrado) {
                    System.out.println("\nNão possui veículos disponíveis");
                 }

                 break;

            case 6:

                 encontrado = false;

                 for (Veiculo veiculo : veiculos) {
                    if(veiculo instanceof Inspecionavel) {
                        encontrado = true;
                        veiculo.realizarInspecao();
                    }
                 }

                 if(!encontrado) {
                    System.out.println("\nNão possui veículos que são inspecionáveis");
                 }


                 break;

            case 7:

                 encontrado = false;

                 Iterator it = veiculos.iterator();
                 while(it.hasNext()) {

                    Veiculo v = it.next();
                    if(v.getStatus() == StatusVeiculo.MANUTENCAO) {
                        encontrado = true;
                        it.remove();
                    }
                 }

                 if(!encontrado) {
                    System.out.println("\nNão possui veículos que estão em manutenção");
                 }

                 break;

            case 0:
                System.out.println("\nFinalizando programa...");
                continuar = 1;
                break;
            
            default:
                System.out.println("\nOpção inválida, digite novamente");
                break;

            

        }


        }



    }

}
