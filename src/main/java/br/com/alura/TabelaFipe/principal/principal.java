package br.com.alura.TabelaFipe.principal;

import br.com.alura.TabelaFipe.service.ConsumoApi;

import java.net.URL;
import java.util.Scanner;

public class principal {

    private Scanner leitura = new Scanner(System.in);

    private ConsumoApi consumo = new ConsumoApi();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibirMenu(){
        var menu = """
                *** OPCOES ***
                carros
                caminhoes
                motos
                
                Digite uma das opcoes:
                """;

        System.out.println(menu);
        var opcao = leitura.nextLine();
        String tipo = "";
        String endereco = "";

        if(opcao.contains("carr")){
            tipo = "carros";
            endereco = URL_BASE + "carros/marcas";
        }else if(opcao.contains("mot")){
            tipo = "motos";
            endereco = URL_BASE + "motos/marcas";
        }else{
            tipo = "caminhoes";
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = consumo.obterDados(endereco);
        System.out.println(json);

        var menu2 = """
                    *** Digite o codigo da marca desejada:
                    """;
            System.out.println(menu2);
            var codigo = leitura.nextLine();
            String endereco2 = URL_BASE + tipo + "/marcas/" + codigo + "/modelos/";

            var json1 = consumo.obterDados(endereco2);
            System.out.println(json1);
    }
}
