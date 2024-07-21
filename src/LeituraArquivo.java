import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivo {

    private List<DadosDoVendedor> vendedores = new ArrayList<>();
    private List<DadosDoCliente> clientes = new ArrayList<>();
    private List<DadosDeVenda> vendas = new ArrayList<>();

    public List<DadosDoVendedor> getVendedores() {
        return vendedores;
    }

    public List<DadosDoCliente> getClientes() {
        return clientes;
    }

    public List<DadosDeVenda> getVendas() {
        return vendas;
    }

    public void lerArquivo(String nomeArquivo) {



        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split("ç");
                if (colunas[0].equals("001")) {
                    String name = colunas[2];
                    double salary = Double.parseDouble(colunas[3]);
                    long cpf = Long.parseLong(colunas[1]);

                    DadosDoVendedor vendedor = new DadosDoVendedor(name, salary, cpf);
                    vendedores.add(vendedor);
                }
                if (colunas[0].equals("002")) {
                    String name = colunas[2];
                    String businessArea = colunas[3];
                    long cnpj = Long.parseLong(colunas[1]);

                    DadosDoCliente cliente = new DadosDoCliente(name, cnpj, businessArea);
                    clientes.add(cliente);
                }
                if (colunas[0].equals("003")) {
                    int saleId = Integer.parseInt(colunas[1]);
                    String[] colunas2 = colunas[2].substring(1, colunas[2].length() - 1).split(",");
                    String salesman = colunas[3];
                    List<Item> itens = new ArrayList<>();

                    DadosDoVendedor vendedor = null;

                    for ( int i=0; i < vendedores.size();i++){
                        DadosDoVendedor vendedorAtual = vendedores.get(i);
                        if (vendedorAtual.getName().equals(salesman)){
                            vendedor = vendedorAtual;
                        }

                    }
                    for (int i = 0; i < colunas2.length; i++) {
                        String[] colunas3 = colunas2[i].split("-");
                        int itemId = Integer.parseInt(colunas3[0]);
                        int itemQuantity = Integer.parseInt(colunas3[1]);
                        double itemPrice = Double.parseDouble(colunas3[2]);
                        Item item = new Item(itemId, itemQuantity, itemPrice);
                        itens.add(item);

                    }

                    DadosDeVenda venda = new DadosDeVenda(saleId, itens, salesman);

                    venda.setVendedor(vendedor);
                    vendedor.getVendas().add(venda);


                    vendas.add(venda);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
