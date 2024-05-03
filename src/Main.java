import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void pedirDados(ArrayList<ContaBancaria> listaContasBancarias){
        Scanner scanner = new Scanner(System.in);
        int numContas = 0;
        do {
            System.out.println("Quantas contas bancarias voce tem?, digite o numero:");
            numContas = scanner.nextInt();
        }while(numContas < 0);
        if (numContas == 0){
            return;
        }
        float saldo = 0;
        for (int i = 0; i <numContas ; i++) {
            System.out.println("Digite o nome da conta: ");
            String nomeConta = scanner.next();
            do {
                System.out.println("Digite o saldo presente nessa conta: ");
                saldo = scanner.nextFloat();
            }while(saldo <= 0);
            System.out.println("Digite o tipo de conta (corrente ou poupança):");
            String tipoConta = scanner.next();
            ContaBancaria conta = new ContaBancaria(nomeConta, saldo, tipoConta);
            listaContasBancarias.add(conta);
        }
    }

    public static int imprimirMenu(int op){
        Scanner scanner = new Scanner(System.in);
        System.out.println("|======================MENU======================|");
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Adicionar valor a saldo especifico");
        System.out.println("3 - Extrair saldo");
        System.out.println("0 - Sair");
        System.out.println("Digite a opção desejada: ");
        do {
            op = scanner.nextInt();
        }while(op < 0 || op > 3);
        return op;
    }

    public static void consultarSaldo(ArrayList<ContaBancaria> listaContasBancarias){
        for (int i = 0; i < listaContasBancarias.size(); i++) {
            ContaBancaria saldoAtual = listaContasBancarias.get(i);
            System.out.println("O saldo atual da conta: "+ saldoAtual.getNome()+ " e " + saldoAtual.getSaldoAtual());
        }
    }

    public static void main(String[] args) {
        int repete = 1;
        int op = 0;
        ArrayList<ContaBancaria> listaContasBancarias = new ArrayList<>();
        pedirDados(listaContasBancarias);
        do {
            op = imprimirMenu(op);
            switch (op) {
                case 1:
                    consultarSaldo(listaContasBancarias);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    repete = 0;
                    break;
                default:
                    break;
            }
        }while(repete != 0);
    }
}