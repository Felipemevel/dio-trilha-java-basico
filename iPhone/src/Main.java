import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorDeInternet;
import Interfaces.ReprodutorMusical;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        atender(new iPhone());
        telaInicial();
    }

    public static void telaInicial(){
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean ligado = true;
        do {
            System.out.println("==============================");
            System.out.println("TELA INICIAL");
            System.out.println("1 - Lista de contatos");
            System.out.println("2 - Reprodutor de música");
            System.out.println("3 - Navegador");
            System.out.println("==============================");

            option = scanner.nextInt();
            if (option < 1 || option >= 4) System.out.println("Opção inválida!");

            switch (option){
                case 1 -> ligar(new iPhone());
                case 2 -> reprodutorMusica(new iPhone());
                case 3 -> navegador(new iPhone());
            }
        } while (option < 1 || option > 3);
    }

    public static void ligar(AparelhoTelefonico aparelhoTelefonico){
        aparelhoTelefonico.ligar();
    }
    public static void atender(AparelhoTelefonico aparelhoTelefonico){
        aparelhoTelefonico.atender();
    }
    public static void navegador(NavegadorDeInternet navegadorDeInternet) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("==============================");
            System.out.println("Navegador de Internet");
            System.out.println("1 - Exibir página atual");
            System.out.println("2 - Recarregar a página");
            System.out.println("3 - Abrir uma nova guia");
            System.out.println("4 - SAIR");
            System.out.println("==============================");

            option = scanner.nextInt();

            if (option < 1 || option > 4) System.out.println("Opção inválida!");
            switch (option){
                case 1 :
                    exibirPagina(new iPhone());
                    navegador(new iPhone());
                case 2 :
                    atualizarPagina(new iPhone());
                    navegador(new iPhone());
                case 3:
                    novaGuia(new iPhone());
                    navegador(new iPhone());
                case 4:
                    reprodutorMusica(new iPhone());
            }
        } while (option < 1 || option > 4);

    }
    public static void exibirPagina(NavegadorDeInternet navegadorDeInternet){
        navegadorDeInternet.exibirPagina("");
    }
    public static void novaGuia(NavegadorDeInternet navegadorDeInternet){
        navegadorDeInternet.adicionarNovaAba();
    }
    public static void atualizarPagina(NavegadorDeInternet navegadorDeInternet){
        navegadorDeInternet.atualizarPagina();
    }

    public static void reprodutorMusica(ReprodutorMusical reprodutorMusical) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("==============================");
            System.out.println("Reprodutor de música");
            System.out.println("1 - Selecionar Música");
            System.out.println("2 - Tocar música aleatória");
            System.out.println("3 - Pausar Música");
            System.out.println("4 - SAIR");
            System.out.println("==============================");

            option = scanner.nextInt();

            if (option < 1 || option > 4) System.out.println("Opção inválida!");
            switch (option){
                case 1 :
                    selecionarMusica(new iPhone());
                case 2 :
                    tocarMusica(new iPhone());
                    reprodutorMusica(new iPhone());
                case 3:
                    pausarMusica(new iPhone());
                    reprodutorMusica(new iPhone());
                case 4:
                    telaInicial();
            }
        } while (option < 1 || option > 4);
    }

    public static void selecionarMusica(ReprodutorMusical reprodutorMusical){
        reprodutorMusical.selecionarMusica("");
    }

    public static void pausarMusica(ReprodutorMusical reprodutorMusical){
        reprodutorMusical.pausarMusica();
    }
    public static void tocarMusica(ReprodutorMusical reprodutorMusical){
        reprodutorMusical.tocarMusica();
    }

}
