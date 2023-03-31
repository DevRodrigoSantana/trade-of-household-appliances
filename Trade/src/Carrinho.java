import java.util.ArrayList;

public class Carrinho {
    private int id;
    private ArrayList<Product> productsList = new ArrayList<>();
    private int idCliente;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public ArrayList<Product> getArr(){
        return productsList;
    }
    public void setArr(Product p){
        productsList.add(p);
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }

    public String info(){
        return
            "\nCarrinho Id: " + id +
            "\nLista de produtos: " + productsList +
            "\nCliente Id: " + idCliente + "\n";
    }
}