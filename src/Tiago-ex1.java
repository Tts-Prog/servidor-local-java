//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Pessoa {
    String nome;
    String morada;
    int idade;

    public Pessoa(String novoNome, String novaMorada, int novaIdade) {
        this.nome = novoNome;
        this.morada = novaMorada;
        this.idade = novaIdade;
    }
}

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Tiago", "assomada", 10);

        System.out.println("/-----------------Pessoa 1----------------------/");

        System.out.println("nome da pessoa1: " + pessoa1.nome);
        System.out.println("morada da pessoa1: " + pessoa1.morada);
        System.out.println("idade da pessoa1: " + pessoa1.idade);

        System.out.println("/---------------------------------------/");


        System.out.println("Hello World");

        String nome = "Tiago";
        String morada = "Assomada";
        Integer idade = 28;

        System.out.println("Nome: " + nome);
        System.out.println("Morada: " + morada);
        System.out.println("Idade: " + idade);


    }
}





