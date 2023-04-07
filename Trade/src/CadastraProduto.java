import java.util.ArrayList;

public class CadastraProduto {

    private ArrayList<Produto> ListaDeProdutos;

    public CadastraProduto(){
        ListaDeProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        ListaDeProdutos.add(p);
        
    }
    public void removerProduto(Produto p){
        ListaDeProdutos.remove(p);
    }
    public void verProdutos(){
        if( ListaDeProdutos.size()>0){
            for(Produto produto : ListaDeProdutos){
                System.out.println(produto.toString());
            }
        }else {
            System.out.println("Nenhum Produto Cadastrado!!");
        }

    }
    public Produto procurarProduto(int id) {
        for (Produto produto : ListaDeProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    
}
