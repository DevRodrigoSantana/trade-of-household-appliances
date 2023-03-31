public class Customer {
    private static int contador= 1;
    
    
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private int distancia;

<<<<<<< Updated upstream
    public Customer(String nome, String cpf, String email, String enderco, int distancia) {
=======
    public Customer(String nome, int cpf, String email, String endereco, int distancia) {
>>>>>>> Stashed changes
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.distancia = distancia;
        contador =+1;
    }

    public String getNome() {
        return nome;
    }
<<<<<<< Updated upstream

   
=======
>>>>>>> Stashed changes
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCpf() {
        return cpf;
    }
<<<<<<< Updated upstream

   
    public void setCpf(String cpf) {
=======
    public void setCpf(int cpf) {
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
    public String toString(){
        return "\n Nome: " + this.getNome() +
               "\n CPF : " + this.getCpf() + 
               "\n Email : " + this.getEmail()+
               "\n Endereço: " + this.getNome() +
               "\n Distancia para loja : " + this.getDistancia();

            }
=======
    public String info(){
        return "\nNome Cliente: " + this.getNome() +
               "\nCPF : " + this.getCpf() + 
               "\nEmail : " + this.getEmail() +
               "\nEndereço: " + this.getendereco() +
               "\nDistancia para loja : " + this.getDistancia() + "\n";
    }
>>>>>>> Stashed changes
}
