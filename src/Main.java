public class Main {
    public static void main(String[] args) {

        LeituraArquivo leitura = new LeituraArquivo();
        leitura.lerArquivo("C:\\Users\\Marcelo\\Desktop\\Dados.dat");

        Estatistcas estatistcas = new Estatistcas
                (leitura.getVendedores(),leitura.getClientes(),leitura.getVendas());

        EscritaArquivo escritaArquivo = new EscritaArquivo(estatistcas);

        escritaArquivo.escrita("C:\\Users\\Marcelo\\Desktop\\Dados.done.dat");





    }
}
