package exercicioInterfaceCompraCartao.caixa;

import exercicioInterfaceCompraCartao.impressao.Imprimivel;
import exercicioInterfaceCompraCartao.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {
    private  double valorTotal;
    private String produto;
    private String nomeCliente;

    @Override
    public String getCabecalhoPagina() {
        return getProduto()+ " = " +this.getValorTotal();
    }

    @Override
    public String getCorpoPagina() {
        return getNomeCliente();
    }

    @Override
    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}

