package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        ContaBanco contaBanco = new ContaBanco();

        System.out.println("Criando uma conta de banco");
        System.out.println("---------------------------");
        System.out.println("Entre com o nome");

        String name = terminal.nextLine();
        contaBanco.setNomeCliente(name);

        System.out.println("Entre com o valor do depósito");
        double deposito = terminal.nextDouble();
        contaBanco.setSaldo(deposito);

        Random rand = new Random();
        int numeroContaBanco = rand.nextInt(50);
        contaBanco.setNumero(numeroContaBanco);
        contaBanco.setAgencia("001-5");

        System.out.println("Conta criada com sucesso!");
        System.out.println(contaBanco);
    }
}