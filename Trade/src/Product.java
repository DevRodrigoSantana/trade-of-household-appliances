public class Product {
    
private static int counter=1;
private int id;
private int quantidade;
private double valor_produto;
private String nome_produto;
private  double peso;

    public Product(String nome_produto, int peso,int valor_produto,int quantidade  ){
        this.id=counter;
        this.nome_produto= nome_produto;
        this.peso=peso;
        this.valor_produto = valor_produto;
        this.quantidade = quantidade;
        Product.counter+=1;
    }
  
    public int getId() {
        return id;
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
    public void setId(int id) {
        this.id = id;
    }
  
    public int getQtl() {
        return quantidade;
    }
    public void setQtl(int quantidade) {
        this.quantidade = quantidade;
    }

    public String info(){
        return "\nID: " + this.getId()+
                "\nNome produto: " + this.getNome_produto()+
                "\nPreço: " + Utilizar.doubletoString(getValor_produto())+
                "\nPeso do Produto: Kg " + this.getPeso() +
                "\nQuantidade atual : " + this.getQtl() + "\n";
    }

}
