import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Product> productsList = new ArrayList<Product>();

    public static void createProduct(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do produto: ");
        String valorString = JOptionPane.showInputDialog(null, "Digite o valor do produto: ");
        double valorDouble = Double.parseDouble(valorString);
        String pesoString = JOptionPane.showInputDialog(null, "Digite o peso do produto: ");
        double pesoDouble = Double.parseDouble(pesoString);

        productsList.add(new Product(nome, valorDouble, pesoDouble));

        options();
    }

    static String displayProducts = "";
    public static void listProducts(){
        displayProducts = "";

        for(Product p : productsList){
            displayProducts += p.info() + "\n";
        }

        JOptionPane.showMessageDialog(null, displayProducts);
        options();
    }

    public static void updateProduct(){}

    public static void deleteProduct(){
        String idString = JOptionPane.showInputDialog(null, "Digite o id do produto a ser exluído: ");
        int idInt = Integer.parseInt(idString);

        for(Product p : productsList){
            if(p.getId() == idInt){
                productsList.remove(p);
                JOptionPane.showMessageDialog(null, "Produto deletado com sucesso...");
                break;
            }
        }

        options();
    }

    public static void options(){
        try {
            String customerOptionList = "O que deseja fazer? \n 0) Sair \n 1) Criar produto \n 2) Listar produtos \n 3) Atualizar produto \n 4) Deletar produto";

            String opString = JOptionPane.showInputDialog(null, customerOptionList);
            int opInt = Integer.parseInt(opString);

            switch(opInt){
                case 1:
                    createProduct();
                    break;
                case 2:
                    listProducts();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4: 
                    deleteProduct();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    options();
                    break;
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Você digitou uma letra onde um número era esperado. \nTente novamente...");
            options();
        }
    }

    public static void main(String[] args){
        options();
    }
}
