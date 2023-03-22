public class Customer {
    private static int contador= 1;
    
    
    private String nome;
    private String cpf;
    private String email;
    private String enderco;
    private int distancia;

    public Customer(String nome, String cpf, String email, String enderco, int distancia) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.enderco = enderco;
        this.distancia = distancia;
        contador =+1;
    }

    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCpf() {
        return cpf;
    }

   
    public void setCpf(String cpf) {
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

    public String toString(){
        return "\n Nome: " + this.getNome() +
               "\n RG : " + this.getCpf() + 
               "\n Email : " + this.getEmail()+
               "\n Endereço: " + this.getNome() +
               "\n Distancia para loja : " + this.getDistancia();

            }
}
