public class Customer {
    private static int contador= 1;
    
    
    private String nome;
    private String cpf;
   

    public Customer(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        contador = contador +1;
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



    public String toString(){
        return "\n Nome: " + this.getNome() +
               "\n CPF : " + this.getCpf();
            }
}
