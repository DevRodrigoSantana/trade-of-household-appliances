import java.util.*;


public class Shop {
    static Scanner entrada  = new Scanner (System.in);
    static ArrayList<Customer> listaClientes;
    static ArrayList<Product> listaProdutos;
    static Map<Product,Integer> carrinho;
    static ArrayList<Trucks> Motorista;
    


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
                System.out.println("|              6 -- Sair                          |");
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
                    case 6 :
                        System.out.println("Obrigado pela visita, #VOLTESEMPRE !!");
                        System.exit(0);
                    default :
                        System.out.println("OPS, ALGO DEU ERRADO!!!!!");
                        menu();
                        break;
                }
          }           
    
    public static void cadastrar(){
         System.out.println("\n-------------------------------------------------");
         System.out.println("\nDigite seu nome: ");
         String nomeCliente = entrada.nextLine();
         entrada.nextLine();
         System.out.println("Digite seu CPF: ");
         String cpf = entrada.nextLine();
         System.out.println("Agora digite seu Email para contato: ");
         String emailCliente = entrada.nextLine();
         System.out.println("Enedereço: ");
         String enderço = entrada.nextLine();
         System.out.println("Digite a distancia Aproximado em KM para loja: ");
         int distancia = entrada.nextInt();
         System.out.println("--------------------------------------------------");
         Customer customer = new Customer(nomeCliente, cpf, emailCliente, enderço, distancia);
         listaClientes.add(customer);
         menu();
    } 
    public static void listarProdutos(){
        if( listaProdutos.size()>0){
            for(Product product : listaProdutos){
                System.out.println(product.info());
            }
            menu();
        }
    }  
    public static void  comprar(){

    }
    public static void carrinho(){

    }
    public static void verClientes(){
    }

}