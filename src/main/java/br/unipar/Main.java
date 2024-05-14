package br.unipar;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(1000d);

        System.out.println("Saldo é : " + contaCorrente.obterSaldo());

        System.out.printf("Numero da Conta é : " + contaCorrente.retornarNumeroConta());

    }
}