package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutodataFactory {
    public static ProdutoPojo criarProdutoComumIgualaoValorA(double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("playstationss");
        produto.setProdutoValor(valor);
        List<String> cores = new ArrayList<>();
        cores.add("preto");
        cores.add("branco");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Controle");
        componente.setComponenteQuantidade(1);
        componentes.add(componente);

        produto.setComponentes(componentes);

        return produto;
    }


}
