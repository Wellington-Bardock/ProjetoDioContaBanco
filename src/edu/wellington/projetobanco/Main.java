package edu.wellington.projetobanco;

public class Main {
    public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();

        contaTerminal.cadastrarNome();
        contaTerminal.cadastrarAgencia();
        contaTerminal.cadastrarNumeroConta();
        contaTerminal.cadastrarSaldo();
        contaTerminal.informarResumoConta();

    }
}