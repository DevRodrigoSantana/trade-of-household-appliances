public class Product {
    
private static int counter=1;
private int id;
private double valor_produto;
private String nome_produto;
private  double peso;

    public Product(String nome_produto, int valor, int peso,int valor_produto  ){
        this.id=counter;
        this.nome_produto= nome_produto;
        this.peso=peso;
        this.valor_produto = valor_produto;
        Product.counter+=1;

    }

  
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

   
    public String getNome_produto() {
        return nome_produto;
    }

  
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    
    public double getValor_produto() {
        return valor_produto;
    }

   
    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }

    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String info(){
        return "\nID: " + this.getId()+
                "\nProduto: " + this.nome_produto+
                "\nPreço: " + this.getValor_produto()+
                "\nPeso do Produto: Kg " + this.getPeso();
    }
}
