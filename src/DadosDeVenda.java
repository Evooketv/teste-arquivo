import java.util.List;

public class DadosDeVenda {

    private int saleId;
    private List<Item> items;
    private String salesman;
    private DadosDoVendedor vendedor;



    public DadosDeVenda(int saleId, List<Item> items, String salesman) {
        this.saleId = saleId;
        this.items = items;
        this.salesman = salesman;
    }

    public DadosDoVendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(DadosDoVendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getSaleId() {
        return saleId;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getSalesman() {
        return salesman;
    }

    public double total() {
        double total = 0;
        for ( int i=0; i < items.size(); i++){
            Item item = items.get(i);
            total = item.subTotal() + total;
        }
        return total;
    }

}
