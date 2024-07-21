import java.util.List;

public class Estatistcas {
    private List<DadosDoVendedor> vendedores;
    private List<DadosDoCliente> clientes;
    private List<DadosDeVenda> vendas;

    public Estatistcas(List<DadosDoVendedor> vendedores,
                       List<DadosDoCliente> clientes,
                       List<DadosDeVenda> vendas) {
        this.vendedores = vendedores;
        this.clientes = clientes;
        this.vendas = vendas;
    }

    public int quantClientes() {
        return clientes.size();
    }

    public int quantVendedores() {
        return vendedores.size();
    }

    public int vendaCara() {
        DadosDeVenda vendaMaisCara = vendas.get(0);

        for (int i = 1; i < vendas.size(); i++) {
            DadosDeVenda vendaAtual = vendas.get(i);
            if (vendaAtual.total() > vendaMaisCara.total()) {
                vendaMaisCara = vendaAtual;
            }
        }
        return vendaMaisCara.getSaleId();
    }

    public String píorVendedor() {
        DadosDoVendedor piorVendedor = vendedores.get(0);

        for (int i = 1; i < vendedores.size(); i++){
            DadosDoVendedor vendedorAtual = vendedores.get(i);
            if (vendedorAtual.totalVendas() < piorVendedor.totalVendas()){
                piorVendedor = vendedorAtual;
            }
        }

        return piorVendedor.getName();
    }


  //  }

}