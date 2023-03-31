public class Customer {
    private String nome;
    private int cpf;
    private String email;
    private String endereco;
    private int distancia;

    public Customer(String nome, int cpf, String email, String endereco, int distancia) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.distancia = distancia;
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

   
    public String getendereco() {
        return endereco;
    }
    public void setendereco(String endereco) {
        this.endereco = endereco;
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
               "\nEndereço: " + this.getendereco() +
               "\nDistancia para loja : " + this.getDistancia() + "\n";
    }
}
