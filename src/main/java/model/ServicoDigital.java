package model;

public class ServicoDigital extends Servico  {
    public String linkDownload;

    public ServicoDigital(String titulo, String descricao, double preco, Boolean estaAtivo, String linkDownload) {
        super(titulo, descricao, preco, estaAtivo);

        this.linkDownload = linkDownload;
    }
}
