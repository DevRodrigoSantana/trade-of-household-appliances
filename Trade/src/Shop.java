import java.util.*;
import java.util.ArrayList;


public class Shop {
    static Scanner entrada  = new Scanner (System.in);
    static ArrayList<Customer> listaClientes;


    public static void main(String[] args) throws Exception {
       listaClientes = new ArrayList<Customer>();
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