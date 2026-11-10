package model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Pessoa {
    private Double taxaComissao;
    private List<Servico> servicosAVenda;

    public Vendedor(String novoNome, String novaMorada, int novaIdade, double novoSaldo, Double taxaComissao) {
        super(novoNome, novaMorada, novaIdade, novoSaldo);
        this.taxaComissao = taxaComissao;
        this.servicosAVenda = new ArrayList<>();
    }

    public Double getTaxaComissao() {
        return this.taxaComissao;
    }

    public void setTaxaComissao(Double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public List<Servico> getServicosAVenda() {
        return this.servicosAVenda;
    }

    public void publicarServico(Servico novoServico) throws Exception {
        if (novoServico.getPreco() <= 0) {
            throw new Exception("O preço tem de ser superior a zero!");
        }

        this.servicosAVenda.add(novoServico);
        System.out.println("Serviço '" + novoServico.getTitulo() + "' publicado com sucesso!");
    }
}
