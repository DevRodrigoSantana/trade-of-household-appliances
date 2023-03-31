public class Sale {
    private Customer cliente;
    private Product produto;

    public Customer getCustomer(){
        return cliente;
    }
    public void setCustomer(Customer cliente){
        this.cliente = cliente;
    }

    public Product getProduct(){
        return produto;
    }
    public void setProduct(Product produto){
        this.produto = produto;
    }

    public String info(){
        return "---Cliente---:" + this.cliente.info() + "---Produto---:" + this.produto.info();
    }
}
