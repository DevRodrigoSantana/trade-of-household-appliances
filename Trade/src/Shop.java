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
       Product p1Product = new Product("Geladeira", 5000);
       listaProdutos.add(p1Product);
       Product p2Product = new Product("Guarda-roupa",2000);
       listaProdutos.add(p2Product);
       Product p3Product = new Product("maquina de lavar roupa",2000);
       listaProdutos.add(p3Product);
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
                        comprarProdutos();
                        break;
                    case 4:
                        carrinho();
                        break;
                    case 5 :
                        verClientes();
                        break;
                    case 6 :
                        System.out.println("Obrigado pela visita!!\n#VOLTESEMPRE !!");
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
         System.out.println("--------------------------------------------------");
         Customer customer = new Customer(nomeCliente, cpf);
         listaClientes.add(customer);
         menu();
    } 
    public static void listarProdutos(){
        if( listaProdutos.size()>0){
            for(Product product : listaProdutos){
                System.out.println(product);
            }
            
        }else {
            System.out.println("Nenhum Produto Cadastrado!!");

        }
        menu();
    }  
    public static void  comprarProdutos(){
        if (listaProdutos.size()>0){
           

            System.out.println("|               Produtos Disponiveis             |");

            for (Product produto : listaProdutos){
                System.out.println(produto + "\n");
            }
            System.out.println("Digite o IDENTIFICADOR do produto");
            int id = Integer.parseInt(entrada.next());
            boolean presente = false;

            for (Product produto : listaProdutos){
                if (produto.getId()==id){
                   int qtd = 0;
                   try {
                    qtd= carrinho.get(produto);
                    carrinho.put(produto, qtd+1);

                    
                   } catch (NullPointerException e) {
                    carrinho.put(produto, 1);
                    
                   }
                   System.out.println(" Adicionado com sucesso ");
                   presente=true;

                   if (presente){
                    System.out.println("-------------------------------------------");
                    System.out.println("Deseja adicionar outro pruto ao carrinho ?");
                    System.out.println("\n|          1--sim      \n|          2--nao");
                    int  opcao = Integer.parseInt(entrada.next());

                    if(opcao==1){
                        comprarProdutos();
                    }else {
                        System.out.println("Finalizando compra");
                        finalizarCompra();
                    }
                
                    }
                }else{
                    System.out.println("Produto não encontrado");
                    menu();
                }
            }
        }else{
            System.out.println("Não tem Produtos cadastrados!");
        }

    }
    public static void carrinho(){
        System.out.println("------------Produtos no meu Carrinho---------------");
        if (carrinho.size()>0){
            for(Product produto :carrinho.keySet()){
                System.out.println("Produto: "+ produto+ "\nQuantidade: "+ carrinho.get(produto));


            }

        }else{
            System.out.println("Carrinho VAZIO!!");
        }
        menu();


    }
    public static void verClientes(){
        if ( listaClientes.size()>0){
            for(Customer cliente : listaClientes){
                System.out.println(cliente);

            }

        }else{
            System.out.println("Nenhum cliente Cadastrado!!");
        }
        menu();
    }

    static void finalizarCompra(){
        Double valorTotal =0.0;
        System.out.println("Seus Produtos");
        for (Product produto : carrinho.keySet()){
            int qtd = carrinho.get(produto);
            valorTotal+= produto.getValor_produto()*qtd;
            System.out.println(produto);
            System.out.println("Quantidade " + qtd );
            System.out.println("--------------------------------------------");

        }
        System.out.println("O valor de sua Compra é : "+ Utilizar.doubletoString(valorTotal));
        carrinho.clear();

    }
    

}