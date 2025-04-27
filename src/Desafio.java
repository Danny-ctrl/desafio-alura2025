import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Daniele";
        String tipoConta = "Corrente";
        double saldo = 5000;
        int opcao = 0;

        System.out.println("************************");
        System.out.println("\nOlá, " + nome);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n************************");

        String menu = """
                ** Digite a dua opção **
                1 - Consultar Saldo
                2 - Tranferencia
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
        }
    }
}
