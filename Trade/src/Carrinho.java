import java.util.HashMap;

public class Carrinho {
    private HashMap<Produto, Integer> listaDoCarrinho;
    

    public Carrinho() {
        listaDoCarrinho = new HashMap<>();
    }
    public void adicionarProduto(Produto produto, int quantidade){
        if(listaDoCarrinho.containsKey(produto)){
            int qtdAtual = listaDoCarrinho.get(produto);
            listaDoCarrinho.put(produto,qtdAtual + quantidade);
        }else{
            listaDoCarrinho.put(produto, quantidade);

        }

    }
    public void removerProduto(Produto produto,int quatidade){
        if(listaDoCarrinho.containsKey(produto)){
            int qtdAtual= listaDoCarrinho.get(produto);
            if(qtdAtual>quatidade){
                listaDoCarrinho.put(produto, qtdAtual-quatidade);

            }else{
                listaDoCarrinho.remove(produto);
            }

        }

    }
    public void listarCarrinho(){
        for(Produto produto:listaDoCarrinho.keySet()){
            int quantidade= listaDoCarrinho.get(produto);
            Double precototal =  produto.getPreco() * quantidade;
            System.out.println(produto.getNome() + " x" + quantidade + " - R$ " + Utilizar.doubletoString(precototal));


        }
    }
    public void listarCarrinhodesconto(){
        double valortotal = 0.0;
        
        
       
        for(Produto p : listaDoCarrinho.keySet()){
            for(int i = 0; i< listaDoCarrinho.get(p);i++){
                valortotal += p.getPreco();
            }
         }
         double valordesc= 0.9;
         double valorTotDesc =valordesc*valortotal;
         
        

        
        System.out.println("Valor total   desc   =        "+Utilizar.doubletoString(valorTotDesc));
         
    }

    public boolean Carrinhovazio(){
        boolean  vazio = true;
        if(listaDoCarrinho.size()>0){
            vazio = false;
        }
        return vazio;
    }
    public void ValorToatal(){
        double valor = 0.0;
       
            for(Produto p : listaDoCarrinho.keySet()){
                for(int i = 0; i< listaDoCarrinho.get(p);i++){
                    valor += p.getPreco();
            }
           
        }
        System.out.println("Valor total      =        "+ valor);
    }
    public void apagarCarrinho(){
        listaDoCarrinho.clear();
    }
}