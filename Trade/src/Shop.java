import java.util.*;


public class Shop {
    static Scanner entrada  = new Scanner (System.in);
    static ArrayList<Customer> listaClientes;
    static ArrayList<Product> listaProdutos;
    static Map<Product,Integer> carrinho;
    static ArrayList<Trucks> Mototrita;
    


    public static void main(String[] args) throws Exception {
       listaClientes = new ArrayList<Customer>();
       carrinho = new HashMap<>();
       listaProdutos = new ArrayList<>();
       Product p1Product = new Product("Geladeira", 130, 5000, 30);
       listaProdutos.add(p1Product);
       Product p2Product = new Product("Guarda-roupa", 90, 2500, 30);
       listaProdutos.add(p2Product);
       Product p3Product = new Product("maquina de lavar roupa", 50, 5000, 30);
       listaProdutos.add(p3Product);
       Trucks Caminhao = new Trucks("1K1OP3","José");
       Mototrita.add(Caminhao);
       

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
    } 
    public static void listarProdutos(){

    }  
    public static void  comprar(){

    }
    public static void carrinho(){

    }
    public static void verClientes(){

    }

}