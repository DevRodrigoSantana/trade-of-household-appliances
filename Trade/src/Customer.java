public class Customer {
    private static int contador= 1;
    
    private String nome;
    private int cpf;
    private String email;
    private String enderco;
    private int distancia;

    public Customer(String nome, int cpf, String email, String enderco, int distancia) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.enderco = enderco;
        this.distancia = distancia;
        contador = contador + 1;
    }

    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public int getCpf() {
        return cpf;
    }

   
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

   
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getEnderco() {
        return enderco;
    }

   
    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    
    public int getDistancia() {
        return distancia;
    }

   
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String info(){
        return "\nNome Cliente: " + this.getNome() +
               "\nCPF : " + this.getCpf() + 
               "\nEmail : " + this.getEmail() +
               "\nEndereço: " + this.getNome() +
               "\nDistancia para loja : " + this.getDistancia() + "\n";
    }
}
