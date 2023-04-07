import java.util.Scanner;

public class Mercado {
    
    static Scanner entrada = new Scanner(System.in);
    static CadastraProduto cadastraProduto = new CadastraProduto();
    static  CadastroCliente cadastroCliente = new CadastroCliente();
    static Carrinho carrinho = new Carrinho();

    public static void main(String[] args) {
        
        
       

        cadastraProduto.adicionarProduto(new Produto(1, "Geladeira", 5000));
        cadastraProduto.adicionarProduto(new Produto(2, "Fogao", 1500));
        cadastraProduto.adicionarProduto(new Produto(3, "TV SANSUNG 50", 3000));
        menu();

    }

    public static void menu(){
        
        System.out.println("---------------------------------------------------");
        System.out.println("|        Bem-Vindo a nossa loja do TIO ZÉ         |");
        System.out.println("---------------------------------------------------");
        System.out.println("|              1 -- Cadastrar                     |");
        System.out.println("|              2 -- Listar Produtos               |");
        System.out.println("|              3 -- Comprar                       |");
        System.out.println("|              4 -- Ver Carrinhos                 |");
        System.out.println("|              5 -- remover produto do carrinho   |");
        System.out.println("|              6 -- Pagamento                     |");
        System.out.println("|              0 -- Sair                          |");
        int op = entrada.nextInt();

        switch(op) {
            case 1: 
                Cadastrar();
                break;
            case 2:
                Produtos();
                break;
            case 3:
                comprar();
                break;
            case 4:
                Vercarrinho();
                break;
            case 5 :
                removerProduto();
                break;
            case 6 :
                pagamento();
                break;
            case 0 :
                System.out.println("Obrigado pela visita!!\n#VOLTESEMPRE !!");
                System.exit(0);
            default :
                System.out.println("OPS, ALGO DEU ERRADO!!!!!");
                menu();
                break;

           
        }
    }
    public static void Cadastrar(){
       

        System.out.println("\n----------------------------------------");
        System.out.println("\nSeja Bem Vindo!!");
        System.out.println("\nDigite Seu CPF ");
        int cpf = entrada.nextInt();
        entrada.nextLine();
        System.out.println("\nDigite seu Nome");
        String nome= entrada.nextLine();
        System.out.println("\nDigite seu endereço");
        String endereco = entrada.nextLine();
        System.out.println("\n----------------------------------------");
        

        cadastroCliente.adicionarCliente(new Cliente(cpf, nome, endereco));
        System.out.println("\nCadastrado com sucesso!!");
        System.out.println("\nSEJA BEM VINDO!!!");
        menu();
    }
    public static void Produtos(){
        System.out.println("\n----------------------------------------");
        cadastraProduto.verProdutos();
        System.out.println("\n----------------------------------------");


        menu();
    }
    public static void comprar(){
        System.out.println("\n----------------------------------------");
        cadastraProduto.verProdutos();
        System.out.println("\n----------------------------------------");
        System.out.println();
        System.out.println("\nDIgite ID do produto");
        int id = entrada.nextInt();
        Produto produto = cadastraProduto.procurarProduto(id);
        if(produto==null){
            System.out.println("\nNão encontrado");
        }else{
            System.out.println("\nDigite quantidade desejada ");
            int quantidade = entrada.nextInt();
            carrinho.adicionarProduto(produto, quantidade);
        }
        System.out.println("\nAdicionado ao carrinho");
        System.out.println("\n----------------------------------------");
        System.out.println("Produtos no seu carrinho\n");
        carrinho.listarCarrinho();
        System.out.println("\n----------------------------------------");
        System.out.println("\nDeseja efetuar outra compra\n1--sim\n2--Não ");
        int op = entrada.nextInt();
        if(op==1){
            comprar();
        }
        if(op == 2){
            System.out.println("\nAdicionado ao carrinho");
            menu();
        }
       
      
    }
    public static void Vercarrinho(){

        System.out.println("\n----------------------------------------");
        carrinho.listarCarrinho();
        System.out.println("\n----------------------------------------");
        menu();
    }

    public static void  removerProduto(){
        System.out.println("\n----------------------------------------");
        System.out.println("Digite  o id do produto : ");
        int id = entrada.nextInt();
        Produto produto= cadastraProduto.procurarProduto(id);
        if(id==produto.getId()){
            System.out.println("Digite a quantidade ");
            int qtd = entrada.nextInt();
            carrinho.removerProduto(produto, qtd);
        }
        menu();
    }
    public static void pagamento(){
        boolean vazio= carrinho.Carrinhovazio();
        if(vazio==true){
            System.out.println("Carrinho vazio efetue uma Compra");
            comprar();
        }else{
        
            System.out.println("\n----------------------------------------");
            System.out.println("\nDigite seu CPF");
            int cpf = entrada.nextInt();
            Cliente cliente = cadastroCliente.encontrarCliente(cpf);
            if(cliente == null){
                System.out.println("\n----------------------------------------");
                System.out.println("Você ainda não tem casatro?");
                System.out.println("Cadastre-se agora!!!\n   Aproveite nosso desconto de 10% !!!");

                System.out.println("\n----------------------------------------");
                System.out.println("Deseja efetuar  Cadastro!!\n1--sim\n2--Não ");
                int op = entrada.nextInt();
                    if(op ==1 ){
                        Cadastrar();
                    }
                    if(op==2){
                        System.out.println("\n----------------------------------------");
                        carrinho.listarCarrinho();
                        System.out.println("\n----------------------------------------");
                        carrinho.ValorToatal();
                        System.out.println("\n----------------------------------------");
                        System.out.println("|            EFETUAR PAGAMENTO           |");
                        System.out.println("\n|           1 --------CONFIRMAR");
                        System.out.println("\n|           2 --------CANCELAR ");
                        int escolha = entrada.nextInt();
                            if(escolha==1){ 
                                carrinho.apagarCarrinho();
                                System.out.println("\nOBRIGADO PELA PREFERÊNCIA");
                                System.out.println("\n|     TIO-ZÉ AGRADECE   |");
                                System.out.println("\n----------------------------------------");
                            menu();
                            }
                            if(escolha==2){
                                System.out.println("Compra Cancelada !!");
                                carrinho.apagarCarrinho();
                                menu();

                            }
                    }
                    
                }else{
                    System.out.println("\n----------------------------------------");
                        System.out.println("Olá "+ cliente.getNome());
                        System.out.println("\n"+cliente.toString());
                        System.out.println("\n----------------------------------------");
                        carrinho.listarCarrinho();
                        System.out.println("\n----------------------------------------");
                        carrinho.listarCarrinhodesconto();
                        System.out.println("\n----------------------------------------");
                        System.out.println("|            EFETUAR PAGAMENTO           |");
                        System.out.println("\n|           1 --------CONFIRMAR");
                        System.out.println("\n|           2 --------CANCELAR ");
                        int escolha = entrada.nextInt();
                            if(escolha==1){ 
                                carrinho.apagarCarrinho();
                                System.out.println("\nOBRIGADO PELA PREFERÊNCIA");
                                System.out.println("\n|     TIO-ZÉ AGRADECE   |");
                                System.out.println("\n----------------------------------------");
                            menu();

                            }
                            if(escolha==2){
                                System.out.println("Compra Cancelada !!");
                                carrinho.apagarCarrinho();
                                menu();

                            }



                   }

                }
                


         }




    }

