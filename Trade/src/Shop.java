import java.util.*;

public class Shop {
    static Scanner entrada  = new Scanner (System.in);
    static ArrayList<Customer> listaClientes;
    static ArrayList<Product> listaProdutos;
    static Map<Product, Integer> carrinho;
    static ArrayList<Trucks> Motorista;
    static ArrayList<Sale> listaVendas = new ArrayList<>();
    public static void main(String[] args) throws Exception {
       listaClientes = new ArrayList<Customer>();
       carrinho = new HashMap<>();
       listaProdutos = new ArrayList<>();
       Motorista = new ArrayList<>();
       Product p1Product = new Product("Geladeira", 130, 5000, 30);
       listaProdutos.add(p1Product);
       Product p2Product = new Product("Guarda-roupa", 90, 2500, 30);
       listaProdutos.add(p2Product);
       Product p3Product = new Product("maquina de lavar roupa", 50, 5000, 30);
       listaProdutos.add(p3Product);
       Trucks Caminhao = new Trucks("1K1OP3","José");
       Motorista.add(Caminhao);
       menu();
    }

    public static void menu(){
        
        System.out.println("---------------------------------------------------");
        System.out.println("|        Bem-Vindo a nossa loja do TIO ZÉ         |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              1 -- Cadastrar                     |");
        System.out.println("|              2 -- Listar Produtos               |");
        System.out.println("|              3 -- Comprar                       |");
        System.out.println("|              4 -- Carrinho                      |");
        System.out.println("|              5 -- Ver Clientes                  |");
        System.out.println("|              6 -- Ver Carrinhos                 |");
        System.out.println("|              7 -- Ver Vendas                    |");
        System.out.println("|              0 -- Sair                          |");
        int op = entrada.nextInt(); 

        switch(op) {
            case 1: 
                cadastrar();
                break;
            case 2:
                listarProdutos();
                break;
            case 3:
                comprar();
                break;
            case 4:
                carrinho();
                break;
            case 5 :
                verClientes();
                break;
            case 6:
                listaCarrinhos();
                break;
            case 7:
                listarVendas();
                break;
            case 0:
                System.out.println("Obrigado pela visita, #VOLTESEMPRE !!");
                System.exit(0);
                break;
            default :
                System.out.println("OPS, ALGO DEU ERRADO!!!!!");
                menu();
        }
    }           

    public static void cadastrar(){
         System.out.println("\n-------------------------------------------------");
         System.out.println("\nDigite seu nome: ");
         String nomeCliente = entrada.nextLine();
         entrada.nextLine();
         System.out.println("Digite seu CPF: ");
         int cpf = entrada.nextInt();
         System.out.println("Agora digite seu Email para contato: ");
         entrada.nextLine();
         String emailCliente = entrada.nextLine();
         System.out.println("Enedereço: ");
         String enderço = entrada.nextLine();
         System.out.println("Digite a distancia Aproximado em KM para loja: ");
         int distancia = entrada.nextInt();
         entrada.nextLine();
         System.out.println("--------------------------------------------------");
         Customer customer = new Customer(nomeCliente, cpf, emailCliente, enderço, distancia);
         listaClientes.add(customer);
         menu();
    } 

    public static void  comprar(){
        System.out.println("Digite seu cpf:");
        int cpf = entrada.nextInt();

        System.out.println("Digite o número do carrinho a ser comprado");
        int carrinhoId = entrada.nextInt();
        
        for(Customer c : listaClientes){
            if(c.getCpf() == cpf){
                for (Product p : carrinho.keySet()) {
                    if(carrinho.get(p) == carrinhoId){
                        Sale venda = new Sale();
                        
                        venda.setCustomer(c);
                        venda.setProduct(p);

                        listaVendas.add(venda);

                        System.out.println("Produto " + p.getNome_produto() + " comprado por: " + c.getCpf() + " com sucesso!");

                        break;
                    }
                }
            }
        }
        menu();
    }

    // static ArrayList<Product> listaProdutosDoCarrinho; Usaria num array bi-dimensional
    static int carrinhoIterador = 1;

    public static void carrinho(){
        for(Product p : listaProdutos){
            System.out.println("Se você deseja adicionar " + p.getNome_produto() + " ao carrinho, digite 1. Se não, digite 0:");
            int umOuZero = entrada.nextInt();

            if(umOuZero == 1){
                carrinho.put(p, carrinhoIterador);
                carrinhoIterador++;
                System.out.println("Produto adicionado com sucesso!");
                break;
            }
        }
        menu();
    }

    public static void verClientes(){
        if (listaClientes.size() > 0){
            for(Customer cliente : listaClientes){
                System.out.println(cliente);
            }
        } else{
            System.out.println("Nenhum cliente Cadastrado!!");
        }
        menu();
    }

    public static void listarProdutos(){
        if( listaProdutos.size()>0){
            for(Product product : listaProdutos){
                System.out.println(product.info());
            }
        }else {
            System.out.println("Nenhum Produto Cadastrado!!");
        }
        menu();
    }  

    public static void listaCarrinhos(){
        for (Product i : carrinho.keySet()) {
            System.out.println("Produto do carrinho: " + i.info() + "\n---Código do carrinho---: " + carrinho.get(i) + "\n");
        }
        menu();
    }
        
    public static void listarVendas() {
        for(Sale s : listaVendas){
            System.out.println(s.info());
        }
        menu();
    }
}