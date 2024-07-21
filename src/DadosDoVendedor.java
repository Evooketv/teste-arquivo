import java.util.ArrayList;
import java.util.List;

public class DadosDoVendedor {

    private long cpf;
    private String name;
    private double salary;
    private List<DadosDeVenda> vendas = new ArrayList<>();


    public DadosDoVendedor(String name, double salary, long cpf) {
        this.name = name;
        this.salary = salary;
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public List<DadosDeVenda> getVendas() {
        return vendas;
    }

    public double totalVendas() {
        double totalVendas = 0;
        for (int i = 0; i < vendas.size(); i++) {
            DadosDeVenda venda = vendas.get(i);
            totalVendas = venda.total() + totalVendas;

        }
        return totalVendas;
    }

}
