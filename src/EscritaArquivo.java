import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscritaArquivo {

    private Estatistcas dados;

    public EscritaArquivo(Estatistcas dados) {
        this.dados = dados;
    }

    public void escrita(String path) {
     try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path))) {
         buffWrite.append("Quantidade de clientes: " + dados.quantClientes() +
                 "\n" );
         buffWrite.append("Quantidade de vendedores: " + dados.quantVendedores() +
                 "\n");
         buffWrite.append("ID da venda mais cara: " + dados.vendaCara() +
                 "\n");
         buffWrite.append("O pior vendedor: " + dados.píorVendedor() +
                 "\n");


     } catch (IOException e) {
         throw new RuntimeException(e);
     } ;


    }



}
