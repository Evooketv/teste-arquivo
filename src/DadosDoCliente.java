public class DadosDoCliente {

    private long cnpj;
    private String name;
    private String businessArea;

    public DadosDoCliente(String name, long cnpj, String businessArea) {
        this.name = name;
        this.cnpj = cnpj;
        this.businessArea = businessArea;
    }

    public long getCnpj() {
        return cnpj;
    }

    public String getName() {
        return name;
    }

    public String getBusinessArea() {
        return businessArea;
    }

}
