import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorDeInternet;
import Interfaces.ReprodutorMusical;

import java.util.Scanner;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {
    @Override
    public void ligar() {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("==============================");
            System.out.println("Selecione para quem você deseja ligar:");
            System.out.println("1 - Rafael --- +55 84 8822-6633");
            System.out.println("2 - Natália --- +55 84 9633-5050");
            System.out.println("3 - Andressa --- +55 84 9966-5566");
            System.out.println("4 - SAIR");
            System.out.println("==============================");

            option = scanner.nextInt();

            if (option < 1 || option > 4) System.out.println("Opção inválida!");

            switch(option){
                case 1 :
                    System.out.println("==============================\n"
                        + "Ligando para Rafael...\n"
                        + "==============================");
                    Main.telaInicial();
                case 2 :
                    System.out.println("==============================\n"
                        + "Ligando para Natália...\n"
                        + "==============================");
                    Main.telaInicial();
                case 3 :
                    System.out.println("==============================\n"
                        + "Ligando para Andressa...\n"
                        + "==============================");
                    Main.telaInicial();
                case 4 :
                    Main.telaInicial();
            }

        } while (option < 1 || option > 4);

    }

    @Override
    public void atender() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("==============================");
            System.out.println("Alguém está ligando para você!");
            System.out.println("1 - Atender");
            System.out.println("2 - Desligar");
            System.out.println("==============================");

            option = scanner.nextInt();

            if (option < 1 || option > 2) System.out.println("Opção inválida!");

            switch(option){
                case 1 :
                    System.out.println("==============================\n"
                            + "Você atendeu a ligação\n"
                            + "==============================");
                    break;
                case 2 :
                    System.out.println("==============================\n"
                            +"Você desligou a ligação");
                    iniciarCorreioVoz();
                    System.out.println("==============================");
                    Main.telaInicial();

            }
        } while (option < 1 || option > 2);

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz: Náo foi possível atender a sua ligação no momento.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("==============================\n"
                + "https://web.dio.me/home\n"
                + "==============================");
        Main.navegador(new iPhone());


    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("==============================\n"
                + "Nova aba adicionada!\n"
                + "==============================");
        Main.navegador(new iPhone());
    }

    @Override
    public void atualizarPagina() {
        System.out.println("==============================\n"
                + "Página atualizada com sucesso! Nada novo.\n"
                + "==============================");
        Main.navegador(new iPhone());
    }

    @Override
    public void tocarMusica() {
        System.out.println("==============================\n"
                + "Tocando música aleatória...\n"
                + "==============================");
        Main.reprodutorMusica(new iPhone());

    }

    @Override
    public void pausarMusica() {
        System.out.println("==============================\n"
                + "Música pausada.\n"
                + "==============================");
        Main.reprodutorMusica(new iPhone());
    }

    @Override
    public void selecionarMusica(String musica) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("==============================");
            System.out.println("Selecione a música desejada:");
            System.out.println("1 - HIGHEST IN THE ROOM - Travis Scott");
            System.out.println("2 - Ballin'(With Roddy Ricch - Mustard, Roddy Ricch)");
            System.out.println("3 - Black Hole Sun - Soundgarden");
            System.out.println("4 - SAIR");
            System.out.println("==============================");

            option = scanner.nextInt();

            if (option < 1 || option > 4) System.out.println("Opção inválida!");

            switch (option) {
                case 1 :
                    System.out.println("==============================\n"
                        + "Tocando agora: HIGHEST IN THE ROOM - Travis Scott\n"
                        + "==============================");
                    Main.telaInicial();
                case 2 :
                    System.out.println("==============================\n"
                        + "Tocando agora: Ballin'(With Roddy Ricch - Mustard, Roddy Ricch)\n"
                        + "==============================");
                    Main.telaInicial();
                case 3 :
                    System.out.println("==============================\n"
                        + "Tocando agora: Black Hole Sun - Soundgarden\n"
                        + "==============================");
                    Main.telaInicial();
                case 4 :
                    Main.reprodutorMusica(new iPhone());
            }

        } while (option < 1 || option > 4);
    }
}
