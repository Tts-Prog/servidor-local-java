package model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String morada;
    private int idade;
    private double saldo;

    public List<Servico> servicosComprados;

    public Pessoa(String novoNome, String novaMorada, int novaIdade, double novoSaldo) {
        this.nome = novoNome;
        this.morada = novaMorada;
        this.idade = novaIdade;
        this.saldo = novoSaldo;

        this.servicosComprados = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return this.morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void comprarServico(Servico servicoEscolhido) throws Exception {
        if (this.saldo < servicoEscolhido.getPreco() || !servicoEscolhido.getEstaAtivo()) {
            System.out.println("Erro: Saldo insuficiente ou serviço inativo.");
            throw new Exception("Erro: Saldo Insuficiente ou Servico Inativo");
        }

        this.saldo -= servicoEscolhido.getPreco();
        this.servicosComprados.add(servicoEscolhido);
        System.out.println("Compra efetuada com sucesso");
    }

    public void mostrarHistorico() {
        System.out.println("//----------Lista de servicos comprados ------------//");

        for(Servico s: this.servicosComprados) {
            System.out.println("Servico: " + s.getTitulo());
        }
    }
}
