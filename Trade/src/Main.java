import javax.swing.*;
import java.util.ArrayList;

public class Main {

    static ArrayList<Customer> customersList = new ArrayList<Customer>();
    static int customersListIterator = 0;

    public static void createCustomer(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ");
        String telefoneString = JOptionPane.showInputDialog(null, "Digite o telefone do cliente: ");
        int telefoneInt = Integer.parseInt(telefoneString);

        customersList.add(new Customer());

        customersList.get(customersListIterator).setCustomer_id(customersListIterator);
        customersList.get(customersListIterator).setnome(nome);
        customersList.get(customersListIterator).setTel(telefoneInt);

        customersListIterator++;
        options();
    }

    static String displayCustomers;
    public static void listCustomers(){
        displayCustomers = "";

        for(Customer cust : customersList){
            displayCustomers += cust.info();
        }

        JOptionPane.showMessageDialog(null, displayCustomers);

        options();
    }

    public static void updateCustomer(){}

    public static void deleteCustomer(){
        String idString = JOptionPane.showInputDialog(null, "Digite o id do cliente para excluí-lo: ");
        int idInt = Integer.parseInt(idString);

        for(Customer cust : customersList){
            if(cust.getCustomer_id() == idInt){
                customersList.remove(cust);
                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso...");
                break;
            }
        }

        options();
    }

    public static void options(){
        try {
            String customerOptionList = "O que deseja fazer? \n 0) Sair \n 1) Criar cliente \n 2) Listar clientes \n 3) Atualizar cliente \n 4) Deletar cliente";

            String opString = JOptionPane.showInputDialog(null, customerOptionList);
            int opInt = Integer.parseInt(opString);

            switch(opInt){
                case 1:
                    createCustomer();
                    break;
                case 2:
                    listCustomers();
                    break;
                case 3:
                    updateCustomer();
                    break;
                case 4: 
                    deleteCustomer();
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
