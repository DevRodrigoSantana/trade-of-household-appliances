import java.util.ArrayList;

public class Compra {
    private static int counter = 1;

    private int id;
    private ArrayList<Product> listinha = new ArrayList<Product>();
    private Customer dono;

    public Compra(Product p, Customer c){
        this.id = counter;
        this.listinha.add(p);
        this.dono = c;
        Compra.counter += 1;
    }

}
