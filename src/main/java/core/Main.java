package core;

import model.Servico;
import model.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Tiago", "assomada", 10, 2000.0);
        Pessoa pessoa2 = new Pessoa("Elvis", "assomada", 10, 21000.0);

        System.out.println("/-----------------Pessoa 1----------------------/");

        System.out.println("nome da pessoa1: " + pessoa1.getNome());
        System.out.println("morada da pessoa1: " + pessoa1.getMorada());
        System.out.println("idade da pessoa1: " + pessoa1.getIdade());

        System.out.println("/---------------------------------------/");

        System.out.println("Hello World");

        String nome = "Tiago";
        String morada = "Assomada";
        Integer idade = 28;

        System.out.println("Nome: " + nome);
        System.out.println("Morada: " + morada);
        System.out.println("Idade: " + idade);

        pessoa1.setSaldo(3000);
        System.out.println("Saldo 1: " + pessoa1.getSaldo());
        System.out.println("Saldo 2: " + pessoa2.getSaldo());

        Servico servico1 = new Servico("aula de conducao", "aulas personalizadas", 10, true);

        try {
            pessoa1.comprarServico(servico1);
        } catch(Exception e) {
            System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
        }


        servico1.aplicarDesconto(10);

        servico1.verificarDisponibilidade();

        double saldoAtual = pessoa1.getSaldo();

    }
}
