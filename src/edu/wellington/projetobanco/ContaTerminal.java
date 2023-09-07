package edu.wellington.projetobanco;

import java.util.Scanner;

public class ContaTerminal {

    public static final String NUMERO_AGENCIA = "Por favor, informar o número da agencia:";
    public static final String INFORMAR_O_NUMERO_DA_CONTA = "Por favor, informar o número da conta:";
    public static final String POR_FAVOR_INFORMAR_O_SALDO = "Por favor, informar o saldo:";
    public static final String INFORMAR_O_SEU_NOME = "Por favor informar o seu nome";
    public static final String MENSAGEM_RESUMO_CONTA = """
            Olá %s;
            Obrigado por criar uma conta em nosso banco!
            Sua agência é: %s
            Sua conta é: %s,
            E seu saldo de: %.2f, já está disponível para saque!""";
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo = 0.0;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarNome () {

        System.out.println(INFORMAR_O_SEU_NOME);

        nomeCliente= scanner.nextLine();
    }

    public void cadastrarAgencia () {

        System.out.println(NUMERO_AGENCIA);

        agencia = scanner.nextLine();
    }

    public void cadastrarNumeroConta () {

        System.out.println(INFORMAR_O_NUMERO_DA_CONTA);

        numero = Integer.parseInt(scanner.nextLine());
    }

    public void cadastrarSaldo () {

        System.out.println(POR_FAVOR_INFORMAR_O_SALDO);

        saldo = Double.parseDouble(scanner.nextLine());
    }

    public void informarResumoConta () {

        System.out.printf(MENSAGEM_RESUMO_CONTA, nomeCliente, agencia, numero, saldo);

    }
}
