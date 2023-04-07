import java.util.ArrayList;

public class CadastroCliente {

    private ArrayList<Cliente> listaDeClientes;
    

    public CadastroCliente(){
        listaDeClientes= new ArrayList<>();
    }
    
    public void adicionarCliente(Cliente cliente){
        listaDeClientes.add(cliente);

    }
    public  void removerCliente(Cliente cliente){
        listaDeClientes.remove(cliente);

    }
    public Cliente encontrarCliente(int id){
        for(Cliente cliente: listaDeClientes){
            if(cliente.getCPF()==id){
            return cliente;
            }
         }
         return null;
    }
}