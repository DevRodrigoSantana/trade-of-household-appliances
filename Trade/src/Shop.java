import java.util.*;
import javax.swing.JOptionPane;


public class Shop {
    static ArrayList<Customer> listaClientes;
    static ArrayList<Product> listaProdutos;
    // static Map<Product, Integer> carrinho;
    static ArrayList<Trucks> Motorista;
    static ArrayList<Sale> listaVendas = new ArrayList<>();
    


    public static void main(String[] args) throws Exception {

        listaClientes = new ArrayList<Customer>();
        // carrinho = new HashMap<>();
        listaProdutos = new ArrayList<>();
        Motorista = new ArrayList<>();

        Product p1Product = new Product("Geladeira", 130, 5000, 30);
            listaProdutos.add(p1Product);
        Product p2Product = new Product("Guarda-roupa", 90, 2500, 30);
            listaProdutos.add(p2Product);
        Product p3Product = new Product("maquina de lavar roupa", 50, 5000, 30);
            listaProdutos.add(p3Product);
        Trucks Caminhao = new Trucks("1K1OP3", "José");
            Motorista.add(Caminhao);

        menu();
    }

    public static void menu() {
        String printThis = 
            "Bem-Vindo a nossa loja do TIO ZÉ\n\n" + 
            "   0) Sair \n" +
            "   1) Cadastrar Cliente \n" +
            "   2) Listar Produtos \n" +
            "   3) Criar Carrinho \n" +
            "   4) Comprar Carrinho \n" +
            "   5) Ver Clientes \n" +
            "   6) Ver Carrinhos \n" +
            "   7) Ver Vendas \n";

        String opStr = JOptionPane.showInputDialog(null, printThis);
        int op = Integer.parseInt(opStr);

        switch (op) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                listarProdutos();
                break;
            case 3:
                criarCarrinho();
                break;
            case 4:
                comprarCarrinho();
                break;
            case 5:
                listarClientes();
                break;
            case 6:
                listaCarrinhos();
                break;
            case 7:
                listarVendas();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "OPS, ALGO DEU ERRADO!!!!!");
                menu();
        }
    }

    public static void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");

        String cpfStr = JOptionPane.showInputDialog(null, "Digite seu CPF: ");
        int cpf = Integer.parseInt(cpfStr);

        String email = JOptionPane.showInputDialog(null, "Agora digite seu Email para contato: ");

        String endereço = JOptionPane.showInputDialog(null, "Endereço: ");
        
        String distanciaString = JOptionPane.showInputDialog(null, "Digite a distancia Aproximado em KM para loja: ");
        int distancia = Integer.parseInt(distanciaString);

        Customer customer = new Customer(nome, cpf, email, endereço, distancia);
        listaClientes.add(customer);

        menu();
    }

    static ArrayList<Carrinho> listaCarrinhos = new ArrayList<>();
    static int carrinhoIterador = 1;

    public static void criarCarrinho() {
        String cpfString = JOptionPane.showInputDialog(null, "Digite seu cpf: ");
        int cpf = Integer.parseInt(cpfString);
        
        Carrinho car = new Carrinho();

        for (Product p : listaProdutos) {
            String umOuZeroString = JOptionPane.showInputDialog(null, "Se você deseja adicionar " + p.getNome_produto() + " ao carrinho, digite 1. Se não, digite 0:");
            int umOuZero = Integer.parseInt(umOuZeroString);

            if (umOuZero == 1) {    
                car.setArr(p);
            }
        }

        car.setId(carrinhoIterador);
        car.setIdCliente(cpf);

        listaCarrinhos.add(car);
        carrinhoIterador++;
        menu();
    }

    public static void comprarCarrinho() {
        String cpfString = JOptionPane.showInputDialog(null, "Digite seu cpf: ");
        int cpf = Integer.parseInt(cpfString);

        String carrinhoIdString = JOptionPane.showInputDialog(null, "Digite o número do carrinho a ser comprado");
        int carrinhoId = Integer.parseInt(carrinhoIdString);

        for (Customer c : listaClientes) {
            if (c.getCpf() == cpf) {

                for(Carrinho car : listaCarrinhos){
                    if (car.getId() == carrinhoId){
                        
                        listaCarrinhos.remove(car);
                        listaVendas.add(new Sale(c, car));
                        break;
                    }
                }
            }
        }

        menu();
    }  

    static String printClientes = "";
    public static void listarClientes() {
        printClientes = "";
        if (listaClientes.size() > 0) {
            for (Customer cliente : listaClientes) {
                printClientes += cliente.info();
            }

            JOptionPane.showMessageDialog(null, printClientes);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente Cadastrado!!");
        }

        menu();
    }

    static String printProdutos = "";
    public static void listarProdutos() {
        printProdutos = "";
        if (listaProdutos.size() > 0) {
            for (Product product : listaProdutos) {
                printProdutos += product.info();
            }

            JOptionPane.showMessageDialog(null, printProdutos);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Produto Cadastrado!!");
        }
        
        menu();
    }

    static String printCarrinhos = "";
    public static void listaCarrinhos() {
        printCarrinhos = "";
        if (listaCarrinhos.size() > 0) {
            for (Carrinho car : listaCarrinhos) {
                printCarrinhos += "---Carrinho " + listaCarrinhos.indexOf(car) + "---\n" + car.info() + "\n";
            }

            JOptionPane.showMessageDialog(null, printCarrinhos);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum Carrinho Cadastrado!!");
        }


        menu();
    }

    static String printVendas = "";
    public static void listarVendas() {
        printVendas = "";
        if(listaVendas.size() > 0){
            for (Sale s : listaVendas) {
                printVendas += s.info() + "\n";
            }

           JOptionPane.showMessageDialog(null, printVendas);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma venda Cadastrada!!");
        }

        menu();
    }
    

}