import java.util.Scanner;

public class Contador {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean parametrosValidos = false;
        do {
            try {
                System.out.println("Digite o primeiro número:");
                int primeiroNumero = scanner.nextInt();

                System.out.println("Digite o segundo número:");
                int segundoNumero = scanner.nextInt();


                contar(primeiroNumero, segundoNumero);
                parametrosValidos = true;
            } catch (ParametrosInvalidosException exception) {
                System.out.println("O primeiro número deve ser menor do que o segundo número.");
            }
        } while (!parametrosValidos);
        scanner.close();
    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {

        if (primeiroNumero >= segundoNumero){
            throw new ParametrosInvalidosException("O primeiro número deve ser menor do que o segundo número.");
        }

        int contagem = segundoNumero - primeiroNumero;

        for(int i = 1;i <= contagem; i++){
            System.out.printf("Imprimindo o número: %s\n", i);
        }
    }
}
