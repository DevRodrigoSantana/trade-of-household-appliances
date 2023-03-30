// public class CustomerFunctions {
//     String customerOptionList = "O que deseja fazer? \n 0) Sair \n 1) Criar cliente \n 2) Listar clientes \n 3) Atualizar cliente \n 4) Deletar cliente";

//     static ArrayList<Customer> customersList = new ArrayList<Customer>();
//     static int customersListIterator = 0;

//     public static void createCustomer(){
//         String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ");
        
//         String telefoneString = JOptionPane.showInputDialog(null, "Digite o telefone do cliente: ");
//         int telefoneInt = Integer.parseInt(telefoneString);

//         String distanciaString = JOptionPane.showInputDialog(null, "Digite a distância: ");
//         int distanciaInt = Integer.parseInt(distanciaString);

//         customersList.add(new Customer());

//         customersList.get(customersListIterator).setCustomer_id(customersListIterator);
//         customersList.get(customersListIterator).setnome(nome);
//         customersList.get(customersListIterator).setTel(telefoneInt);
//         customersList.get(customersListIterator).setDistancia(distanciaInt);

//         customersListIterator++;
//         options();
//     }

//     static String displayCustomers;
//     public static void listCustomers(){
//         displayCustomers = "";

//         for(Customer cust : customersList){
//             displayCustomers += cust.info();
//         }

//         JOptionPane.showMessageDialog(null, displayCustomers);

//         Truck ll = new Truck();

//         JOptionPane.showMessageDialog(null, ll.info());

//         options();
//     }

//     public static void updateCustomer(){}

//     public static void deleteCustomer(){
//         String idString = JOptionPane.showInputDialog(null, "Digite o id do cliente para excluí-lo: ");
//         int idInt = Integer.parseInt(idString);

//         for(Customer cust : customersList){
//             if(cust.getCustomer_id() == idInt){
//                 customersList.remove(cust);
//                 JOptionPane.showMessageDialog(null, "Cliente removido com sucesso...");
//                 break;
//             }
//         }

//         options();
//     }

    
// }
