package model;

public class Servico {
    private String titulo;
    private String descricao;
    private double preco;
    private Boolean estaAtivo;

    public Servico(String titulo, String descricao, double preco, Boolean estaAtivo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.estaAtivo = estaAtivo;
    }

    public String getTitulo() { return this.titulo; }
    public double getPreco() { return this.preco; }
    public String getDescricao() { return this.descricao; }
    public Boolean getEstaAtivo() { return this.estaAtivo; }

    public void setPreco(double preco) { this.preco = preco; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setEstaAtivo(Boolean estaAtivo) { this.estaAtivo = estaAtivo; }

    public void aplicarDesconto(double percentagem) {
        double valorDesconto = (this.preco * percentagem) / 100;

        this.preco = this.preco - valorDesconto;

        System.out.println("Desconto Aplicado com sucesso!");
        System.out.println("valor final: " + this.preco);
    }

    public void verificarDisponibilidade() {
        if (this.estaAtivo) {
            System.out.println("Servico " + this.titulo + " esta disponivel!");
        } else {
            System.out.println("Servico " + this.titulo + " nao esta disponivel!");
        }
    }
}
