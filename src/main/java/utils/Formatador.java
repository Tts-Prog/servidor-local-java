package utils;

import model.Pessoa;
import model.Servico;
import model.ServicoDigital;
import model.Vendedor;

import java.util.List;

public class Formatador {

    public void imprimirPessoa(Pessoa pessoa) {
        System.out.println("//------- Dados de: " + pessoa.getNome() + "-------//");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Morada: " + pessoa.getMorada());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Saldo: " + pessoa.getSaldo());

        System.out.println("//------------------------------------------------//");
    }

    public void imprimirServico(Servico servico) {
        System.out.println("//------- servico: " + servico.getTitulo() + "-------//");

        System.out.println("Titulo: " + servico.getTitulo());
        System.out.println("Descricao: " + servico.getDescricao());
        System.out.println("Preco: " + servico.getPreco());
        System.out.println("Estado: " + servico.getEstaAtivo());

        System.out.println("//------------------------------------------------//");
    }

    public void imprimirVendedor(Vendedor vendedor) {
        System.out.println("//------- vendedor: " + vendedor.getNome() + "-------//");

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Morada: " + vendedor.getMorada());
        System.out.println("Idade: " + vendedor.getIdade());
        System.out.println("Saldo: " + vendedor.getSaldo());
        System.out.println("Taxa de Comissao: " + vendedor.getTaxaComissao());

        System.out.println("//------------------------------------------------//");
    }

    public void imprimirServicoDigital(ServicoDigital servicoDigital) {
        System.out.println("//------- servicoDigital: " + servicoDigital.getTitulo() + "-------//");

        System.out.println("Titulo: " + servicoDigital.getTitulo());
        System.out.println("Descricao: " + servicoDigital.getDescricao());
        System.out.println("Preco: " + servicoDigital.getPreco());
        System.out.println("Estado: " + servicoDigital.getEstaAtivo());
        System.out.println("Link de Download: " + servicoDigital.linkDownload);

        System.out.println("//------------------------------------------------//");
    }

    public void imprimirListaDeServicosComprados(Pessoa pessoa) {
        List<Servico> listaDeServicos = pessoa.servicosComprados;

        System.out.println("//------ Servicos comprados por: " + pessoa.getNome() + " ------//");

        if (!listaDeServicos.isEmpty()) {
            for (Servico s: listaDeServicos) {
                System.out.println("Servico: " + s.getTitulo());
            }
        }

        System.out.println("//------------------------------------------------------------//");
    }

    public void imprimirListaServicosAVenda(Vendedor vendedor) {

    }
}
