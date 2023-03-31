public class Sale {
    private Customer cliente;
    private Carrinho car;

    public Sale(Customer cliente, Carrinho car){
        this.cliente = cliente;
        this.car = car;
    }

    public Customer getCustomer(){
        return cliente;
    }
    public void setCustomer(Customer cliente){
        this.cliente = cliente;
    }

    public Carrinho getProduct(){
        return car;
    }
    public void setProduct(Carrinho car){
        this.car = car;
    }

    public String info(){
        return "---Cliente---:" + this.cliente.info() + "---Carrinho---:" + this.car.info();
    }
}
